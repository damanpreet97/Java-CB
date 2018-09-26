package june21recursion;

import java.util.Scanner;

public class ispalindrome {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = { 55, 11, 33,33, 11, 55 };
//		int item=scn.nextInt();
		System.out.println(ispallindrome(arr, 0, arr.length-1));
	}

	public static boolean ispallindrome(int[] arr, int svidx, int evidx) {
		if(svidx>=evidx){
			return true;
		}
		if (arr[svidx] == arr[evidx]) {
			return ispallindrome(arr,svidx+1,evidx-1);
		}
		else return false;
	}

}
