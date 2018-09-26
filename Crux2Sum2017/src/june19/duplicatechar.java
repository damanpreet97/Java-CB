package june19;
import java.util.*;
public class duplicatechar {

	public static void main(String[] args) {
		String s="aaabccdeff";
		System.out.println(duplicate(s));
	}
public static String duplicate(String s){
	StringBuilder sb= new StringBuilder();
	char c= s.charAt(0);
	sb.append(c);
	for(int i=0;i<s.length()-1;i++){
		if(s.charAt(i)!=s.charAt(i+1)){
			sb.append(s.charAt(i+1));
		}
	}
	
	return sb.toString();
}
}
