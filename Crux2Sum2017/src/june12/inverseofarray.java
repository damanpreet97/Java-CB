package june12;

import java.util.Scanner;

public class inverseofarray {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = takeInput();
		display(inverse(arr));
	}

	public static int[] inverse(int[] arr) {
		int inv[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			inv[arr[i]] = i;
		}
		return inv;
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

	public static void display(int[] arr) {
		for (int val : arr) {
			System.out.print(val + "\t");
		}
	}
}
