import java.util.Scanner;

public class checkprime {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//System.out.println("Enter the number");
		int n = scn.nextInt();
		int divs = 2;
		while (divs < n) {
			if (n % divs == 0) {
				System.out.println("Not Prime");
				break;
			}
			divs++;
		}
		if (divs == n) {
			System.out.println("Prime");

		}

	}

}
