package june23;

import java.util.ArrayList;

public class subsequence {

	public static void main(String[] args) {
		String str = new String("bcd");
		ArrayList<String> ans = getSubsequences(str);
		System.out.println(ans);
	}

	public static ArrayList<String> getSubsequences(String str) {
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> rr = getSubsequences(ros);
		ArrayList<String> mr = new ArrayList<>();
		for (String rs : rr) {
			mr.add(rs);
			mr.add(ch + " " + rs);
//			mr.add((int) ch + " " + rs);
		}
		return mr;
	}
}
