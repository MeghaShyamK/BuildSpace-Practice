import java.util.*;
import java.io.*;
class subSet{
	public static void main(String[] args){
		int a[3]={1,2,3};
		int n=3;
		
		int index=0;
		//int out[]=new int[n];
		ArrayList<Integer> out=new ArrayList<>();
		ArrayList<Integer> ans=new ArrayList<>();
		solve(a,out,index,ans);
		System.out.println(ans);
	}
	static void solve(int a[],ArrayList<Integer> out,int index,ArrayList<Integer> ans){
		if(index>=a.length){
			ans.add(out);
			return;
		}
		solve(a,out,index+1,ans);
		
		int ele=a[index];
		out.add(ele);
		solve(a,out,index+1,ans);
		
	}
}