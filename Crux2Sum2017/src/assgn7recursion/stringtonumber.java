package assgn7recursion;

import java.util.Scanner;

public class stringtonumber {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		String s= scn.nextLine();
		
		s2n(s,0);
		}
	public static void s2n(String s,int ans){
		if(s.length()==0){
			System.out.println(ans);
			return;
		}
		char c=s.charAt(0);
		int i=(int)c-'0';
		ans+=i*Math.pow(10, s.length()-1);
		String ros=s.substring(1);
		s2n(ros,ans);
	}

}
