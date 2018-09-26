package june12;

import java.util.Scanner;

public class arrays {
	public static Scanner scn= new Scanner(System.in);

	public static void main(String[] args) {
			int arr[]= takeInput();
			int max=arr[0];
			for(int i=1;i<arr.length;i++){
				if (max<arr[i]){
					max=arr[i];
				}
			}
		System.out.println("max is "+max);
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
public static void display(int[] arr){
for(int val:arr){
	System.out.print(val+"\t");
}
}
}
