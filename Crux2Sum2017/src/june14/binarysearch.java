package june14;

import java.util.Scanner;

public class binarysearch {

	public static Scanner scn= new Scanner(System.in);

	public static void main(String[] args) {
		int arr[]= takeInput();
		//	System.out.println("Enter the nmber to be searched");
			int item=scn.nextInt();
	        				System.out.println(binarysrch(arr,item));
		}
	public static int[] takeInput(){
		//System.out.println("Enter the size of the array");
		int n = scn.nextInt();
		int rv[]=new int[n];
		for(int i=0;i<rv.length;i++){
			//System.out.println("enter the value for "+i+"th element");
		rv[i]=scn.nextInt();
		}
	return rv;
	}	

	public static int binarysrch(int[] arr, int a) {
		int l = 0, u = arr.length - 1, mid = 0;
		while (l <= u) {
			mid = (l + u) / 2;
			if (arr[mid] == a) {
				return mid;
			} else if (arr[mid] < a) {
				l = mid + 1;
			} else
				u = mid - 1;
		}
		return -1;
	}
}
