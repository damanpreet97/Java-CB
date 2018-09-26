package june26;

public class printKPC {

	public static void main(String[] args) {
		printkpc("169","");
	}
public static void printkpc(String ques, String ans){
	if(ques.length()==0){
		System.out.println(ans);
		return;
	}
	char c= ques.charAt(0);
	String roq=ques.substring(1);
	String res=getcode(c);
	for(int i=0;i<res.length();i++){
	printkpc(roq,ans + res.charAt(i));
}
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
