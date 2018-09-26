package july7;

import java.util.Arrays;

public class mzpDiagIterativeSW {

	public static void main(String[] args) {
		int n = mzpSlide(3,3);
		System.out.println(n);
	}

	public static int mzpSlide(int er, int ec) {
		int[] wind = new int[ec + 1];
		Arrays.fill(wind, 1);
		// wind[ec] = 1;// to fill all elements use predefined Arrays.fill
		for (int i = 1; i <= er; i++) {
			int val = 1;	
			for (int j = 1; j <= ec; j++) {
				int nv = wind[ec - j + 1] + wind[ec - j] + val;
				val = wind[ec - j];
				wind[ec - j] = nv;
			}
		}
		return wind[0];
	}

}
