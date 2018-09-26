package june21recursion;

import java.util.Scanner;

public class lastindex {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = { 55, 11, 66, 33, 66, 44, 33, 64 };
		int item = scn.nextInt();
		System.out.println(lastidx(arr, 0, item));
	}

	public static int lastidx(int[] arr, int vidx, int item) {
		if (vidx == arr.length) {
			return -1;
		}
		int lindx = lastidx(arr, vidx + 1, item);
		if (lindx == -1) {
			if (arr[vidx] == item) {
				return vidx;
			} else
				return -1;
		} else
			return lindx;
	}

}
