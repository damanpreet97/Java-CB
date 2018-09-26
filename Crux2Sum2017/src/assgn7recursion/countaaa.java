package assgn7recursion;

public class countaaa {

	public static void main(String[] args) {
		System.out.println(caaa("aaaaaa", 0));
		}

		public static int caaa(String s1, int vidx) {
			if (s1.substring(vidx).length() <=2 ) {
				return 0;
			}
			if (s1.substring(vidx, vidx+3).equals("aaa")) {
				return 1 + caaa(s1, vidx+1);
			} else {
				return 0+ caaa(s1, vidx+1);
			}
		}
}
