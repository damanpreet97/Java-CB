package assgn3functions;

import java.util.Scanner;

public class sqrootprecision {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// System.out.println("enter the number");
		double n = scn.nextInt();
		double p = scn.nextInt();
		System.out.println(sqrootprecise(n, p));
	}

	public static double sqrootprecise(double n, double p) {
		double i = 0, inc = 1,div=1;
				int mult=1,count=0;
		while (count <= p) {
			while (i*i <= n) {
				i = i + inc;
			}
			i = i - inc;
			inc = inc * 0.1;
			count++;
			mult*=10;
			div=div*10.0;
		}
		return Math.round(i*mult)/div;
	}
}
