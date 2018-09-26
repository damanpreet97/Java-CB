package assgn6reccursion;

import java.util.Scanner;

public class sumofn {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		//int[] arr = { 55, 11,66, 33, 66, 44,33,64 };
		int n=scn.nextInt();
		System.out.println(sumton(n));
	}
public static int sumton(int n){
	if (n==0){
		return 0;
	}
int sum= sumton(n-1)+n;	
return sum;
}
}
