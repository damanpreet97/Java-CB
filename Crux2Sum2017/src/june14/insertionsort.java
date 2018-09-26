package june14;

import java.util.Scanner;

public class insertionsort {
public static Scanner scn= new Scanner(System.in);
	public static void main(String[] args) {
		int arr[]= takeInput();
	     insertionsort(arr);
	     }
	     public static int[] takeInput(){
	     	//	System.out.println("Enter the size of the array");
	     		int n = scn.nextInt();
	     		int rv[]=new int[n];
	     		for(int i=0;i<rv.length;i++){
	     	//		System.out.println("enter the value for "+i+"th element");
	     		rv[i]=scn.nextInt();
	     		}
	     	return rv;
	     	}


	public static void insertionsort(int[] arr) {
		int counter = 1;
		while (counter < arr.length) {
			for (int i = counter; i > 0; i--) {
				if (arr[i - 1] > arr[i]) {
					swap(arr, i - 1, i);
				} else {
					break;
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
