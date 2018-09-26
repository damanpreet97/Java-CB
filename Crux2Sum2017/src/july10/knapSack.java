package july10;

public class knapSack {

	public static void main(String[] args) {
		int[] price = { 10, 15, 20 };
		int[] wts = { 5, 10, 7 };
		int n = ks(wts, price, 0, 12);
		System.out.println(n);
	}

	public static int ks(int[] wts, int[] price, int vidx, int cap) {
		if (vidx == wts.length) {
			return 0;
		}
		int val2 = 0;
		int val1 = ks(wts, price, vidx + 1, cap);
		if (cap - wts[vidx] >= 0) {
			val2 = price[vidx] + ks(wts, price, vidx + 1, cap - wts[vidx]);
		}
		if (val1 > val2) {
			return val1;
		}
		return val2;
	}
  }
