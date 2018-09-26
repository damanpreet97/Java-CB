package July24;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class GenericTree {

	private class Node {
		int data;
		ArrayList<Node> children = new ArrayList<>();
	}

	private Node root;
	int size;

	public GenericTree() {
		Scanner scn = new Scanner(System.in);
		root = takeInput(null, -1, scn);
	}

	private Node takeInput(Node parent, int childIdx, Scanner scn) {
		// prompt the user
		if (parent == null) {
			System.out.println("Enter the data of root node");
		} else {
			System.out.println("Enter the data for " + childIdx + " th child of" + parent.data);
		}
		int data = scn.nextInt();
		Node child = new Node();
		size++;
		child.data = data;

		System.out.println("Enter the number of children of" + child.data);
		int GC = scn.nextInt();

		for (int i = 0; i < GC; i++) {
			Node grandchild = takeInput(child, i, scn);
			child.children.add(grandchild);
		}

		return child;
	}

	public int Size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void display() {
		display(root);
	}

	private void display(Node node) {
		// display
		String str = node.data + " =>";
		for (Node var : node.children) {
			str += var.data + " ,";
		}
		System.out.println(str + ".");
		// delegates
		for (Node var : node.children) {
			display(var);
		}
	}

	public int size2() {
		return size2(root);
	}

	private int size2(Node node) {
		int s = 0;
		for (Node child : node.children) {
			int cs = size2(child);
			s += cs;
		}
		return s + 1;
	}

	public int max() {
		return max(root);
	}

	private int max(Node node) {
		int m = Integer.MIN_VALUE;

		for (Node child : node.children) {
			int cd = max(child);
			if (cd > m) {
				m = cd;
			}
		}
		if (node.data > m) {
			m = node.data;
		}
		return m;
	}

	public boolean find(int data) {
		return find(data, root);
	}

	private boolean find(int data, Node node) {
		// if(vidx==size){
		// return false;
		// }
		boolean f = false;
		if (node.data == data) {
			return true;
		} else {
			for (Node child : node.children) {
				f = find(data, child);
				if (f == true) {
					break;
				}
			}
		}
		return f;
	}

	public int height() {
		return height(root);
	}

	private int height(Node node) {
		int h = -1;

		for (Node child : node.children) {
			int ch = height(child);
			if (ch > h) {
				h = ch;
			}
		}
		return h + 1;

	}

	public void mirrorInverse() {
		mirrorInverse(root);
	}

	private void mirrorInverse(Node node) {
		for (Node child : node.children) {
			mirrorInverse(child);
		}
		int left = 0, right = node.children.size() - 1;
		while (left < right) {
			Node temp = node.children.get(left);
			Node temp2 = node.children.get(right);
			node.children.set(left, temp2);
			node.children.set(right, temp);
			left++;
			right--;
		}
	}

	public void printAtDepth(int depth) {
		printAtDepth(root, depth);
	}

	private void printAtDepth(Node node, int depth) {
		if (depth == -1) {
			System.out.println(node.data);
			return;
		}
		if (depth == 0) {
			return;
		}
		for (Node child : node.children) {
			printAtDepth(child, depth - 1);
			if (depth == 1) {
				System.out.println(child.data);
			}
		}
	}

	public void preOrder() {
		preOrder(root);
		System.out.println(".");
	}

	private void preOrder(Node node) {
		System.out.print(node.data + ", ");
		for (Node child : node.children) {
			preOrder(child);
		}
	}

	public void postOrder() {
		postOrder(root);
		System.out.println(".");
	}

	private void postOrder(Node node) {
		for (Node child : node.children) {
			postOrder(child);
		}
		System.out.print(node.data + ",");
	}

	public void levelOrder() {
		LinkedList<Node> queue = new LinkedList<>();
		queue.addLast(root);
		while (queue.size() != 0) {
			Node rv = queue.removeFirst();
			System.out.println(rv.data + ", ");
			for (Node node : rv.children) {
				queue.addLast(node);
			}
		}
		System.out.println(".");
	}

	public void levelOrderNL() {
		LinkedList<Node> currQueue = new LinkedList<>();
		currQueue.addLast(root);
		LinkedList<Node> nextQueue = new LinkedList<>();
		while (currQueue.size() != 0) {
			Node rv = currQueue.removeFirst();
			System.out.print(rv.data + ", ");
			for (Node node : rv.children) {
				nextQueue.addLast(node);
			}

			if (currQueue.size() == 0) {
				currQueue = nextQueue;
				nextQueue = new LinkedList<>();
				System.out.println();
			}
		}
		System.out.println(".");
	}

	public int kthSmallest(int k) {
		int m = Integer.MIN_VALUE;
		for (int i = 0; i < k; i++) {
			Heapmover smallest = new Heapmover();
			kthSmallest(smallest, root, m);
			m = smallest.justLarge.data;
		}
		return m;
	}

	private void kthSmallest(Heapmover bucket, Node node, int data) {
		if (node.data > data) {
			if (bucket.justLarge == null) {
				bucket.justLarge = node;
			} else {
				if (bucket.justLarge.data > node.data) {
					bucket.justLarge = node;
				}
			}
		}
		for (Node child : node.children) {
			kthSmallest(bucket, child, data);
		}
	}

	public int min(Node node) {
		int m = node.data;
		for (Node child : node.children) {
			int cd = max(child);
			if (cd < m) {
				m = cd;
			}
		}
		return m;
	}

	public void multisolver(int data) {
		Heapmover bucket = new Heapmover();
		multisolver(root, bucket, data, 0);
		System.out.println("size = " + bucket.size);
		System.out.println("max = " + bucket.max);
		System.out.println("min = " + bucket.min);
		System.out.println("found = " + bucket.found);
		System.out.println("depth = " + bucket.height);

		if (bucket.predecessor == null) {
			System.out.println("predecessor not found");
		} else {
			System.out.println("predecessor is " + bucket.predecessor.data);
		}
		if (bucket.successor == null) {
			System.out.println("successor not found");
		} else {
			System.out.println("successor is " + bucket.successor.data);
		}
		if (bucket.justLarge == null) {
			System.out.println("Just Large not found");
		} else {
			System.out.println("just Large value is " + bucket.justLarge.data);
		}
	}

	private void multisolver(Node node, Heapmover bucket, int data, int depth) {
		bucket.size++;
		// bucket.prev=bucket.temp;
		// bucket.curr=node;
		// bucket.temp=bucket.curr;

		bucket.prev = bucket.curr;
		bucket.curr = node;

		if (node.data > bucket.max) {
			bucket.max = node.data;
		}
		if (node.data < bucket.min) {
			bucket.min = node.data;
		}
		if (bucket.found == true && bucket.successor == null) {
			bucket.successor = node;
		}
		if (node.data == data) {
			bucket.found = true;
			bucket.predecessor = bucket.prev;
		}
		// if(bucket.found==false){
		// bucket.predecessor=node;
		// }
		if (node.data > data) {
			if (bucket.justLarge == null) {
				bucket.justLarge = node;
			} else {
				if (bucket.justLarge.data > node.data) {
					bucket.justLarge = node;
				}
			}
		}

		if (depth > bucket.height) {
			bucket.height = depth;
		}

		for (Node child : node.children) {
			multisolver(child, bucket, data, depth + 1);
		}

	}

	private class Heapmover {
		private int size;
		private int height = -1;
		private boolean found;
		private int max = Integer.MIN_VALUE;
		private int min = Integer.MAX_VALUE;
		private Node predecessor;
		private Node successor;
		private Node justLarge;
		private Node prev;
		// private Node temp;
		private Node curr;
		// private Node kthsmall;
		
		private Node head;
		private Node tail;
		
	}

	public void removeLeaves() {
		removeLeaves(root);
	}

	private void removeLeaves(Node node) {
		for (int i = node.children.size() - 1; i >= 0; i--) {
			Node child = node.children.get(i);
			if (child.children.size() == 0) {
				node.children.remove(i);
				size--;
			} else {
				removeLeaves(child);
			}
		}
	}

	public void linearise() {
		linearise(root);
	}

	private void linearise(Node node) {
		// if(node.children.size()==0){
		// Node tail
		// }
		for (int i = node.children.size() - 1; i >= 0; i--) {
			Node child = node.children.get(i);

			linearise(child);

			Node PrevChild = node.children.get(i - 1);
			Node tail = getTail(PrevChild);
			tail.children.add(child);
			// if(i!=0){
			node.children.remove(i);
			// }
		}
	}

	private Node getTail(Node node) {
		Node tail = node;
		while (tail.children.size() != 0) {
			tail = tail.children.get(tail.children.size() - 1);
		}
		return tail;
	}

	public void levelOrderNLZigzag() {
		LinkedList<Node> currQueue = new LinkedList<>();
		currQueue.addLast(root);
		// Stack<Node> nextStack = new Stack<>();
		LinkedList<Node> stack = new LinkedList<>();
		// int i = 0;
		Node rv = null;
		while (currQueue.size() != 0) {
			// if (i % 2 == 0) {
			// rv = currQueue.removeFirst();
			// } else {
			// rv = currQueue.removeLast();
			// }
			rv = currQueue.removeFirst();
			System.out.print(rv.data + ", ");
			// if (i % 2 == 0) {
			// for (Node node : rv.children) {
			// nextQueue.addLast(node);
			// }
			// } else {
			// for (Node node : rv.children) {
			// nextQueue.addFirst(node);
			// }
			// }
			for (int i = rv.children.size() - 1; i >= 0; i--) {
				Node node = rv.children.get(i);
				stack.addFirst(node);
			}
			// for(Node node:rv.children){
			// stack.addFirst(node);
			// }
			if (currQueue.size() == 0) {
				while (stack.size() != 0) {
					currQueue.addLast(stack.removeFirst());
					// i++;
				}
				// nextQueue = new LinkedList<>();
				// nextStack = new Stack<>();
				stack = new LinkedList<>();
				System.out.println();
			}
		}
		System.out.println(".");
	}

	private class traversalPair {
		Node node;
		boolean isd;
		int ncd;
	}

	public void preOrderI() {
		LinkedList<traversalPair> stack = new LinkedList<>();

		traversalPair curr = new traversalPair();
		curr.node = root;
		stack.addFirst(curr);
		while (stack.size() != 0) {
			curr = stack.getFirst();
			if (curr.isd == false) {
				curr.isd = true;
				System.out.print(curr.node.data + ", ");
			} else if (curr.ncd != curr.node.children.size()) {
				traversalPair temp = new traversalPair();
				temp.node = curr.node.children.get(curr.ncd);
				stack.addFirst(temp);
				curr.ncd++;
			} else {
				stack.removeFirst();
			}
		}
		System.out.println(".");
	}

	public void postOrderI() {
		LinkedList<traversalPair> stack = new LinkedList<>();

		traversalPair curr = new traversalPair();
		curr.node = root;
		stack.addFirst(curr);
		while (stack.size() != 0) {
			curr = stack.getFirst();

			if (curr.ncd != curr.node.children.size()) {
				traversalPair temp = new traversalPair();
				temp.node = curr.node.children.get(curr.ncd);
				stack.addFirst(temp);
				curr.ncd++;
			} else if (curr.isd == false) {
				curr.isd = true;
				System.out.print(curr.node.data + ", ");
			} else {
				stack.removeFirst();
			}
		}
		System.out.println(".");
	}

	public boolean isIsomorphic(GenericTree gt) {
		return isIsomorphic(this.root, gt.root);
	}

	private boolean isIsomorphic(Node node1, Node node2) {
		// if(node1==null||node2==null){
		// return true;
		// }
		boolean b = true;
		if (node1.children.size() != node2.children.size()) {
			return false;
		} else {
			for (int i = 0; i < node1.children.size(); i++) {
				Node child1 = node1.children.get(i);
				Node child2 = node2.children.get(i);
				b = isIsomorphic(child1, child2);
				if (b == false) {
					break;
				}
			}
			return b;
		}
	}
	
	public boolean isMirrorIso(){
		return isMirrorIso(root,root);
	}
	
	private boolean isMirrorIso(Node lmnode, Node rmnode){    
		if(lmnode.children.size()!=rmnode.children.size()){
			return false;
		}
		for(int i =0; i< lmnode.children.size();i++){      //post & pre order at same time
			Node lmchild= lmnode.children.get(i);
			Node rmchild= rmnode.children.get(rmnode.children.size()-i-1);
			
			if(isMirrorIso(lmchild, rmchild)==false){
				return false;
			}
		}
		return true;
	}
	
	public void flatten(){
		Heapmover mover= new Heapmover();
		flatten(root,mover);
		root = mover.head; 
	}
	
	private void flatten(Node node,Heapmover mover){
		if(mover.head==null){
			mover.head = mover.tail = new Node();
			mover.head.data = node.data;
		}else{
			Node nn = new Node();
			nn.data= node.data;
			mover.tail.children.add(nn);
		}
		for(Node child: node.children){
			
			flatten(child, mover);
		}
	}

	//o(n)
	public void linearise2(){
		Heapmover mover= new Heapmover();
		linearise2(root, mover);
		root = mover.head;
	}
	
	private void linearise2(Node node, Heapmover mover){
	
		if(mover.head==null){
			mover.head = mover.tail = new Node();
			mover.head.data = node.data;
		}else{
			Node nn = new Node();
			nn.data= node.data;
			mover.tail.children.add(nn);
			mover.tail = nn;
		}
		
		for(Node child: node.children){
			linearise2(child, mover);
		}
	}
	
}
