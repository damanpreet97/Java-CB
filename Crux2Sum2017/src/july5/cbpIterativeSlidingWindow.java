package july5;

public class cbpIterativeSlidingWindow {

	public static void main(String[] args) {
		int n = cbpisliding(0, 10);
		System.out.println(n);
	}

	public static int cbpisliding(int curr, int end) {
		int[] arr = new int[6];
		arr[0] = 1;
		int ans = 0;
		for (int i = 0; i < end; i++) {
			ans = arr[0] + arr[1] + arr[2] + arr[3] + arr[4] + arr[5];
			arr[5] = arr[4];
			arr[4] = arr[3];
			arr[3] = arr[2];
			arr[2] = arr[1];
			arr[1] = arr[0];
			arr[0] = ans;

		}
		return ans;
	}

}
