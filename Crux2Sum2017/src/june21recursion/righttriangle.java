package june21recursion;
import java.util.*;
public class righttriangle {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
	int n=scn.nextInt();
	triangle(1,1,n);
	}
public static void triangle(int row,int col,int n){
	if(row>n){
		return;
	}
	if(col>row){
		System.out.println();
		triangle(row+1,1,n);
		return;
	}
	System.out.print("*");
	triangle(row,col+1,n);
}
}
