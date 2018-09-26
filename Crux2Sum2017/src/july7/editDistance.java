package july7;

public class editDistance {

	public static void main(String[] args) {
		int n = minD("acd", "adc");
		System.out.println(n);
	}

	public static int minD(String s, String g) {
		if (s == g) {
			return 0;
		}
		if (g.length() == 0){
			return s.length();
		}
				if(s.length() == 0) {
			return g.length();
		}
		char cs = s.charAt(0);
		char cg = g.charAt(0);
		String ros = s.substring(1);
		String rog = g.substring(1);
		if (cs == cg) {
			return minD(ros, rog);
		} else {
//			int f1 =1+ minD(s, rog);
//			int f2 =1+ minD(s, cs + rog);
//			int f3= 1+ minD(s,cs+g);
			int f1 =1+ minD(ros, g);//insertion
			int f2 =1+ minD(ros, rog);//replacement
			int f3 =1+ minD(s, cs + g);//insertion
			return Math.min(f1, Math.min(f2, f3));
		}
	}
}
