package june26;

import java.util.*;

public class getpermutations {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		ArrayList<String> s = new ArrayList<>();
		s = getPermutations(str);
		System.out.println(s);
	}

	public static ArrayList<String> getPermutations(String str) {
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> rr = getPermutations(ros);
		ArrayList<String> mr = new ArrayList<>();
		for (String rs : rr) {
			for (int i = 0; i <= rs.length(); i++) {
				mr.add(rs.substring(0, i) + ch + rs.substring(i));

			}
		}
		return mr;
	}
}
