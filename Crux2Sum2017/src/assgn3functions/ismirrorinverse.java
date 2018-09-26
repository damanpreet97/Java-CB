package assgn3functions;

import java.util.Scanner;

public class ismirrorinverse {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//System.out.println("enter the number");
		int n = scn.nextInt();
		int inv=inverse(n);
		boolean b=false;
		
		if(inv==n){
			b=true;
			}
		System.out.println(b);		
	}
	public static int inverse(int n){
	int place=1, inv=0;
		while(n!=0){
			int rem=n%10;
			n=n/10;
			inv=inv + place*((int)Math.pow(10, rem-1));
			place++;
		}
		return inv;
	}
	}

