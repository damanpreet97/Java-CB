package June9;

import java.util.Scanner;

public class rotatenumber {

	public static void main(String[] args) {
//		System.out.println(rot(12345, 10));
		
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the number");
		int n = scn.nextInt();
		int rot = scn.nextInt();
		int dig = 0, num = n, rem = 0, ans = 0;
		while (num != 0) {
			num = num / 10;
			dig++;
		}
		rot = rot % dig;
		if (rot < 0) {
			rot = rot + dig;
		}
		int div = (int) Math.pow(10, rot);
		int mult = (int) Math.pow(10, dig - rot);
		rem = n % div;
		n = n / div;
		ans = rem * mult + n;
		System.out.println(ans);
	}

//	public static int rot(int n, int r) {
//		int i = 0,rem=0,dig=0,ans=0,num=n;
//		while(num!=0){
//			dig+=1;
//			num=num/10;
//		}
//		r=r%dig;
//		i=r;
////		return dig;
//		while (i > 0) {
//			rem=n%10;
//			n=n/10;
//			ans= ans + rem*(int)Math.pow(10, dig-i);			
//			i-=1;
//		}
//		
//		ans = ans + n;
//		return ans;
//	}

}
















