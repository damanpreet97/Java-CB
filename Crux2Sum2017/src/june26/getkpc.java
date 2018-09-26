package june26;
import java.util.*;
public class getkpc {
public static Scanner scn= new Scanner(System.in);
	public static void main(String[] args) {
		String s=scn.nextLine();
	  ArrayList<String> mr= new ArrayList<>();
		mr=getKPC(s);
		System.out.println(mr);
	}
public static ArrayList<String> getKPC(String str){
	if(str.length()==0){
		ArrayList<String> br = new ArrayList<>();
		br.add("");
		return br;
	}
	char ch=str.charAt(0);
	String ros= str.substring(1);
	
	ArrayList<String> rr = getKPC(ros);
	ArrayList<String> mr = new ArrayList<>();
	for (String rs : rr) {
		String res=getcode(ch);
		for(int i=0;i<res.length();i++){
			mr.add(res.charAt(i)+ rs);
		}
	}
	return mr;
}
public static String getcode(char ch){
	if(ch=='1'){
		return "abc";
	}
	else if(ch=='2'){
		return "def";
	}
	else if(ch=='3'){
		return "ghi";
	}
	else if(ch=='4'){
		return "jkl";
	}
	else if(ch=='5'){
		return "mno";
	}
	else if(ch=='6'){
		return "pqrs";
	}
	else if(ch=='7'){
		return "tuv";
	}
	else if(ch=='8'){
		return "wx";
	}
	else if(ch=='9'){
		return "yz";
	}
	else return "";
}
}
