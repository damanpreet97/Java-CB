package june16;

import java.util.Scanner;

public class power2 {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int x= scn.nextInt();
		int n=scn.nextInt();
		int pow=powr2(x,n);
		System.out.println(pow);
	}
public static int powr2(int x, int n){
	int pow=0;
	if (n==0){
		return 1;
	}
	
	int xpnm1=powr2(x,n/2);
	if (n%2==0){
	 pow= xpnm1*xpnm1;
	}
	else{
		pow = xpnm1*xpnm1*x;
	}
	return pow;	
}

}
