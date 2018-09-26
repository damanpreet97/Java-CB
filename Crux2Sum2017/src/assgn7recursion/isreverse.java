package assgn7recursion;

import java.util.Scanner;

public class isreverse {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		String s1= scn.nextLine();
		String s2=scn.nextLine();
		System.out.println(s2n(s1,s2,0,s2.length()-1));
		}
	public static boolean s2n(String s1,String s2,int svidx, int evidx){
		if(svidx>evidx){
			return true;
		}
	    if(s1.charAt(svidx)==s2.charAt(evidx)){
		return s2n(s1,s2,svidx+1,evidx-1);
	}
	    else return false;
	}
}
