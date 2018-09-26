package assgn4arrays;

import java.util.Scanner;

public class triplettarget {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int arr[] = bubblesort(takeInput());
		int target = scn.nextInt();
		sumtotarget(arr, target);
	}

	public static int[] takeInput() {
		System.out.println("Enter the size of the array");
		int n = scn.nextInt();
		int rv[] = new int[n];
		for (int i = 0; i < rv.length; i++) {
			System.out.println("enter the value for " + i + "th element");
			rv[i] = scn.nextInt();
		}
		return rv;
	}

	public static void sumtotarget(int[] arr, int t) {
		for (int i = 0; i < arr.length - 2; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					if (arr[i] + arr[j] + arr[k] == t) {
						System.out.println(arr[i] + "," + arr[j] + " and " + arr[k]);
					}
				}
			}
		}
	}

	public static int[] bubblesort(int[] arr) {
     		int counter = 1;
     		while (counter < arr.length) {
     			for (int i = 0; i < arr.length - counter; i++) {
     				if (arr[i] > arr[i + 1]) {
     					swap(arr, i, i + 1);
     				}
     			}
     			counter++;
     		}
     	return arr;
	}
     		public static void swap(int[] arr, int i, int j) {
	     		int temp = arr[i];
	     		arr[i] = arr[j];
	     		arr[j] = temp;
	     	}
//     	public static void sort(int a, int b, int c){
//	    int min=a,max=b,med=c;
//	    if (b<a&& b<c&&a>c){
//	        min=b;
//	        max=a;
//	    }
//	    else if(b<a&& b<c&&c>a){
//	    min=b;
//	    max=c;
//	    med=a;
//	}else if(a<b&& a<c&&c>b){
//	    max=c;
//	    med=b;
//	}else if(c<a && c<b &&a>b){
//	    max=a;
//	    min=c;
//	    med=b;
//}else if(c<a&& c<b&&b>a){
//    min=c;
//    med=a;
//}
//System.out.println(min + ", " + med + " and " + max);
//}
}
