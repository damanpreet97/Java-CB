package june21recursion;

import java.util.Scanner;

public class firstindex {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String args[]) {
		int[] arr = takeInput();
		int item = scn.nextInt();
		System.out.println(firstIndex(arr, item, 0));
	}

	public static int[] takeInput() {
		// System.out.println("Enter the size of the array");
		int n = scn.nextInt();
		int rv[] = new int[n];
		for (int i = 0; i < rv.length; i++) {
			// System.out.println("enter the value for "+i+"th element");
			rv[i] = scn.nextInt();
		}
		return rv;
	}

	public static int firstIndex(int[] arr, int num, int si) {
		if (si == arr.length) {
			return -1;
		}
		if (arr[si] == num) {
			return si;
		} else
			return firstIndex(arr, num, si+1);
	}

}
