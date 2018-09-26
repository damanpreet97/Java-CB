package assgn3functions;

import java.util.Scanner;

public class countdigits {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int dig = scn.nextInt();
		int ans = countdigits(n, dig);
		int a,b,c=0;

		System.out.println(ans);

	}

	public static int countdigits(int a, int b) {
		int digits = 0;
		while (a != 0) {
			int rem = a % 10;
			a = a / 10;
			if (rem == b) {
				digits++;
			}
		}
		return digits;
	}
}
