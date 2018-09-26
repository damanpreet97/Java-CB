package assgn9;

import java.util.Scanner;
import java.util.Stack;

public class checkDuplicateParenthesis {

	public static void main(String[] args) {
		Stack<String> s = new Stack<>();
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		System.out.println(duplicateParenthesis(s, str));
	}

	public static boolean duplicateParenthesis(Stack<String> s,String str){
		if(str.length()==0){
			return false;
		}
		String c= str.substring(0,1);
		String ros= str.substring(1);
		if(c.equals("/")||c.equals("-")||c.equals("+")||c.equals("*")||c.equals("(")){
			s.push(c);
		return duplicateParenthesis(s, ros);	
		}
		else if(c.equals(")")){
			String rv= s.pop();
			if(rv.equals("(")){
				return true;
			}
			else{
				boolean b=true;
				while(b){
					if(s.pop().equals("(")){
						b=false;
					}
				}
					return duplicateParenthesis(s, ros);
				}
		}
//			else return duplicateParenthesis(s, ros);
		
		else {
			return duplicateParenthesis(s, ros);
		}
	}
}
