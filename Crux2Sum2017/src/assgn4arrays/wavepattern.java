package assgn4arrays;

import java.util.Scanner;

public class wavepattern {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int m = scn.nextInt();
		int n = scn.nextInt();
		int arr[][] = takeInput(m, n);
		waveprint(arr);
	}

	public static int[][] takeInput(int m, int n) {
		// System.out.println("Enter the size of the array");
		int rv[][] = new int[m][n];
		for (int i = 0; i < rv.length; i++) {
			// System.out.println("enter the value for "+i+"th element");
			for (int j = 0; j < rv[0].length; j++) {
				rv[i][j] = scn.nextInt();
			}
		}
		return rv;
	}

	public static void waveprint(int[][] arr) {
		int row = 0, col = 0;
		for (row = 0; row < arr.length; row++) {
			if (row % 2 == 0) {
				for (col = 0; col < arr[0].length; col++) {
					System.out.print(arr[row][col] + ", ");
				}
			} else {
				for (col = arr[0].length - 1; col >= 0; col--) {
					System.out.print(arr[row][col] + ", ");
				}
			}
		}
		System.out.println("End");
	}

}
