package june14;

import java.util.Scanner;

public class selectionsort {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// System.out.println("enter the array");
		int[] arr = { 10, 20, 10, 60, 50 };
		selectionsort(arr);
	}

	public static void selectionsort(int[] arr) {
		int counter = 1;
		while (counter < arr.length) {
			for (int i = counter; i < arr.length; i++) {
				if (arr[counter - 1] > arr[i]) {
					swap(arr, counter - 1, i);
				}
			}
			counter++;
		}
		for (int val : arr) {
			System.out.print(val + "\t");
		}
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
