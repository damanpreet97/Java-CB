package assgn3functions;
import java.util.Scanner;
public class sequence {

	public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
		
//			System.out.println("Enter number of numbers");
			int n = scn.nextInt();
			
//			System.out.println("Enter first number ");
			int prev = scn.nextInt();
			int curr = 0;
			
			int count = 2,same=0;
			boolean goingDec = true;
			
			while(count <= n){
//				System.out.println("Enter " + count + " number ");
				curr = scn.nextInt();
				
				// work area
				if(goingDec){
					if(curr < prev){
						// expected
					}
					else if(curr==prev){
					    same++;
					    goingDec = false;
					    if(same==2) {
					       System.out.println(false);
						return;
					    }
					}
					else {
						goingDec = false;
					}
				} else {
					if(curr > prev){
						// expected
					}
					
					else {
						System.out.println(false);
						return;
					}
				}
				// work area
				
				prev = curr;
				count++;
			}
			
			System.out.println(true);
		}


}
