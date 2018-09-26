package july27;

import java.util.LinkedList;

public class BST {
	private class Node {
		int data;
		Node left;
		Node right;
	}

	Node root;
	int size;

	public BST(int[] post, int[] in) {
		root = construct(post, in, 0, post.length - 1, 0, in.length - 1);
	}

	public BST(int[] sa) {
		root = construct(sa, 0, sa.length - 1);
	}

	private Node construct(int[] sa, int low, int high) {
		if (low > high) {
			return null;
		}

		int mid = (low + high) / 2;

		Node node = new Node();
		node.data = sa[mid];
		size++;

		node.left = construct(sa, low, mid - 1);
		node.right = construct(sa, mid + 1, high);

		return node;
	}

	private Node construct(int[] post, int[] in, int psi, int pei, int isi, int iei) {
		if (psi > pei || isi > iei) {
			return null;
		}
		Node node = new Node();
		node.data = post[pei];
		this.size++;

		int idx = -1;
		for (int i = iei; i >= isi; i--) {
			if (in[i] == node.data) {
				idx = i;
				break;
			}
		}

		int crse = iei - idx;

		node.left = construct(post, in, psi, pei - crse - 1, isi, idx - 1);
		node.right = construct(post, in, pei - crse, pei - 1, idx + 1, iei);

		return node;
	}
	//
	// public BinaryTree(int[] post, int[] in) {
	// root = construct(post, in, 0, post.length - 1, 0, in.length - 1);
	// }
	//
	// private Node construct(int[] post, int[] in, int psi, int pei, int isi,
	// int iei) {
	// if (psi > pei || isi > iei) {
	// return null;
	// }
	// Node node = new Node();
	// node.data = post[pei];
	// this.size++;
	//
	// int idx = -1;
	// for (int i = isi; i <= iei; i++) {
	// if (in[i] == node.data) {
	// idx = i;
	// break;
	// }
	// }
	//
	// int clse = idx - isi;
	//
	// node.left = construct(post, in, psi, psi + clse - 1, isi, idx - 1);
	// node.right = construct(post, in, psi + clse, pei - 1, idx + 1, iei);
	//
	// return node;
	// }

	public void display() {
		display(root);

	}

	private void display(Node node) {
		if (node == null) {
			return;
		}
		String str = "";
		if (node.left != null) {
			str += node.left.data + " => ";
		} else {
			str += " . => ";
		}
		str += node.data;
		if (node.right != null) {
			str += " <= " + node.right.data;
		} else {
			str += " <= .";
		}
		System.out.println(str);
		display(node.left);
		display(node.right);
	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size == 0;
	}

	public int size2() {
		return size2(root);
	}

	private int size2(Node node) {
		if (node == null) {
			return 0;
		}
		int ls = size2(node.left);
		int rs = size2(node.right);
		return ls + rs + 1;
	}

	public int height() {
		return height(root);
	}

	private int height(Node node) {
		if (node == null) {
			return -1;
		}
		int lh = height(node.left);
		int rh = height(node.right);

		return Math.max(lh, rh) + 1;
	}

	public int max() {
		return max(root);
	}

	private int max(Node node) {
		if (node.right == null) {
			return node.data;
		} else {
			return max(node.right);
		}
	}

	public int min() {
		return min(root);
	}

	private int min(Node node) {
		if (node.left == null) {
			return node.data;
		} else {
			return min(node.left);
		}
	}

	public boolean find(int data) {
		return find(root, data);
	}

	private boolean find(Node node, int data) {
		if (node == null) {
			return false;
		}
		if (data > node.data) {
			return find(node.right, data);
		} else if (data < node.data) {
			return find(node.left, data);
		} else {
			return true;
		}
	}

	public int diameter() {
		return diameter(root);
	}

	private int diameter(Node node) {
		if (node == null) {
			return 0;
		}
		// int ld= this.height(node.left);
		int ld = diameter(node.left);
		int rd = diameter(node.right);
		int lh = height(node.left);
		int rh = height(node.right);
		int f1 = rh + lh + 2;
		return Math.max(f1, Math.max(ld, rd));
	}

	public int diameter2() {
		return diameter2(root).diameter;
	}

	private class DiaPair {
		int diameter;
		int height;
	}

	private DiaPair diameter2(Node node) {
		if (node == null) {
			DiaPair rb = new DiaPair();
			rb.diameter = 0;
			rb.height = -1;
			return rb;
		}
		DiaPair ld = diameter2(node.left);
		DiaPair rd = diameter2(node.right);

		DiaPair mr = new DiaPair();

		mr.height = Math.max(ld.height, rd.height) + 1;
		mr.diameter = Math.max(ld.height + rd.height + 2, Math.max(ld.diameter, rd.diameter));

		return mr;
	}

	public boolean IsBalanced() {
		return IsBalanced(root).isb;
	}

	private class BalPair {
		boolean isb;
		int height;
	}

	private BalPair IsBalanced(Node node) {
		if (node == null) {
			BalPair rb = new BalPair();
			rb.isb = true;
			rb.height = -1;
			return rb;
		}
		BalPair lb = IsBalanced(node.left);
		BalPair rb = IsBalanced(node.right);

		BalPair mr = new BalPair();
		mr.height = Math.max(lb.height, rb.height) + 1;
		if (lb.isb == true && rb.isb == true) {
			// if(lb.height-rb.height==0||lb.height-rb.height==1||lb.height-rb.height==-1||rb.height-lb.height==-1||lb.height-lb.height==1){
			int gap = Math.abs(lb.height - rb.height);
			if (gap <= 1) {
				mr.isb = true;
			}
		} else
			mr.isb = false;

		return mr;
	}

	public boolean isBST() {
		return isBST(root).isBST;
	}

	private class BSTpair {
		int max;
		int min;
		boolean isBST;
	}

	private BSTpair isBST(Node node) {
		if (node == null) {
			BSTpair rb = new BSTpair();
			rb.max = Integer.MIN_VALUE;
			rb.min = Integer.MAX_VALUE;
			rb.isBST = true;
			return rb;
		}

		BSTpair ls = isBST(node.left);
		BSTpair rs = isBST(node.right);

		BSTpair mr = new BSTpair();

		mr.max = Math.max(node.data, rs.max);
		mr.min = Math.min(node.data, ls.min);
		if (ls.isBST && rs.isBST) {
			if (node.data > ls.max && node.data < rs.min) {
				mr.isBST = true;
			}
		} else {
			mr.isBST = false;
		}

		return mr;
	}

	public void postOrder() {
		postOrder(root);
		System.out.println(".");
	}

	private void postOrder(Node node) {
		if (node == null) {
			return;
		}
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data + ", ");

	}

	public void preOrder() {
		preOrder(root);
		System.out.println(".");
	}

	private void preOrder(Node node) {
		if (node == null) {
			return;
		}
		System.out.print(node.data + ", ");
		preOrder(node.left);
		preOrder(node.right);
	}

	public void inOrder() {
		inOrder(root);
		System.out.println(".");
	}

	private void inOrder(Node node) {
		if (node == null) {
			return;
		}

		inOrder(node.left);
		System.out.print(node.data + ", ");
		inOrder(node.right);
	}

	private class traversalPair {
		Node node;
		boolean isd;
		boolean ild;
		boolean ird;
	}

	public void preOrderI() {
		LinkedList<traversalPair> stack = new LinkedList<>();

		traversalPair rp = new traversalPair();
		rp.node = root;

		stack.addFirst(rp);
		while (stack.size() != 0) {
			traversalPair curr = new traversalPair();
			curr = stack.getFirst();
			if (curr.isd == false) {
				curr.isd = true;
				System.out.print(curr.node.data + ", ");
			} else if (curr.ild == false) {
				curr.ild = true;
				if (curr.node.left != null) {
					traversalPair temp1 = new traversalPair();
					temp1.node = curr.node.left;
					stack.addFirst(temp1);
				}
			} else if (curr.ird == false) {
				curr.ird = true;
				if (curr.node.right != null) {
					traversalPair temp2 = new traversalPair();
					temp2.node = curr.node.right;
					stack.addFirst(temp2);
				}
			} else {
				stack.removeFirst();
			}
		}
		System.out.println(".");
	}

	public void postOrderI() {
		LinkedList<traversalPair> stack = new LinkedList<>();

		traversalPair rp = new traversalPair();
		rp.node = root;

		stack.addFirst(rp);
		while (stack.size() != 0) {

			rp = stack.getFirst();
			if (rp.ild == false) {
				rp.ild = true;
				if (rp.node.left != null) {
					traversalPair temp1 = new traversalPair();
					temp1.node = rp.node.left;
					stack.addFirst(temp1);
				}
			} else if (rp.ird == false) {
				rp.ird = true;
				if (rp.node.right != null) {
					traversalPair temp2 = new traversalPair();
					temp2.node = rp.node.right;
					stack.addFirst(temp2);
				}
			} else if (rp.isd == false) {
				rp.isd = true;
				System.out.print(rp.node.data + ", ");
			} else {
				stack.removeFirst();
			}
		}
		System.out.println(".");
	}

	public void inOrderI() {
		LinkedList<traversalPair> stack = new LinkedList<>();

		traversalPair rp = new traversalPair();
		rp.node = root;

		stack.addFirst(rp);
		while (stack.size() != 0) {

			rp = stack.getFirst();
			if (rp.ild == false) {
				rp.ild = true;
				if (rp.node.left != null) {
					traversalPair temp1 = new traversalPair();
					temp1.node = rp.node.left;
					stack.addFirst(temp1);
				}
			} else if (rp.isd == false) {
				rp.isd = true;
				System.out.print(rp.node.data + ", ");
			} else if (rp.ird == false) {
				rp.ird = true;
				if (rp.node.right != null) {
					traversalPair temp2 = new traversalPair();
					temp2.node = rp.node.right;
					stack.addFirst(temp2);
				}
			}

			else {
				stack.removeFirst();
			}
		}
		System.out.println(".");
	}

	public void levelOrder() {
		levelOrder(root);
	}

	private void levelOrder(Node node) {
		LinkedList<Node> queue = new LinkedList<>();
		queue.addLast(root);
		LinkedList<Node> nextQueue = new LinkedList<>();
		while (queue.size() != 0) {
			Node temp = queue.removeFirst();
			System.out.print(temp.data + ", ");
			if (temp.left != null) {
				nextQueue.addLast(temp.left);
			}
			if (temp.right != null) {
				nextQueue.addLast(temp.right);
			}
			if (queue.size() == 0) {
				queue = nextQueue;
				nextQueue = new LinkedList<>();
			}
		}
		System.out.println(".");
	}

	public void add(int data) {
		if (size == 0) {
			root = new Node();
			root.data = data;
			size++;
		} else {
			add(root, data);
		}

	}

	private void add(Node node, int data) {

		if (node.data < data) {
			if (node.right == null) {
				Node temp = new Node();
				temp.data = data;
				node.right = temp;
				size++;
			} else {
				add(node.right, data);
			}
		} else if (node.data > data) {
			if (node.left == null) {
				Node temp = new Node();
				temp.data = data;
				node.left = temp;
				size++;
			} else {
				add(node.left, data);
			}
		} else {
			return; // no duplicates allowed
		}
	}

	public void remove(int data) {
		remove(root, null, data, false);
	}

	private void remove(Node node, Node parent, int data, boolean ilc) {
		if (node == null) {
			return;
		}

		if (node.data == data) {
			if (node.left == null && node.right == null) {
				if (ilc == true) {
					parent.left = null;
				} else {
					parent.right = null;
				}
				size--;
			} else if (node.left == null || node.right == null) {
				if (node.left == null) {
					if (ilc == true) {
						parent.left = node.right;
					} else {
						parent.right = node.right;
					}
					size--;
				} else {
					if (ilc == true) {
						parent.left = node.left;
					} else {
						parent.right = node.left;
					}
					size--;
				}
			} else {
				int max = max(node.left);
				node.data = max;
				remove(node.left, node,max, true);
			}
		} else if (node.data > data) {
			remove(node.left, node, data, true);
		} else if (node.data < data) {
			remove(node.right, node, data, false);
		}
	}

	public void replaceWithSumOfLarger(){
		HeapMover mover = new HeapMover();
		replace(root, mover);
		
	}
	private class HeapMover{
		int sum;
	}
	
	private void replace(Node node, HeapMover mover){
		if(node==null){
			return;
		}
		replace(node.right,mover);
		
		int temp=node.data;
		node.data= mover.sum;
		mover.sum+=temp;
		
		replace(node.left, mover);
	}
	
	public void pir(int low, int high){
		pir(root, low, high);
		System.out.println(".");
	}
	private void pir(Node node, int low, int high){
		if(node==null){
			return;
		}
		if(node.data>high){
			pir(node.left,low,high);
		}
		
		else if(node.data<low){
			pir(node.right,low,high);
		}
		else{
			System.out.print(node.data + ", ");
			pir(node.left,low,high);
			pir(node.right, low, high);
		}
	}
}
