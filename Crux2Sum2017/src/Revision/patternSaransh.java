package Revision;

import java.util.Scanner;

public class patternSaransh {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		// System.out.println("enter the number");
		int n = scn.nextInt();
		print(n);
	}

	public static void print(int n) {
		int row = 1, col = 0, count = 0;
		// int i=0;
		// int
		int[] arr = { 0, 1, 2, 3, 4, 5,6 };
		while (row <= n) {
			col = 0;
			count = 0;

			int num = 0;
			int dig = 0, i = 0;

			while (count < row) {
				dig =0;
				for (i = 0; i <= count; i++) {
					dig = dig + arr[i];
				}

				num = (n * col) + row - dig;
				System.out.print(num + "\t");
				count++;
				col++;
			}
			System.out.println();
			row++;
		}

	}

}
