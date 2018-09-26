package assgn4arrays;

import java.util.Scanner;

public class isoneinverseofother {

public static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter the size of the array");
		int n = scn.nextInt();
		int[] arr= takeInput(n);
int[] inv=takeInput(n);
//display(inverse(arr));
System.out.println(ismirrorinverse(arr,inv));
	}
	public static boolean ismirrorinverse(int[] arr, int[] inv){
		//int inv[]=new int[arr.length];
		for(int i=0;i<arr.length;i++){
			if (inv[arr[i]]==i){
			continue;
		}	
			else return false;
		}
		return true;
	}
	public static int[] takeInput(int n){
			int rv[]=new int[n];
		for(int i=0;i<rv.length;i++){
			System.out.println("enter the value for "+i+"th element");
		rv[i]=scn.nextInt();
		}
	return rv;
	}	

}
