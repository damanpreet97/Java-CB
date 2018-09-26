package assgn8A;

public class lexicographical {

	public static void main(String[] args) {
		lexico(1, 1000);
	}

	public static void lexico(int n, int max) {

		System.out.println(n);
		for (int i = 0; i <= 9; i++) {
			if (n * 10 + i <= max) {
				lexico(n * 10 + i, max);
			}
		}
		if (n < 9) {
			lexico(n + 1, max);
		}
	}
}
