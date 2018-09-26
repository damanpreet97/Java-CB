package july7;

import java.util.Arrays;

public class LCSstringPrint {

	public static void main(String[] args) {
		String f = lcsis("abcd", "abdc");
		System.out.println(f);
	}

	public static String lcsis(String s, String g) {
		String[][] arr = new String[s.length() + 1][g.length() + 1];
//Arrays.fill(arr, "");
	for(int i=0;i<s.length() + 1;i++){
		arr[i][g.length()]="";
	}
	for(int i=0;i<g.length() + 1;i++){
		arr[s.length()][i]="";
	}
		for (int row = s.length() - 1; row >= 0; row--) {
			for (int col = g.length() - 1; col >= 0; col--) {
				if (s.charAt(row) == g.charAt(col)) {
					arr[row][col] = s.charAt(row) + arr[row + 1][col + 1];
				} else {
					if (arr[row][col + 1].length() > arr[row + 1][col].length()) {
						arr[row][col] = arr[row][col + 1];
					} else {
						arr[row][col] = arr[row + 1][col];
					}
				}
			}
		}
		return arr[0][0];
	}
}
