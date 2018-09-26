package assgn3functions;

import java.util.Scanner;

public class upperlower {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// System.out.println("enter the number");
		//scn.useDelimiter("");
		char c = scn.nextLine().charAt(0);
		upperlower(c);
	}
public static void upperlower(char a){
	if(a>=97&&a<=122){
		System.out.println("lowercase");
	}
	else if(a>=65&&a<=90){
		System.out.println("UPPERCASE");
	}
	else System.out.println("Invalid");
}
}
