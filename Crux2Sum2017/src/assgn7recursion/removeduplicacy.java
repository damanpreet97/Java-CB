package assgn7recursion;

import java.util.Scanner;

public class removeduplicacy {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		String s1= scn.nextLine();
		System.out.println(remdup(s1,0));
		}
	public static String remdup(String s1,int vidx){
		if(vidx==s1.length()-1){
			return s1.substring(vidx, vidx+1);
		}
		if(s1.charAt(vidx)==s1.charAt(vidx+1)){
		 return ""+remdup(s1,vidx+1);
	}
	    else{ 
	    	return s1.substring(vidx, vidx+1)+remdup(s1,vidx+1);
	    }
	}
}
