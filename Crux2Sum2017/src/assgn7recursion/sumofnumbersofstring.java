package assgn7recursion;
import java.util.*;
public class sumofnumbersofstring {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
	String s= scn.nextLine();
	sum(s,0);
	}
public static void sum(String s,int ans){
	if(s.length()==0){
		System.out.println(ans);
		return;
	}
	char c=s.charAt(0);
	int i=(int)c-'0';
	ans+=i;
	String ros=s.substring(1);
	sum(ros,ans);
}
}
