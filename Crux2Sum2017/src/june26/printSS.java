package june26;

import java.util.*;

public class printSS {

	public static void main(String[] args) {
		printSSWAscii("ab", "");
	}

	public static void printSSWAscii(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		char c = ques.charAt(0);
		String roq = ques.substring(1);
		printSSWAscii(roq, ans + "");
		printSSWAscii(roq, ans + c);
		// printSSWAscii(roq, ans+(int)(c));
	}
}
