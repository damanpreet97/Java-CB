package june12;

import java.util.Scanner;

public class FartoCel {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the start value");
		int startf = scn.nextInt();
		System.out.println("Enter the last value");
		int lastf = scn.nextInt();
		System.out.println("Enter the step value");
		int stepf = scn.nextInt();
		int cel = 0;
		while (startf <= lastf) {
			cel=(int)((5.0/9)*(startf-32));
			System.out.println(startf + " " + cel);
			startf+=stepf;
		}

	}

}
