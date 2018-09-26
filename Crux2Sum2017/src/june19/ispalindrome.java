package june19;

public class ispalindrome {

	public static void main(String[] args) {
		String s="baab";
		System.out.println(palindrome(s));
	}
public static boolean palindrome(String s){
 boolean b=true;
	 for(int i=0;i<s.length()/2;i++){
		 if (s.charAt(i)!=s.charAt(s.length()-i-1)){
			 b=false;
			 break;
		 }
	 }
	return b;
}
}
