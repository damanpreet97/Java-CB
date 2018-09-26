package june21recursion;

import java.util.Scanner;

public class invertedtriangle {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int n=scn.nextInt();
		printinvertedtriangle(1,1,n);
		}
	public static void printinvertedtriangle(int row, int col, int n){
		if(row>n){
			return;
		}
		if(col>row){
			col=1;
			printinvertedtriangle(row+1,col,n);
			System.out.println();
			return;
		}
		printinvertedtriangle(row,col+1,n);
		System.out.print("*\t");	
	}
}
