package assgn6reccursion;

import java.util.Scanner;

public class pascaltriangle {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
	int n=scn.nextInt();
	triangle(0,0,n,1);
	}
public static void triangle(int row,int col,int n,int val){
	if(row==n){
		return;
	}
	if(col>row){
		System.out.println();
		triangle(row+1,0,n,val);
		return;
	}
	 System.out.print(val+"\t");
		
	val=(val*(row-col))/(col+1);
	if(val<1){
		val=1;
	}
	triangle(row,col+1,n,val);
	}

}
