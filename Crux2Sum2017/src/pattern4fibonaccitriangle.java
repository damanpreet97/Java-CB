import java.util.Scanner;

public class pattern4fibonaccitriangle {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("enter number of rows");
		int n=scn.nextInt();
		int col=1,row=2,prev=0,next=1,sum=prev+next;
		System.out.println("0");
		while(row<=n){
			col=1;
			while(col<=row){
				System.out.print(sum+"\t");
				
				sum=prev+next;
				prev=next;
				next=sum;
			col++;	
			}
			row++;
			System.out.println();
		}
	}

}
