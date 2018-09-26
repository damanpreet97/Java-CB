package assgn5strings;
import java.util.*;
public class diffofascii {

	public static Scanner scn = new Scanner(System.in);

		public static void main(String[] args) {

			System.out.println("ENTER THE STRING");
			String s = scn.nextLine();

			System.out.println(diffascii(s));
		}

		public static String diffascii(String s) {

			StringBuilder sb = new StringBuilder("");

			sb.append(s.charAt(0));
			for (int i = 1; i < s.length(); i++) {
				sb.append((s.charAt(i - 1) - s.charAt(i)));
				sb.append(s.charAt(i));
			}

			return sb.toString();
		}
}
