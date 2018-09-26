package assgn6reccursion;

import java.util.Scanner;

public class bubblesorting {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++){
			arr[i]=scn.nextInt();
		}
		bubblesort(arr, 0, 0);
		for (int val : arr) {
			System.out.print(val+"\t");
		}
	}

	public static void bubblesort(int[] arr, int vidx, int nssf) {
		if (nssf == arr.length - 1) {
			return;
		}
		if (vidx == arr.length - 1 - nssf) {
			bubblesort(arr, 0, nssf + 1);
			return;		
		}
		if (arr[vidx] > arr[vidx + 1]) {
			swap(arr, vidx, vidx + 1);
		}
		bubblesort(arr, vidx + 1, nssf);
		
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
