package assgn4arrays;

import java.util.*;

public class spiralclockwise {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// System.out.println("Enter the size of the array");
		int n = scn.nextInt();
		int m = scn.nextInt();
		int arr[][] = takeInput(n, m);
		spiraldisplayclock(arr);
	}

	public static void spiraldisplayclock(int arr[][]) {
		int cmax = arr[0].length - 1, rmin = 0, rmax = arr.length - 1, cmin = 0, col = 0, row = 0, count = 0;
		int tne = arr[0].length * arr.length;
		while (count < tne) {
			for (col = cmin; col <= cmax && count < tne; col++) {
				System.out.print(arr[row][col] + ", ");
				count++;
			}
			rmin++;
			col = cmax;
			for (row = rmin; row <= rmax && count < tne; row++) {
				System.out.print(arr[row][col] + ", ");
				count++;
			}
			cmax--;
			row = rmax;
			for (col = cmax; col >= cmin && count < tne; col--) {
				System.out.print(arr[row][col] + ", ");
				count++;
			}
			rmax--;
			col = cmin;
			for (row = rmax; row >= rmin && count < tne; row--) {
				System.out.print(arr[row][col] + ", ");
				count++;
			}
			cmin++;
			row = rmin;
		}
		System.out.println("End");
	}

	public static int[][] takeInput(int n, int m) {
		int rv[][] = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				// System.out.println("enter the value for " + i + "th
				// element");
				rv[i][j] = scn.nextInt();
			}
		}
		return rv;
	}
}
