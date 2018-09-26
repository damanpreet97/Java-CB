package june26;

public class printPermutations {

	public static void main(String[] args) {
		printpermutations("abc", "");
	}

	public static void printpermutations(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		boolean[] dupli = new boolean[256];// initially all elements of the
											// array would be false.
		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			String roq = ques.substring(0, i) + ques.substring(i + 1);
			if (dupli[ch] == false) {
				printpermutations(roq, ans + ch);
				dupli[ch] = true;
			}
		}
	}
}
