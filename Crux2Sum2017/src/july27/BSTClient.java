package july27;

public class BSTClient {

	public static void main(String[] args) {
//		int[] post= {12,30,40,37,25,62,87,75,50};
//		int[] in = {12,25,30,37,40,50,62,75,87};
//		BST bst= new BST(post, in);
	int[] sa= {10,20,30,40,50,60,70};
		BST bst= new BST(sa);
//		bst.remove(40);
//		System.out.println(bst.find(56));
//		bst.add(67);
//		bst.replaceWithSumOfLarger();
//		bst.display();
		bst.pir(0,40);
//	System.out.println(bst.max());
//	System.out.println(bst.min());
	
	
	}

}
