package assgn4arrays;

import java.util.Scanner;

public class ismirrorinverse {
public static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
int[] arr= takeInput();
//display(inverse(arr));
System.out.println(ismirrorinverse(arr));
	}
	public static boolean ismirrorinverse(int[] arr){
		int inv[]=new int[arr.length];
		for(int i=0;i<arr.length;i++){
			inv[arr[i]]=i;
		}	
		for(int j=0;j<arr.length;j++){
		if(arr[j]==inv[j]){
				continue;
			}
			else return false;
		}
		return true;
	}
	public static int[] takeInput(){
		System.out.println("Enter the size of the array");
		int n = scn.nextInt();
		int rv[]=new int[n];
		for(int i=0;i<rv.length;i++){
			System.out.println("enter the value for "+i+"th element");
		rv[i]=scn.nextInt();
		}
	return rv;
	}	
}
