package assgn3functions;

import java.util.Scanner;

public class series {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// System.out.println("enter the number");
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		series(n1,n2);
	}
public static void series(int a, int b){
	int i=1,n=1,val=0;
	while(i<=a){
		val= 3*n+2;
		if(val%b!=0){
			System.out.println(val);
			i++;
		}
		n++;
	}
}
}
