package Aug13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

import july31.GenericHeap;

public class HuffmanEncoder {

	private HashMap<Character, String> encoder = new HashMap<>();
	private HashMap<String, Character> decoder = new HashMap<>();

	private static class Node {
		Character ch;
		int freq;
		Node left;
		Node right;

		private static final NodeComaprator cmpt = new NodeComaprator();

		private static class NodeComaprator implements Comparator<Node> {

			@Override
			public int compare(Node arg0, Node arg1) {
				return arg1.freq - arg0.freq;
			}

		}
	}

	// 1. freq map
	// 2. prepare the heap from keyset
	// 3. prepare tree by removing two from heap and adding one back after
	// merging the two
	// 4. traverse
	public HuffmanEncoder(String feeder) {
		HashMap<Character, Integer> freqmap = new HashMap<>();

		for (int i = 0; i < feeder.length(); i++) {
			Character ch = feeder.charAt(i);
			if (freqmap.containsKey(ch)) {
				freqmap.put(ch, freqmap.get(ch) + 1);
			} else {
				freqmap.put(ch, 1);
			}
		}

		GenericHeap<Node> heap = new GenericHeap<>(Node.cmpt);
		ArrayList<Character> keys = new ArrayList<>(freqmap.keySet());

		for (Character key : keys) {
			Node node = new Node();
			node.ch = key;
			node.freq = freqmap.get(key);
			node.left = null;
			node.right = null;
			heap.add(node);
		}

		while (heap.size() != 1) {
			Node one = heap.removeHP();
			Node two = heap.removeHP();
			Node node = new Node();
			node.freq = one.freq + two.freq;
			node.right = two;
			node.left = one;
			heap.add(node);
		}
		
//		System.out.println(heap.removeHP().freq);
		traverse(heap.removeHP(), "");
	}

	private void traverse(Node node, String osf) {

		if (node.left == null && node.right == null) {
			encoder.put(node.ch, osf);
			decoder.put(osf, node.ch);
		}

		if(node.left!=null)
		traverse(node.left, osf + "0");
		if(node.right!=null)
		traverse(node.right, osf + "1");
	}

	public String compress(String str) {

		String rv = "";
		for (int i = 0; i < str.length(); i++) {
			rv = rv + encoder.get(str.charAt(i));
		}
		return rv;
	}

	public String decompress(String str){
		String rv= "";
		String ss = "";
		for (int i = 0; i < str.length(); i++) {
			ss = ss + str.charAt(i); 
			if(decoder.containsKey(ss)){
			rv = rv + decoder.get(ss);
			ss="";
			}
		}
		
		return rv;
	}
}
