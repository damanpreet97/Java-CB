package june19;

public class strings {

	public static void main(String[] args) {
		String s="nitin";
		
		printsubstrings(s);
	}
public static void printsubstrings(String s){
	for(int i=0;i<s.length();i++){
		for (int j=i;j<s.length();j++){
			System.out.println(s.substring(i,j+1));
		}
			
	}
}
}
