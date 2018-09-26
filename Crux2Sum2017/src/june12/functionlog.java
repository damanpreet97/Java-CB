package june12;
import java.util.Scanner;
public class functionlog {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the number");
		int x = scn.nextInt();
		System.out.println("enter the base");
		int n = scn.nextInt();
		int ans=log(x,n);
System.out.println("log of the entered number to the entered base is " + ans);
	}
public static int power(int num,int base){
	int y=1, count=0;
	while (y!=num){
		y=y*base;
		count++;
	}
	return count;
}
public static int log(int num,int base){
	int pow = power(num,base); 
	return pow;
}
}
