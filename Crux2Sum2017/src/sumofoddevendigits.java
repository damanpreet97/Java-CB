import java.util.Scanner;

public class sumofoddevendigits {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter the number");
			int n=scn.nextInt();
			int rem=0, divd=n,so=0,se=0,cnt=1;
					while (divd!=0){
				rem=divd%10;
				divd=divd/10;
				if(cnt%2==0){
					se=se+rem;
				}
				else{so=so+rem;}
				cnt++;
					}
					System.out.println(so);
					System.out.println(se);
						
	}

}
