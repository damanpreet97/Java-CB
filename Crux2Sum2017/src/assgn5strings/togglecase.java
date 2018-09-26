package assgn5strings;
import java.util.*;
public class togglecase {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("ENTER THE STRING");
		String s = scn.nextLine();

		System.out.println(toggle(s));
	}
	public static String toggle(String s){
		StringBuilder sb= new StringBuilder("");
		char newch;
		for(int i=0; i<s.length();i++){
			if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
				newch= (char)(s.charAt(i)-'a'+'A');
			}
			else {
				newch= (char)(s.charAt(i)-'A'+'a');
						}
		sb.append(newch);
		}
		return sb.toString();
	}
}
