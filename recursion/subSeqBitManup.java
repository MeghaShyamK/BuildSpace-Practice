import java.util.*;
import java.io.*;
class subSeqBitManup{
    public static void main(String[] args){
        String n="abc";
        String s[]=new String[n.length()];
        String sub="";

        int i,j;
        for(i=0;i<(1<<n)-1;i++){
            sub=" ";
            for(j=0;i<n.length();i++){
                if(n&(1<<i)){
                    sub+=s.charAt(i);
                }
            }
            System.out.println(sub);
        }

    }
}