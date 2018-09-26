package Aug13;

public class HEclient {

	public static void main(String[] args) {
		HuffmanEncoder he = new HuffmanEncoder("aaaaaaaaaaaaaaaaaaaabbbbbbbcccccccccccdeeee");
		
		System.out.println(he.compress("aabccd"));
		System.out.println(he.decompress("0011110101100"));
	}

}
