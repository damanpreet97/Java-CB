package assgn3functions;

import java.util.Scanner;

public class gcdoftwonumbers {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// System.out.println("enter the number");
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		int ans=gcd(n1, n2);
	System.out.println(ans);
	}
public static int gcd(int a, int b){
	int rem=1, div=a,divd=b;
while (rem!=0){
	rem=divd%div;
	divd=div;
	div=rem;
}
return divd;
}
}