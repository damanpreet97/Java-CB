package assgn4arrays;
import java.util.*;
public class sumofarrays {
public static Scanner scn= new Scanner(System.in);
	public static void main(String[] args) {
		int arr1[] = takeInput();
		int arr2[]=takeInput();
		// int item= scn.nextInt();
		sumofarray(arr1,arr2);
	}

	public static int[] takeInput() {
		System.out.println("Enter the size of the array");
		int n = scn.nextInt();
		int rv[] = new int[n];
		for (int i = 0; i < rv.length; i++) {
			System.out.println("enter the value for " + i + "th element");
			rv[i] = scn.nextInt();
		}
		return rv;
	}
	public static void sumofarray(int[] arr1,int []arr2){
		int i=arr1.length-1,j=arr2.length-1,s=0,carry=0;
		int[] sum= new int[arr1.length>arr2.length ? arr1.length+1:arr2.length+1];
		int k=sum.length-1;
		while(k>=0){
			
			if (i>=0){
				s+=arr1[i];
			}
			if(j>=0){
				s+=arr2[j];
			}
			sum[k]=s%10;
			carry=s/10;
		i--;
		j--;
		k--;
		}
		for(i=0;i<sum.length;i++){
			if(i==0&&sum[i]==0){
				continue;
			}
			System.out.print(sum[i]+"\t");
		}
	}
}
