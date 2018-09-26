package June9;

import java.util.Scanner;

public class pattern3assgn2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter number of rows");
		int n = scn.nextInt();
		int col = 0, row = 0, val = 1;
		while (row < n) {
			val=1;
			col=0;
			while(col<=row){
				System.out.print(val);
				val=(val*(row-col))/(col+1);
				col++;
			}
			row++;
			System.out.println();	
		}
	}

}
