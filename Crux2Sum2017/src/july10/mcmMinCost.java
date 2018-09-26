package july10;

public class mcmMinCost {

	public static void main(String[] args) {
		int[] dim = { 10, 20, 30, 40, 50, 60 };

		int n = mcm(dim, 0, 5);
		System.out.println(n);
	}

	public static int mcm(int[] dims, int si, int ei) {
		if (ei - si == 1) {
			return 0;
		}
		int[][] arr = new int[ei + 1][ei + 1];

		int mincost = Integer.MAX_VALUE;
		if (arr[si][ei] == 0) {
			for (int i = si + 1; i < ei; i++) {

				int x = mcm(dims, si, i);
				int y = mcm(dims, i, ei);
				int Tcost = x + y + dims[si] * dims[i] * dims[ei];
				if (Tcost < mincost) {
					mincost = Tcost;

				}
			}
			arr[si][ei] = mincost;
			return mincost;
		} else {
			return arr[si][ei];
		}
	}
}