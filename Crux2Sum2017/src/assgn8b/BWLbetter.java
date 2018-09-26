package assgn8b;

import java.util.Arrays;
import java.util.HashMap;

public class BWLbetter {

	public static void main(String[] args) {
		int n = 20;
		boolean[] arr = sieveOfE(n);

		HashMap<Integer, Integer> ladders = new HashMap<>();
		int left = 0;
		int right = arr.length - 1;

		while (left < right) {

			while (arr[left] == false) {
				left++;
			}
			while (arr[right] == false) {
				right--;
			}
			if (left < right) {
				ladders.put(left, right);
				left++;
				right--;
			}
		}
		BoardPathsWithLadder(0, n, "", ladders);
	}

	public static boolean[] sieveOfE(int n) {
		boolean[] primes = new boolean[n + 1];
		Arrays.fill(primes, true);

		primes[0] = primes[1] = false;

		for (int i = 2; i * i <= n; i++) {
			if (primes[i] == false) {
				continue;
			}
			for (int ja = 2; ja * i <= n; ja++) {
				primes[i * ja] = false;
			}
		}
		return primes;
	}

	public static void BoardPathsWithLadder(int curr, int end, String psf, HashMap<Integer, Integer> ladders) {

		if (curr == end) {
			System.out.println(psf);
			return;
		}

		if (ladders.containsKey(curr)) {
			BoardPathsWithLadder(ladders.get(curr), end, psf + "L[" + curr + "->" + ladders.get(curr) + "]", ladders);
		} else {
			for (int dice = 1; dice <= 6; dice++) {
				if (curr + dice <= end) {
					BoardPathsWithLadder(curr + dice, end, psf + "D" + dice, ladders);
				}
			}
		}
	}
}
