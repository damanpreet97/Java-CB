package june23;

import java.util.ArrayList;

public class multimoves {

	public static void main(String[] args) {
		ArrayList<String> ans = getBoardPaths(0, 0, 3, 3);
		System.out.println(ans);
	}

	public static ArrayList<String> getBoardPaths(int cr, int cc, int er, int ec) {
		if (cr == er && cc == ec) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		if (cc > ec || cr > er) {
			ArrayList<String> br = new ArrayList<>();
			return br;
		}
		ArrayList<String> mr = new ArrayList<>();
		int temp = 0;
		if (er > ec) {
			temp = er;
		} else {
			temp = ec;
		}
		for (int i = 1; i <= temp; i++) {
			ArrayList<String> rr = getBoardPaths(cr + i, cc, er, ec);
			for (String rs : rr) {
				mr.add("V" + i + rs);
			}

			ArrayList<String> rc = getBoardPaths(cr, cc + i, er, ec);
			for (String rm : rc) {
				mr.add("H" + i + rm);
			}

			ArrayList<String> rd = getBoardPaths(cr + i, cc + i, er, ec);
			for (String rm : rd) {
				mr.add("D" + i + rm);
			}

		}
		return mr;
	}

}
