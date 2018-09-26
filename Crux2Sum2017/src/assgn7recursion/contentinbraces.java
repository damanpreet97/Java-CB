package assgn7recursion;

public class contentinbraces {

	public static void main(String[] args) {
		System.out.println(cib("xyz(abd)", 0, 0));
	}

	public static String cib(String s1, int vidx, int count) {
		if (s1.charAt(vidx) == ')') {
			return "";
		}
		// if(vidx>s1.length()-1){
		// return "";
		// }
		if (s1.charAt(vidx) == '(') {

			return s1.charAt(vidx + 1) + cib(s1, vidx + 2, 1);
		} else {
			if (count == 1) {
				return s1.charAt(vidx) + cib(s1, vidx + 1, 1);
			} else
				return "" + cib(s1, vidx + 1,0);
		}
	}
}
