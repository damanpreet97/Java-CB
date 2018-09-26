package assgn3functions;

import java.util.Scanner;

public class isarmstrong {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//System.out.println("enter the number");
		int n = scn.nextInt();
	boolean b=isarmstrong(n);
	System.out.println(b);
	}
public static boolean isarmstrong(int n){
	boolean val=false;
	int c=n,rem=0,sum=0;
	while(c!=0){
		rem=c%10;
	c=c/10;
	sum=sum+(int)Math.pow(rem, 3);
	}
	if (sum==n){
		val=true;
	}
	return val;
}
}
