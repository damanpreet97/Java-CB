package july26;

public class BTClient {

	public static void main(String[] args) {
	
		// 50 true 25 true 12 false false true 37 true 30 false false true 40 false false true 75 true 62 true 60 false false true 70 false false true 87 false false
int[] post= {12,30,40,37,25,62,87,75,50};
int[] in = {12,25,30,37,40,50,62,75,87};
		
		BinaryTree BT = new BinaryTree(post, in);
//  BinaryTree BT = new BinaryTree();
//		 BT.display();
//		 BT.lBST();
//		 System.out.println("............................................");
//		 BT.removeLeaves();
//		 BT.display();
//		BT.printWithoutSibling();
		 // System.out.println(BT.height());
		// System.out.println(BT.max());
		// System.out.println(BT.find(75));
		// System.out.println(BT.diameter2());
		// System.out.println(BT.IsBalanced());
		// System.out.println(BT.isBST());
		// BT.preOrder();
//		BT.postOrder();
//		BT.preOrder();
//		BT.inOrder();
//		BT.postOrderI();
//		BT.preOrderI();
//		BT.inOrderI();
//		BT.levelOrder();
//		 BT.kaway(4, 37);
		 BT.routeToLeaf(152);
	}

}
