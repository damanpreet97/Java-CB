package july29;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapClient {

	public static void main(String[] args) {

		// System.out.println(HighestFrequencyChar("abracadabra"));
		// int[] one = { 1, 1, 2, 2, 2, 3, 5 };
		// int[] two = { 1, 1, 1, 2, 2, 4, 5 };
		int[] arr = { 2, 12, 9, 16, 10, 5, 3, 20, 25, 11, 1, 8, 6 };
		// System.out.println(gec1(one, two));
		// System.out.println(gec2(one, two));
		System.out.println(longestConsecutive(arr));
	}

	public static Character HighestFrequencyChar(String word) {
		HashMap<Character, Integer> hm = new HashMap<>();

		for (int i = 1; i < word.length(); i++) {
			Character ch = word.charAt(i);
			if (hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch) + 1);
			} else {
				hm.put(ch, 1);
			}
		}

		Character maxc = ' ';
		Integer maxf = 0;

		ArrayList<Character> keys = new ArrayList<>(hm.keySet());
		for (Character key : keys) {
			int keyf = hm.get(key);
			if (keyf > maxf) {
				maxf = keyf;
				maxc = key;
			}
		}

		return maxc;
	}

	public static ArrayList<Integer> gec1(int[] one, int[] two) { // returns
																	// common
																	// elements
		HashMap<Integer, Integer> h1 = new HashMap<>();

		for (int i = 0; i < one.length; i++) {
			Integer temp = one[i];
			if (!h1.containsKey(temp)) {
				h1.put(temp, 1);
			} else {
				h1.put(temp, h1.get(temp) + 1);
			}
		}
		ArrayList<Integer> mr = new ArrayList<>();
		for (int i = 0; i < two.length; i++) {
			Integer temp = two[i];
			if (h1.containsKey(temp)) {
				mr.add(temp);
				h1.remove(temp);
			}
		}

		return mr;
	}

	public static ArrayList<Integer> gec2(int[] one, int[] two) { // returns
																	// intersection
		HashMap<Integer, Integer> h1 = new HashMap<>();

		for (int i = 0; i < one.length; i++) {
			Integer temp = one[i];
			if (!h1.containsKey(temp)) {
				h1.put(temp, 1);
			} else {
				h1.put(temp, h1.get(temp) + 1);
			}
		}
		ArrayList<Integer> mr = new ArrayList<>();
		for (int i = 0; i < two.length; i++) {
			Integer temp = two[i];
			if (h1.containsKey(temp)) {
				mr.add(temp);
				Integer freq = h1.get(temp);
				if (freq > 1) {
					h1.put(temp, freq - 1);
				} else {
					h1.remove(temp);
				}
			}
		}
		return mr;
	}

	public static ArrayList<Integer> longestConsecutive(int[] arr) {
		HashMap<Integer, Boolean> hm = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			hm.put(arr[i], true);
		}

		ArrayList<Integer> al = new ArrayList<>(hm.keySet());

		for (int i = 0; i < al.size(); i++) {
			if (hm.containsKey(al.get(i) - 1)) {
				hm.put(al.get(i), false);
			}
		}
		Integer base = 0;
		Integer max = 0;

		for (int i = 0; i < al.size(); i++) {
			if (hm.get(al.get(i)) == true) {
				Integer size = 0;
				while (hm.containsKey(al.get(i) + size)) {
					size++;
				}
				if (size > max) {
					max = size;
					base = al.get(i);
				}
			}
		}
		ArrayList<Integer> mr = new ArrayList<>();
		for (int i = 0; i < max; i++) {
			mr.add(base + i);
		}

		return mr;
	}

}
