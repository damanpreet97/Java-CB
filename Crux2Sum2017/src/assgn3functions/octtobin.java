package assgn3functions;

import java.util.Scanner;

public class octtobin {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the octal number");
		int n = scn.nextInt();
	  int bin= octtobin(n);
	  System.out.println(bin);
	}	  
	 public static int octtobin(int n){ 
		int dec=octtodec(n);
		int num=dectobin(dec);
	return num;
}
public static int octtodec(int n){ 
		int rem,num=0,pow=1;
		  while(n!=0){
			  rem=n%10;
			  n=n/10;
			  num=num+rem*pow;
			  pow=pow*8;
		  }
		return num;
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
