package july5;

public class mzpIterativeSlidingWindow {

	public static void main(String[] args) {
		int n = mzpSlide(4, 4);
		System.out.println(n);
	}

	public static int mzpSlide(int er, int ec) {
		int[] wind = new int[ec + 2];
		wind[ec] = 1;// to fill all elements use predefined Arrays.fill
		for (int i = 0; i <= er; i++) {
			for (int j = 0; j <= ec; j++) {
				wind[ec - j] = wind[ec - j + 1] + wind[ec - j];
			}
		}
		return wind[0];
	}

}
