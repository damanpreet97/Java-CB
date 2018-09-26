package June9;

import java.util.Scanner;

public class bintodec {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the binary number");
		int n = scn.nextInt();
	int dec= bintodec(n);
	System.out.println(dec);
	}
	
	public static int bintodec(int n){
		int rem=0,dec=0,pow=1;
	  while(n!=0){
		  rem=n%10;
		  n=n/10;
		  dec=dec+rem*pow;
		  pow=pow*2;
	  }
	  return dec;
	}
}

