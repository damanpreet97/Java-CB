package june21recursion;

import java.util.*;

public class displayrev {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = { 55, 11, 33, 44 };
		displayrev(arr, 0);
	}

	public static void displayrev(int[] arr, int vidx) {
		if (vidx == arr.length) {
			return;
		}
		displayrev(arr, vidx + 1);
		System.out.print(arr[vidx]+" ");
	}
}
