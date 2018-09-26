package June9;

import java.util.Scanner;

public class sbtodec {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the number");
		int n = scn.nextInt();
		int sb =scn.nextInt();
		int rem,num=0,pow=1;
	  while(n!=0){
		  rem=n%10;
		  n=n/10;
		  num=num+rem*pow;
		  pow=pow*sb;
	  }
	System.out.println(num);
	
	}

}
