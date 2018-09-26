package assgn7recursion;

import java.util.*;

public class possiblecodes {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.nextLine();
		possiblecode(s, "");
		// System.out.println(getcode("26"));
	}

	public static void possiblecode(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		String g = "";
		String g1="";
		String ros = "";
		String backans=ans;
		if (ques.length() != 1) {
			 for(int i=1;i<=2;i++){
			 g=ques.substring(0, i);
			 ros=ques.substring(i);
			 ans =ans+ getcode(g);
			 possiblecode(ros, ans);
			 ans= backans;
			 }
		} else if (ques.length() == 1) {
			g = ques;
			ros = ques.substring(1);
			ans = ans + getcode(g);
			possiblecode(ros, ans);
		}
	}

	public static String getcode(String s) {
		int ans = s2n(s, 0);
		String g = "";
		char c = 'a';
		for (int i = 1; i <= 26; i++) {
			if (i == ans) {
				g = g + c;
				return g;
			}
			c++;
		}
		return "";
	}

	public static int s2n(String s, int ans) {
		if (s.length() == 0) {
			// System.out.println(ans);
			return ans;
		}
		char c = s.charAt(0);
		int i = (int) c - '0';
		ans += i * Math.pow(10, s.length() - 1);
		String ros = s.substring(1);
		return s2n(ros, ans);
	}

}