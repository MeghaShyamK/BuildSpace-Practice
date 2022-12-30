import java.io.*;
import java.util.*;
class sieveOfErath{
    public static void main(String args[]){
        boolean[] prime=solve(20);
        for(int k=0;k<=20;k++){
            System.out.println(prime[k]);
        }
    }
    public static boolean[] solve(int n){
        boolean[] isPrime=new boolean[20+1];
        Arrays.fill(isPrime,true);
        isPrime[0]=false;
        isPrime[1]=false;
        for(int i=2;i*i<=n;i++){
            for(int j=2*i;j<=n;j=j+i){
                isPrime[j]=false;
            }
        }
        return isPrime;
    }
}