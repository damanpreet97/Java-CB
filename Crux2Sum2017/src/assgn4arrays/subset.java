package assgn4arrays;

import java.util.Scanner;

public class subset {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int arr[] = takeInput();
		// int item= scn.nextInt();
		subs(arr);
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

	public static void subs(int[] arr) {
		int count = 0, rem = 0, temp = 0, i = 0;
		int total = (int) Math.pow(2, arr.length);
		while (count < total) {
			System.out.print("[");
			temp = count;
			i=0;
			while (temp != 0) {
				rem = temp % 2;
				temp = temp / 2;
				if (rem == 1) {
					System.out.print(arr[i]);
				}
				i++;
			}
			System.out.println("]");
		count++;
		}
	}
}
