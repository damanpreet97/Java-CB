package assgn8A;

public class dictionaryless {

	public static void main(String[] args) {
		printpermutations("xxxa", "",0,"xxxa");
	}

	public static void printpermutations(String ques, String ans,int vidx,String org) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		boolean[] dupli = new boolean[256];// initially all elements of the
											// array would be false.
		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			if (ans.length() != 0) {
	              if (ans.charAt(vidx) == org.charAt(vidx)) {
				String roq = ques.substring(0, i) + ques.substring(i + 1);
				if (dupli[ch] == false) {
					printpermutations(roq, ans + ch,vidx+1,org);
					dupli[ch] = true;
				}
			}
				else if (ans.charAt(vidx) < org.charAt(vidx)) {
					String roq = ques.substring(0, i) + ques.substring(i + 1);
					if (dupli[ch] == false) {
						printpermutations(roq, ans + ch,vidx,org);
						dupli[ch] = true;
					}
				}
			} else {
				if (ch <= ques.charAt(0)) {
					String roq = ques.substring(0, i) + ques.substring(i + 1);
					if (dupli[ch] == false) {
						printpermutations(roq, ans + ch,vidx,org);
						dupli[ch] = true;
					}
				}
			}
		}
	}
}
