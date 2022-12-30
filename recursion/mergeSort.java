import java.util.*;
import java.io.*;
class mergeSort{
	public static void main(String []args){
		int a[]={9,8,7,6,5,4,3,2,1};
		//int size=9;
		System.out.println("hello.....");
		mergeSorting(a,0,a.length-1);
		System.out.println("after Sorting.....");
		for(int i=0;i<8;i++){
			System.out.println(a[i]);
	}
		
		}
		public static void mergeSorting(int arr[],int l,int r){
			if(l<r){
				int mid=(l+r)/2;
				mergeSorting(arr,l,mid);
				mergeSorting(arr,mid+1,r);
				merge(arr,l,mid,r);
			}
		}
		public static void merge(int a[],int l,int mid,int r){
			int i=0,j=mid+1,temp;
			while(i<=l && j<=r){
				if(a[i]<a[j]){i++;}
				else{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					j++;
				}
				//D:\myCoding\recursion>
			}
		}
	
	
}