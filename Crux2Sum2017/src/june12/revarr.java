package june12;

import java.util.Scanner;

public class revarr {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int arr[] = takeInput();
		rev(arr);
		display(arr);
	}

	public static void rev(int[] arr) {
		int left = 0;
		int right = arr.length - 1;
		while (left <= right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
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
	public static void display(int[] arr) {
		for (int val : arr) {
			System.out.print(val + "\t");
		}
	}
}
