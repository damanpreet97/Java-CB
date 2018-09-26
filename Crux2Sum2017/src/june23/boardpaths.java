package june23;

import java.util.*;

public class boardpaths {

	public static void main(String[] args) {
		ArrayList<String> ans = getBoardPaths(0, 10);
		System.out.println(ans.size());
	}

	public static ArrayList<String> getBoardPaths(int curr, int end) {
		if (curr == end) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		ArrayList<String> mr = new ArrayList<>();
		
		for (int i = 1; i <= 6; i++) {
			if (curr + i <= end) {
				ArrayList<String> rr = getBoardPaths(curr + i, end);
				for (String rs : rr) {
					mr.add(i + rs);
				}
			}
			else break;
		}
		return mr;
	}
}