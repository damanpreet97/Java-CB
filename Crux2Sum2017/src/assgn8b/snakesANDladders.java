package assgn8b;

import java.util.*;

public class snakesANDladders {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		 int n = scn.nextInt();
		 int[] arr = new int[n+1];
		 for (int i = 0; i < n; i++) {
		 arr[i] = scn.nextInt();
		 }
		 System.out.println(getBoardPaths(0, 20, arr, 0, 8));
//		System.out.println(whatprime(3));
//		System.out.println(primefromlast(whatprime(3), 20));
//		 System.out.println(isprime(15));
	}

	public static boolean getBoardPaths(int curr, int end, int[] arr, int vidx,int p) {
		if (curr == end) {
			return true;
		}
		if (curr + arr[vidx] <= end) {
			boolean b = isprime(curr + arr[vidx]);
			if (b==true) {
				int t = whatprime(curr + arr[vidx]);
				int x = primefromlast(t, end);
				if (t <= p/2 && t % 2 == 1) {
					if (x > curr + arr[vidx]) {
						return getBoardPaths(x, end, arr, vidx + 1,p);
					}
				}
				else if(t>p/2 && (p-t+1)%2==0){
				if(x<curr+arr[vidx]){
					return getBoardPaths(x, end, arr, vidx + 1,p);
				}
				}
				else {
					return getBoardPaths(curr + arr[vidx], end, arr, vidx + 1,p);
				}
				}
		      else {
				return getBoardPaths(curr + arr[vidx], end, arr, vidx + 1,p);
			}
		}
			return false;

}

	public static boolean isprime(int a){
			if(a==1){
				return false;
			}
				for(int j=2;j<=(int)Math.sqrt(a);j++){
					if(a%j==0){
						return false;
					}
				}
				return true;
		}

	public static int whatprime(int a) {
			int count = 0;
			int i=0,j=0;
			for (i = 2; i <= a; i++) {
				if (i == 2 || i == 3) {
					count++;
				 continue;
				}
				for (j = 2; j <= (int)Math.sqrt(i); j++) {
					if (i % j == 0) {
						break;
					}
					}
				if (j > (int)Math.sqrt(i)) {
					count++;
				}
			}
			return count;
		}

	public static int primefromlast(int y, int end) {
			int count = 0;
			for (int i = end; i >= 2; i--) {
				if (i == 2 || i == 3) {
					count++;
				}
				for (int j = 2; j <= (int)Math.sqrt(i); j++) {
					if (i % j == 0) {
						break;
					}
					if(j==(int)Math.sqrt(i)){
						count++;
					}
				}
				if (count == y) {
					return i;
				}
			}
			return 0;
		}

}
