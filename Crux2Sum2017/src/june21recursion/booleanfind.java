package june21recursion;

import java.util.Scanner;

public class booleanfind {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = { 55, 11, 33, 66, 44 };
		int item=scn.nextInt();
		System.out.println(find(arr, 0, item));
	}

	public static boolean find(int[] arr, int vidx, int item) {
		if (vidx == arr.length) {
			return false;
		}
		if (arr[vidx] == item) {
			return true;
		}
		else return find(arr, vidx + 1, item);
	}
}
