package assgn4arrays;

import java.util.Scanner;

public class target {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int arr[] = takeInput();
		int target = scn.nextInt();
		sumtotarget(arr, target);
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

	public static void sumtotarget(int[] arr, int t) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] + arr[j] == t) {
					System.out.println(arr[i] + "," + arr[j]);
				}
			}
		}
	}
}
