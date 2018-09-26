package july7;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		int n = lcs("abcdef", "abgcdef");
		System.out.println(n);
	}

	public static int lcs(String s, String g) {
		if (s.length() == 0 || g.length() == 0) {
			return 0;
		}

		char cs = s.charAt(0);
		String ros = s.substring(1);
		char cg = g.charAt(0);
		String rog = g.substring(1);
		if (cs == cg) {
			return 1 + lcs(ros, rog);
		} else {
			int f1 = lcs(s, rog);
			int f2 = lcs(g, rog);
			return Math.max(f1, f2);

		}
	}
}
