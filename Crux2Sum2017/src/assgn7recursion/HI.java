package assgn7recursion;

import java.util.Scanner;

public class HI {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		String s1= scn.nextLine();
		//System.out.println(counthi(s1,0));
		//System.out.println(remhi(s1,0));
		System.out.println(rephi(s1,0));
	}
	public static int counthi(String s1,int vidx){
		if(vidx==s1.length()-1){
			return 0;
		}
		if(s1.charAt(vidx)=='h'&&s1.charAt(vidx+1)=='i'){
		 return 1 + counthi(s1,vidx+1);
	}
	    else{ 
	    	return counthi(s1,vidx+1);
	    }
	}
	public static String remhi(String s1,int vidx){
		if(vidx==s1.length()-1){
			return s1.substring(vidx,vidx+1);
		}
		if(vidx>s1.length()-1){
			return "";
		}
		if(s1.charAt(vidx)=='h'&&s1.charAt(vidx+1)=='i'){
		 return remhi(s1,vidx+2);
	}
	    else{ 
	    	return s1.substring(vidx,vidx+1) + remhi(s1,vidx+1);
	    }
	}
	public static String rephi(String s1,int vidx){
		if(vidx==s1.length()-1){
			return s1.substring(vidx,vidx+1);
		}
		if(vidx>s1.length()-1){
			return "";
		}
		if(s1.charAt(vidx)=='h'&&s1.charAt(vidx+1)=='i'){
		 return "bye"+rephi(s1,vidx+2);
	}
	    else{ 
	    	return s1.substring(vidx,vidx+1) + rephi(s1,vidx+1);
	    }
	}
}
