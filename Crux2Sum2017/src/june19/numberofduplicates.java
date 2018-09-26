package june19;

public class numberofduplicates {

	public static void main(String[] args) {
		String s="abccdef";
		System.out.println(duplicate(s));
	}
public static String duplicate(String s){
	StringBuilder sb= new StringBuilder();
	int count=1;
	for(int i=0;i<s.length()-1;i++){
		if(s.charAt(i)!=s.charAt(i+1)){
			sb.append(s.charAt(i));
			if(count>1){
				sb.append(count);
				count=1;
			}
		}
		else count++;
	}
	sb.append(s.charAt(s.length()-1));
	if(count>1){
	sb.append(count);
	}
	return sb.toString();
}

}
