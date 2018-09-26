package june12;

import java.util.Scanner;

public class roatationofarray {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = takeInput();
		int rot[] = rotate(arr);
		display(rot);
	}

	public static int[] rotate(int[] arr) {
		System.out.println("Enter the number of roations");
		int k = scn.nextInt();
		int rot[] = new int[arr.length];
		int rindx = 0;
		for (int i = arr.length - k; i < arr.length; i++) {
			rot[rindx] = arr[i];
			rindx++;
		}
		for (int i = 0; i < arr.length - k; i++) {
			rot[rindx] = arr[i];
			rindx++;
		}
		return rot;
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
