package june19;

public class replacement {

	public static void main(String[] args) {
		String s="aaabccdefff";
		System.out.println(replace(s));
	}
public static String replace(String s){
	StringBuilder sb= new StringBuilder();
	for (int i=0;i<s.length();i++){
		if(i%2==0){
			char c=(char)(s.charAt(i)+1);
			sb.append(c);
		}
		else{
			char c=(char)(s.charAt(i)-1);
			sb.append(c);
		}
	}
	return sb.toString();
	}
}
