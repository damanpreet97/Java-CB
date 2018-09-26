package assgn7recursion;

import java.util.Scanner;

public class ispallindrome {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		String s1= scn.nextLine();
		//String s2=scn.nextLine();
		System.out.println(isp(s1,0,s1.length()-1));
		}
	public static boolean isp(String s1,int svidx, int evidx){
		if(svidx>=evidx){
			return true;
		}
	    if(s1.charAt(svidx)==s1.charAt(evidx)){
		return isp(s1,svidx+1,evidx-1);
	}
	    else return false;
	}
}
