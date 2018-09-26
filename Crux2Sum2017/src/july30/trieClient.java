package july30;

public class trieClient {

	public static void main(String[] args) {
		Trie trie = new Trie();

		trie.addWord("and");
		trie.addWord("ant");
		trie.addWord("an");
		trie.addWord("arc");
		trie.addWord("ant");

		trie.addWord("bug");
		trie.addWord("buy");
		trie.addWord("bu");

		trie.addWord("sea");
		trie.addWord("seen");

		// System.out.println(trie.searchWord("and"));
		// System.out.println(trie.searchWord("sea"));
		// System.out.println(trie.searchWord("bull"));
		// System.out.println(trie.searchWord("an"));
		trie.display();
		System.out.println("----------------------------");
		trie.removeWord("bug");
		System.out.println("----------------------------");
		// trie.removeWord("ant");
		trie.removeWord("an");
		trie.removeWord("ant");
		trie.removeWord("and");
		trie.display();
	}

}
