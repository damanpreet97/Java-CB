package june21recursion;

import java.util.Scanner;

public class max {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = { 44, 11, 33, 66, 77 };
		System.out.println(maxi(arr, 0, arr[0]));

	}

	public static int maxi(int[] arr, int vidx, int maxval) {
		if (vidx == arr.length) {
			return maxval;
		}
		if (arr[vidx] > maxval) {
			maxval = arr[vidx];
		}
		return maxi(arr, vidx + 1, maxval);
	}

}
