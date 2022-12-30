import java.util.*;
import java.io.*;
class permutations{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //ArrayList<Integer> a=new ArrayList<>();
        int n=sc.nextInt();
        int total=1;
        String s="";
        String a="";
        for(int i=0;i<n;i++){
            // a.add(sc.nextInt);
            s+=Integer.toString(sc.nextInt());

        }
        while(n>0){
            total*=n;
            n-=1;

        }
        ArrayList<String> ans=new ArrayList<>();
        System.out.println(s);
        noOfPermut(s,0,s.length()-1,ans);
        //Collections.sort(ans);
        System.out.println(ans);
        int x=nosAtTheirPos(ans);
        System.out.println(total-x);



    }
    static int nosAtTheirPos(ArrayList<String> str){
        int c=0;
        for(int i=0;i<str.size();i++){
            String temp=str.get(i);
            // for(int j=0;j<temp.length();j++){
            //     if(temp.charAt(i)==)
            // }
            if(temp.charAt(0)=='1') c++;
            else if(temp.charAt(1)=='2') c++;
            else if(temp.charAt(2)=='3') c++;
            else if(temp.charAt(3)=='4') c++;
            else if(temp.charAt(4)=='5') c++;

        }
        return c;
    }
    static void  noOfPermut(String s,int l,int r,ArrayList<String> ans){
        // if(i==s.length()){
        //     ans.add(a);
        //     return;

        // }
        // noOfPermut(s,i+1,a+s.charAt(i),ans);
        // noOfPermut(s,i+1,a,ans);
        if(l==r){
            ans.add(s);
            return;
        }
        for(int i=l;i<=r;i++){
            s=swap(s,l,i);
            noOfPermut(s,l+1,r,ans);
            s=swap(s,l,i);
        }


    }
    static String swap(String s,int l,int r){
        StringBuilder st=new StringBuilder(s);
        st.setCharAt(l,s.charAt(r));
        st.setCharAt(r,s.charAt(l));
        return st.toString();
        
    }
}