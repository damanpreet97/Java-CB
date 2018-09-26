import java.util.Scanner;

public class pattern7pyramidnumbers {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("enter number of rows");
		int n=scn.nextInt();
		int row=1,nst=1,nsp=n-1,val=1;
		while(row<=n){
			int csp=1;
			while(csp<=nsp){
				System.out.print(" \t");
			csp++;
			}
			int cst=1;
			while(cst<=nst){
				if()
				System.out.print(val+"\t");
			cst++;
			val++;
			}
			
			row++;
			System.out.println();
		}
	}

}
