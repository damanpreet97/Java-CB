package june16;

import java.util.Scanner;

public class shellrotate {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] arr = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 },
				{ 51, 52, 53, 54 } };
		display(arr);
		System.out.println();
		shellrotate(arr);

	}

	public static void shellrotate(int[][] arr) {
		//int tne = arr.length * arr[0].length;
		int k=scn.nextInt();
		int rmin = k, cmin = k, rmax = arr.length-1-k, cmax = (arr[0].length)-1-k, count = 1, dirn = 0;
		int row=rmin, col=cmin;
		int prev=0,curr=0,temp=0;
		//int tne= (rmax-rmin+1)*(cmax-cmin+1);				
		while (true) {
			//System.out.print(arr[row][col]+"\t");
		prev=arr[row][col];
			count++;
		if (dirn==0){
			row++;
			if (row==rmax){
				dirn++;
			}
		}
		else if(dirn==1){
			col++;
			if(col==cmax){
				dirn++;
			}
		}
		else if(dirn==2){
			row--;
			if(row==rmin){
				dirn++;
			}
		}
		else if(dirn==3) {
			col--;
			if (col==cmin){
//				dirn=0;
//				rmin++;
//				cmin++;
//				rmax--;
//				cmax--;
//				row=rmin;
//				col=cmin;
//			
				dirn++;
				//break;
				}
		  }
		else break; 
		//arr[row][col]=prev;
		System.out.print(arr[row][col]+"\t");
		
		//temp=prev;
		//prev=curr
		}
	}
	public static void display(int[][] arr) {
		int row = 0, col = 0;
		for (row = 0; row < arr.length; row++) {
			for (col = 0; col < arr[0].length; col++) {
				System.out.print(arr[row][col] + "\t");
			}
			System.out.println();
		}
	}

}
