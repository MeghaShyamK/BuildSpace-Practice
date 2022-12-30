import java.util.*;
import java.io.*;
class nextSmall{
    public static void main(String[] args){
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        // int ar[]=Integer.parseInt(br.readLine().split(" "));
        // System.out.println(ar.length);
        ArrayList<Integer> a=new ArrayList<Integer>();
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            a.add(sc.nextInt());

        }
        System.out.println(a.size());
        ArrayList<Integer> l=smallOnLeft(a);
        ArrayList<Integer> r=smallOnRight(a);
        System.out.println(l);
        Collections.reverse(r);
        // System.out.println(Collections.reverse(r));
        System.out.println(r);
    
    }







         public static ArrayList<Integer> smallOnLeft(ArrayList<Integer> a){
            Stack<Integer> st=new Stack<>();
            ArrayList<Integer> ans=new ArrayList<>();

            for(int i=0;i<a.size();i++){
                while(!st.isEmpty() && st.peek()>=a.get(i)){
                    st.pop();
                }
                if(st.isEmpty()){
                    ans.add(-1);

                }
                else{
                    ans.add(st.indexOf(st.peek()));
                }
                st.push(a.get(i));
            }
            // st.push(a.get(0));
            // ans.add(-1);
            // for(int i=1;i<a.size();i++){

            //     if(at.peak()<a.get(i)){
            //         ans.add(a.peak())
            //     }
            //     else{
            //         while(st.peek()>=a.get(i) && !st.isEmpty())
            //     }
            // }
            return ans;
            
        } 
        public static ArrayList<Integer> smallOnRight(ArrayList<Integer> a){
            Stack<Integer> st=new Stack<>();
            ArrayList<Integer> ans=new ArrayList<>();

            for(int i=a.size()-1;i>=0;i--){
                while(!st.isEmpty() && st.peek()>=a.get(i)){
                    st.pop();
                }
                if(st.isEmpty()){
                    ans.add(-1);

                }
                else{
                    ans.add(st.indexOf(st.peek()));
                }
                st.push(a.get(i));
            }  
            return ans;
            
        }  
    }

    
