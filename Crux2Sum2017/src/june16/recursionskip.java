package june16;

import java.util.Scanner;

public class recursionskip {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
int n=scn.nextInt();		
PDIskip(n);
}
	public static void PDIskip(int n){
		 if (n==0){
			 return;
		 }
		 if(n%2!=0){
			 System.out.println("Hi " + n);
		 }
		PDIskip(n-1);
		if(n%2==0){
			System.out.println("Bye "+n);
		}
	}
}