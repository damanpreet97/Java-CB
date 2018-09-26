package June9;
import java.util.Scanner;
public class pattern9 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//System.out.println("Enter the number of rows");
		int n = scn.nextInt();
		int row = 1, nsp = 2*(n-row)-1, nst = 1,val=1; 
while(row<=n){
    nsp = 2*(n-row)-1;
    val=1;
    int cst=1;
    while(cst<=nst){
        System.out.print(val+"\t");
        val++;
        cst++;
    }
    int csp=1;
    while(csp<=nsp){
        System.out.print(" \t");
        csp++;
    }
    cst=1;
    if (row!=n){
        val--;}
    else{nst--;
    val-=2;
}    
        while(cst<=nst){
        System.out.print(val+"\t");
        val--;
        cst++;
        }
    nst++;
    row++;
    System.out.println();
}

 
	}

}
