package assgn3functions;

import java.util.Scanner;

public class lcm {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// System.out.println("enter the number");
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
//		int ans = lcm(n1, n2);
//		System.out.println(ans);
//	System.out.println(lcm2(4, 6));
	
	// Scanner scn=new Scanner(System.in);
     int n=scn.nextInt();
     int a=0,b=1,c=0;
     if(n>0 && n<=1000)
{
     for(int i=0;i<n;i++)
     {             
                         c=a+b;
                         System.out.print(a);
                         System.out.println();
             a=b;
             b=c;
            
     }
}
else return;
	}

	public static int lcm(int a, int b) {
		int val = a * b / gcd(a, b);
		return val;
	}

	public static int gcd(int a, int b) {
		int rem = 0, div = a, divd = b;
		while (divd % div != 0) {
			rem = divd % div;
			divd = div;
			div = rem;
		}
		return div;
	}

	public static int lcm2(int a, int b) {
		if (a > b) {
			for (int i = a; i < a * b; i++) {
				if (i % a == 0 && i % b == 0) {
					return i;
				}
			}
		} else {
			for (int i = b; i < a * b; i++) {
				if (i % a == 0 && i % b == 0) {
					return i;
				}
			}
		}
		return 0;
	}

}
