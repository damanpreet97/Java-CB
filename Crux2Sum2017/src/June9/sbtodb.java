package June9;

import java.util.Scanner;

public class sbtodb {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// System.out.println("enter the number");
		int sb = scn.nextInt();
		int db = scn.nextInt();
		int n = scn.nextInt();
		int ans = sbtodb(n, sb, db);
		System.out.println(ans);
	}

	public static int sbtodb(int n, int sb, int db) {
		int dec = sbtodec(n, sb);
		int dbn = dectodb(dec, db);
		return dbn;
	}

	public static int sbtodec(int n, int sb) {
		int rem = 0, num = 0, pow = 1, dec = 0;
		while (n != 0) {
			rem = n % 10;
			n = n / 10;
			dec = dec + rem * pow;
			pow = pow * sb;
		}
		return dec;
	}

	public static int dectodb(int dec, int db) {
		int rem = 0, pow = 1, num = 0;
		while (dec != 0) {
			rem = dec % db;
			dec = dec / db;
			num = num + rem * pow;
			pow = pow * 10;
		}
		return num;
	}
}
