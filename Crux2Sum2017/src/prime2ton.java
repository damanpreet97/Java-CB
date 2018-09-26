
import java.util.Scanner;
public class prime2ton {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int n = scn.nextInt();
		int divd = 2, divs = 2;
		if (n==1){
		    System.out.println("No Primes in between");
		}
			while (divd <= n) {
			divs = 2;
			while (divs < divd) {
				if (divd % divs == 0) {
					break;
				}
				divs++;
			}
			if (divs == divd) {
				System.out.println(divd);
			}

			divd++;
		}
	
	}

}
