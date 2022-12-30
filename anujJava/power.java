import java.io.*;
class power{
    public static void main(String args[]){
        int ans=solve(10,3);
        System.out.println(ans);
    }
    public static int solve(int a,int b){
        int ans;
        if(b==0){
            return 1;
        }
        if(b==1){
            return a;
        }
        ans=solve(a,b/2);
        if(b%2==0){
           return ans*ans;

        }
        else{
            return a*ans*ans;
            // return ans;

        }
    }
}