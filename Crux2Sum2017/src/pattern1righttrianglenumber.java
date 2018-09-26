import java.util.Scanner;
public class pattern1righttrianglenumber {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("enter number of rows");
		int n=scn.nextInt();
		int col=1,row=1,val=1;
		while(row<=n){
			col=1;
			while(col<=row){
				System.out.print(val+"\t");
				val++;
				col++;
			}	
			
			row++;
			System.out.println();
			
		}

	}

}
