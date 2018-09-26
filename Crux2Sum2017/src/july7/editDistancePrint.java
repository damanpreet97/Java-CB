package july7;

public class editDistancePrint {

	public static void main(String[] args) {
		String n = minD("acd", "acd");
		System.out.println(n);
	}

	public static int minD(String s, String g) {
		if (s.equals(g)) {
			return 0;
		}
		if (g.length() == 0){
			System.out.println(" insert "+s.charAt(0));
			return 1+minD(s.substring(1),g);
		}
				if(s.length() == 0) {
			System.out.println(" delete "+g.charAt(0));
					return  1+ minD(s,g.substring(1));
		}
		char cs = s.charAt(0);
		char cg = g.charAt(0);
		String ros = s.substring(1);
		String rog = g.substring(1);
		if (cs == cg) {
			return ""+minD(ros, rog);
		} else {
//			int f1 = minD(s, rog);
//			int f2 = minD(s, cs + rog);
			int f1 =1+ minD(ros, g);
			int f2 =1+ minD(ros, rog);
			int f3 =1+ minD(s, cs + g);
			int y=Math.min(f1, Math.min(f2, f3));
		
		}
	}
}
