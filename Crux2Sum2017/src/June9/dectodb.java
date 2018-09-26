package June9;

import java.util.Scanner;

public class dectodb {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the decimal number");
		int n = scn.nextInt();
		int db =scn.nextInt();
		int rem,num=0,pow=1;
	  while(n!=0){
		  rem=n%db;
		  n=n/db;
		  num=num+rem*pow;
		  pow=pow*10;
	  }
	System.out.println(num);
	
	}

}
