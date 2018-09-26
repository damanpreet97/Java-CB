package assgn3functions;

import java.util.Scanner;

public class sqroot {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// System.out.println("enter the number");
		int n = scn.nextInt();
		int ans = sqroot(n);
		System.out.println(ans);
	}

public static int sqroot(int n){
	int num=0, i=0;
	while(num<=n){
		i++;
		num=i*i;
	}
	return --i;
}
}
