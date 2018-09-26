import java.util.Scanner;
public class reverseofnumber {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
	System.out.println("Enter the number");
		int n=scn.nextInt();
		int rem=0, divd=n,rev=0;
				while (divd!=0){
			rem=divd%10;
			divd=divd/10;
			
         rev=rev*10+rem;
				}
				System.out.print(rev);
	}

}
