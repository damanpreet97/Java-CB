import java.util.Scanner;

public class diamondpattern {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
				System.out.println("Enter the number of rows");
				int n = scn.nextInt();
				int row = 1, nsp = n / 2, nst = 1;
				while (row <= n) {
					int csp = 1;
					while (csp <= nsp) {
						System.out.print(" ");
						csp = csp + 1;
					}
					int cst = 1;
					while (cst <= nst) {
						System.out.print("*");
						cst=cst+1;
					}
					if (row<=n/2){
						nsp--;
						nst=nst+2;
					}
					else {
						nsp++;
						nst=nst-2;
					}
						
					System.out.println();
					row=row+1;
				}
			}
}

