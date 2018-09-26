import java.util.Scanner;

public class primebetween {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		int divd = n1 + 1, divs = 2;
		while (divd < n2) {
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
