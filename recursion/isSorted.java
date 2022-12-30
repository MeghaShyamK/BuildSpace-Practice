import java.util.*;
import java.io.*;
public class isSorted{
public static void main(String [] args){
	Scanner sc=new Scanner(System.in);
	int arr[]= new int [10];int i=0;
	while(i<10){
		arr[i]=sc.nextInt();i++;
	}
	/*ArrayList<Integer> ar=new ArrayList<>();
	int i;
	while(sc.hasNextInt()){
		i=sc.nextInt();
		ar.add(i);
	}*/
	if(isSorted1(arr,arr.length)){
		System.out.println("array is Sotred");
	}
	else System.out.println("Array is not Sorted");
	
	
}
static boolean isSorted1(int arr[],int size){
	if(size==0||size==1) return true;
	if(arr[size-2]>arr[size-1]) return false;
	else {
		size-=1;
		boolean flag=isSorted1(arr,size);
		return flag;
	}
} 
}