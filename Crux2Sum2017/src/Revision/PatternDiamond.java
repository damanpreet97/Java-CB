package Revision;

import java.util.Scanner;

public class PatternDiamond {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row=0,col=0;
		int nst=1,nsp=n/2;
		
		while(row<n){
			int csp=0,cst=0;
			while(csp<nsp){
				System.out.print(" ");				
				csp++;
			}
			while(cst<nst){
				System.out.print("*");
				cst++;
			}
			if(row>=n/2){
				nst-=2;
				nsp+=1;
			}else{
				nst+=2;
				nsp-=1;
			}
			
			System.out.println();
			row++;
		}
	}
}
