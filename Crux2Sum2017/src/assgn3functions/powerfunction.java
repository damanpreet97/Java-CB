package assgn3functions;

import java.util.Scanner;

public class powerfunction {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// System.out.println("enter the number");
		int x = scn.nextInt();
		int n = scn.nextInt();
		int val=power(x,n);
		System.out.println(val);
	}
public static int power(int a,int b){
	int pow=1,i=1;
	while(i<=b){
		pow=pow*a;
		i++;
	}
	return pow;
}
}
