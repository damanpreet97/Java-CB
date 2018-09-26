package assgn3functions;
import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// System.out.println("enter the number");
	//	scn.useDelimiter("");
		char c = scn.next().charAt(0);
		do{
		if (c == 'x' || c == 'X') {
			System.exit(0);
		}
		else if(c=='*'||c=='/'||c=='+'||c=='-'||c=='%'){
			//	System.out.println(" enter no.s");
				long a = scn.nextInt();
				long b = scn.nextInt();
				if (c == '+') {
					sum(a, b);
				} else if (c == '-') {
					diff(a, b);
				} else if (c == '*') {
					prod(a, b);
				} else if (c == '/') {
					div(a, b);
				} else  {
					mod(a, b);
				} 
		}
				else {
					System.out.println("Invalid operation. Try again.");
				}
					c = scn.next().charAt(0);
		}while(c!='x'&&c!='X');
	}  

	public static void sum(long a, long b) {
		System.out.println(a + b);
	}

	public static void prod(long a, long b) {
		System.out.println(a * b);
	}

	public static void div(long a,long b) {
		System.out.println(a / b);
	}

	public static void diff(long a, long b) {
		System.out.println(a - b);
	}

	public static void mod(long a,long b) {
		System.out.println(a % b);
	}

}
