package June9;

import java.util.Scanner;

public class dectobin {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the decimal number");
		int n = scn.nextInt();
		int bin= dectobin(n);
		System.out.println(bin);	
	}
		public static int dectobin(int n){
			int rem=0,bin=0,pow=1;
		  while(n!=0){
			  rem=n%2;
			  n=n/2;
			  bin=bin+rem*pow;
			  pow=pow*10;
		  }
		  return bin;
		}
}
