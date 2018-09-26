package assgn3functions;

import java.util.Scanner;

public class log {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// System.out.println("enter the number");
		int x = scn.nextInt();
		int n = scn.nextInt();
		int val=log(x,n);
		System.out.println(val);
	}
public static int log(int a,int b){
	int pow=0,c=1;
	while(c!=a){
		c*=b;
		pow++;
	}
	return pow;
	}

}
