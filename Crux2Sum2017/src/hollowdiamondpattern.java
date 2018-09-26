import java.util.Scanner;

public class hollowdiamondpattern {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int n = scn.nextInt();
		int row = 1, nst = n / 2 + 1, nsp = 1;
		while (row <= n) {
			int cst = 1;
			while (cst <= nst) {
				System.out.print("*\t");
				cst = cst + 1;
			}
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" \t");
				csp=csp+1;
			}
			cst=1;
			while(cst<=nst){
				System.out.print("*\t");
				cst=cst+1;
				
			}
			if (row<=n/2){
				nst =nst-1;
				nsp=nsp+2;	 			
			}
			else {
				nst=nst+1;
				nsp=nsp-2;
			}
			System.out.println();
			row=row+1;
		}

	}

}
