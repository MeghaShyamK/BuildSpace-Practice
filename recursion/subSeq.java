import java.util.*;
import java.io.*;

class subSeq{
    public static void main(String [] args){
        // System.out.println("Hello");
        String str="abc";
        String[] ans= powerSet(str);
        
    }
    public static String[] powerSet(String s){
        if(s.length()==0){
            return {" "};
        }
        String small[]=powerSet(s.substring(1));
        String [] ans=new String[2*small.length];
        int i=0;
        for(int j=0;j<small.length;j++){
            ans[i]=s.charAt(0)+small[j];
            i++;
        }
        for(int k=0;k<small.length;k++){
            ans[i]=small[k];
            i++;
        }

        return ans;
    }
}