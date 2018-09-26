package june23;

import java.util.*;

public class arraylist {
	//
	// public static void main(String[] args) {
	// Integer[] one = { 1, 1, 2, 2, 2, 3, 5 };
	// Integer[] two = { 1, 1, 1, 2, 2, 4, 5 };
	//
	// ArrayList<Integer> inter = getIntersection(one, two);
	// System.out.println(inter);
	// }
	//
	// public static ArrayList<Integer> getIntersection(Integer[] one, Integer[]
	// two) {
	// ArrayList<Integer> list = new ArrayList<>();
	// int i = 0, j = 0;
	// while (i < one.length && j < two.length) {
	// if (one[i] == two[j]) {
	// list.add(one[i]);
	// i++;
	// j++;
	// } else {
	// if (one[i] < two[j]) {
	// i++;
	// } else
	// j++;
	// }
	// }
	// return list;
	// }
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// System.out.println("Enter the size of the array");
		int n = scn.nextInt();
		Integer[] one = takeInput(n);
		Integer[] two = takeInput(n);
		bubblesort(one);
		bubblesort(two);
		ArrayList<Integer> inter = getIntersection(one, two);
		System.out.println(inter);
	}

	public static void bubblesort(Integer[] arr) {
		int counter = 1;
		while (counter < arr.length) {
			for (int i = 0; i < arr.length - counter; i++) {
				if (arr[i] > arr[i + 1]) {
					swap(arr, i, i + 1);
				}
			}
			counter++;
		}
		for (int val : arr) {
			System.out.println(val);
		}
	}

	public static void swap(Integer[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static Integer[] takeInput(int n) {
		Integer rv[] = new Integer[n];
		for (int i = 0; i < n; i++) {
			rv[i] = scn.nextInt();
		}
		return rv;
	}

	public static ArrayList<Integer> getIntersection(Integer[] one, Integer[] two) {
		ArrayList<Integer> list = new ArrayList<>();
		int i = 0, j = 0;
		while (i < one.length && j < two.length) {
			if (one[i] == two[j]) {
				list.add(one[i]);
				i++;
				j++;
			} else {
				if (one[i] < two[j]) {
					i++;
				} else
					j++;
			}
		}
		return list;
	}

}