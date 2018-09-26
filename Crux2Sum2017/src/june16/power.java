package june16;

import java.util.Scanner;

public class power {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int x= scn.nextInt();
		int n=scn.nextInt();
		int pow=powr(x,n);
		System.out.println(pow);
	}
public static int powr(int x, int n){
	if (n==0){
		return 1;
	}
	int xpnm1=powr(x,n-1);
	int pow= xpnm1*x;
	return pow;	
}
}
