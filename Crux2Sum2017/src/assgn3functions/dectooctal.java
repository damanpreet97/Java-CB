package assgn3functions;

import java.util.Scanner;

public class dectooctal {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the decimal number");
		int n = scn.nextInt();
	  int oct= dectooct(n);
	  System.out.println(oct);
	}	  
	 public static int dectooct(int n){ 
		int rem,num=0,pow=1;
	  while(n!=0){
		  rem=n%8;
		  n=n/8;
		  num=num+rem*pow;
		  pow=pow*10;
	  }
	return num;
	}

}
