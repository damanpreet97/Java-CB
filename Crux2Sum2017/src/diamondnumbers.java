import java.util.Scanner;

public class diamondnumbers {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int n = scn.nextInt();
		int row = 1, nsp = n - 1, nst = 1, val = 1;
		while (row <= 2 * n - 1) {
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp = csp + 1;
			}

			if (row <= n) {
				val = row;
			} else {
				val = 2 * n - row;
			}
			int cst = 1;
			while (cst <= nst) {
				System.out.print(val);
				if (cst <= nst / 2) {
					val = val + 1;
				} else {
					val--;
				}
				cst++;
			}
			if (row<n){
				nst=nst+2;
				nsp--;
				}
			else{nst=nst-2;
			nsp++;
			}
			
			row = row + 1;
			System.out.println();

		}
	}

}
