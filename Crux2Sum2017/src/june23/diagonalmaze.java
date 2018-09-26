package june23;

import java.util.ArrayList;

public class diagonalmaze {

	public static void main(String[] args) {
		ArrayList<String> ans = getBoardPaths(0, 0, 2, 2);
		System.out.println(ans);
	}

	public static ArrayList<String> getBoardPaths(int cr, int cc, int er, int ec) {
		if (cr == er && cc == ec) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		ArrayList<String> mr = new ArrayList<>();
		if(cr<er){
			ArrayList<String> rr = getBoardPaths(cr+1, cc, er, ec);
			for (String rs : rr) {
				mr.add("V" + rs);
			}
		}
		
			if(cc<ec){
			ArrayList<String> rc = getBoardPaths(cr, cc+1, er, ec);
			for (String rm : rc) {
				mr.add("H" + rm);
			}
		}
			if(cc<ec&&cr<er){
				ArrayList<String> rd = getBoardPaths(cr+1, cc+1, er, ec);
				for (String rm : rd) {
					mr.add("D" + rm);
				}
			}
		return mr;
	}

}
