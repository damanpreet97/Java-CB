import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter value of n");
		int n = scn.nextInt();
		int sum = 1, prev = 0, next = 1,i=1;
		if (n==0){
			System.out.println("0");
		}
		else{
			while (i < n) {	
			sum=prev+next;
        prev=next;
        next=sum;
        i++;
		 }
		System.out.println(sum);
		}
	}

}
