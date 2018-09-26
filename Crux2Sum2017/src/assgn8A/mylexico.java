package assgn8A;

public class mylexico {

	public static void main(String[] args) {
		lexico(1, 100);
		}

		public static void lexico(int n, int max) {
			if (n == max) {
				System.out.println(n);
				// n=n/10;
				return;
			}
			if (n > max) {
				// n=n/10;
				return;
			}
			System.out.println(n);
			if (n * 10 <= max) {
				lexico(n * 10, max);
			}
//			if (n == max) {
//				n = n / 10;
//			}
//			// System.out.println(n);
//			if (n == 1) {
				for (int i = 1; i <= 9; i++) {
					if(n+i<=max){
					lexico(n + i,max);
					// lexico(n+i, max);
				}
				}
			if(n<9) {
					lexico(n + 1,max);
					// lexico(n+i, max);
				}
			}
			// System.out.println(n+1);
		
}
