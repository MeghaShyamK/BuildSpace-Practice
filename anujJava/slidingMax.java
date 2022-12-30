import java.util.*;
import java.io.*;
class slidingMax{
    public static void main(String []args){
        int ar[]={7,6,5,7,3,4,5,2};
        ArrayList<Integer> ans=solve(ar,ar.length,3);
        System.out.println(ans);
    }
    static ArrayList<Integer> solve(int a[],int n,int k){
        Deque<Integer> q= new ArrayDeque<>();
        ArrayList<Integer> ans =new ArrayList<>();
        int i;
        for(i=0;i<k;i++){
            while(!q.isEmpty() && a[i]>=q.peekLast())
                q.pollLast();
            q.offerLast(a[i]);
        }
        ans.add(q.peekFirst());
        for(;i<n;i++){
            if(!q.isEmpty()&& a[i-k]==q.peekFirst() ){
                q.pollFirst();
            }
            while(!q.isEmpty() && a[i]>=q.peekLast()){
                q.pollLast();
            }
            q.offerLast(a[i]);
            ans.add(q.peekFirst());

        }
        return ans;
    }
}