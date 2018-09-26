package assgn3functions;

import java.util.Scanner;

public class armstrongnumbers {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// System.out.println("enter the number");
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		armstrong(n1, n2);
	}

	public static void armstrong(int a, int b) {
		while (a <= b) {
			int c=a,rem=0,sum=0;
			while(c!=0){
				rem=c%10;
			c=c/10;
			sum=sum+(int)Math.pow(rem, 3);
			}
			if (sum==a){
				System.out.println(a);;
			}
			a++;
		}
	}
}
