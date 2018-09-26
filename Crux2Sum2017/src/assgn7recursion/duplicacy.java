package assgn7recursion;

import java.util.Scanner;

public class duplicacy {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		String s1= scn.nextLine();
		System.out.println(dup(s1,0));
		}
	public static String dup(String s1,int vidx){
		if(vidx==s1.length()-1){
			return s1.substring(vidx, vidx+1);
		}
		if(s1.charAt(vidx)==s1.charAt(vidx+1)){
		 return s1.substring(vidx, vidx+1)+"*"+dup(s1,vidx+1);
	}
	    else{ 
	    	return s1.substring(vidx, vidx+1)+dup(s1,vidx+1);
	    }
	}

}
