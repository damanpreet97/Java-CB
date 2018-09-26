package july18;

public class LinkedList {

	private class Node {
		int data;
		Node next;
	}

	Node head;
	Node tail;
	int size;

	public void addLast(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		if (this.size == 0) {
			this.head = node;
			this.tail = node;
		} else {
			this.tail.next = node;
			this.tail = node;
		}
		this.size++;
	}

	public void addFirst(int data) {
		Node node = new Node();
		node.data = data;
		node.next = this.head;
		if (this.size == 0) {
			this.head = node;
			this.tail = node;
		} else {
			this.head = node;
		}
		this.size++;
	}

	public void addAt(int data, int idx) throws Exception {
		if (idx < 0 || idx > this.size) {
			throw new Exception("Index out of Bounds");
		}
		if (idx == 0) {
			addFirst(data);
		} else if (idx == this.size) {
			addLast(data);
		} else {
			Node node = new Node();
			node.data = data;
			Node nidxm1 = getNodeAt(idx - 1);
			Node nidxp1 = nidxm1.next;
			node.next = nidxp1;
			nidxm1.next = node;
			this.size++;
		}
	}

	public int getFirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("List is empty");
		}
		return this.head.data;
	}

	public int getLast() throws Exception {
		if (this.size == 0) {
			throw new Exception("List is empty");
		}
		return this.tail.data;
	}

	public int getAt(int idx) throws Exception {
		if (this.size == 0) {
			throw new Exception("List is empty");
		}
		if (idx < 0 || idx >= this.size) {
			throw new Exception("Index out of Bounds");
		}
		Node node = getNodeAt(idx);
		return node.data;
	}

	private Node getNodeAt(int idx) throws Exception {
		if (this.size == 0) {
			throw new Exception("List is empty");
		}
		if (idx < 0 || idx >= this.size) {
			throw new Exception("Index out of Bounds");
		}
		Node node = this.head;
		for (int i = 0; i < idx; i++) {
			node = node.next;
		}
		return node;
	}

	public int removeFirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("List is empty");
		}
		if (this.size == 1) {
			this.tail = null;
		}
		int rv = this.head.data;
		this.head = this.head.next;
		this.size--;
		return rv;
	}

	public int removeLast() throws Exception {
		if (this.size == 0) {
			throw new Exception("List is empty");
		} else if (this.size == 1) {
			int rv = this.head.data;
			this.head = null;
			this.tail = null;
			return rv;
		} else {
			Node node = getNodeAt(this.size - 2);
			int rv = node.next.data;
			node.next = null;
			this.tail = node;
			this.size--;
			return rv;
		}
	}

	public int removeAt(int idx) throws Exception {
		if (idx < 0 || idx >= this.size) {
			throw new Exception("Index out of Bounds");
		}
		if (idx == 0) {
			return removeFirst();
		} else if (idx == this.size - 1) {
			return removeLast();
		} else {
			Node nidxm1 = getNodeAt(idx - 1);
			int rv = nidxm1.next.data;
			nidxm1.next = nidxm1.next.next;
			this.size--;
			return rv;
		}
	}

	public int size() {
		return this.size;
	}

	public boolean isempty() {
		return this.size == 0;
	}

	public void display() throws Exception {
		if (this.size == 0) {
			throw new Exception(" List is Empty");
		}
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println(".");
	}

	public void reverseDataIterative() throws Exception {
		int left = 0, right = this.size - 1;
		while (left != right) {
			Node data1 = getNodeAt(left);
			Node data2 = getNodeAt(right);
			int temp = data1.data;
			data1.data = data2.data;
			data2.data = temp;
			left++;
			right--;
		}
	}

	public void reversePointerIterative() throws Exception {

		Node prev = this.head;
		Node curr = prev.next;
		while (curr != null) {
			Node next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		Node temp = this.head;
		this.head = prev;
		this.tail = temp;
		this.tail.next = null;
	}

	public void reversePointerRecursive() {
		Node prev = this.head;
		Node curr = prev.next;

		reversePointerRecursive(prev, curr);

		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;
		this.tail.next = null;
	}

	private void reversePointerRecursive(Node prev, Node curr) {
		if (curr == null) {
			return;
		}
		Node next = curr.next;
		curr.next = prev;
		reversePointerRecursive(curr, next);

	}

	public void reverseDataRecursive() {
		Heapmover left = new Heapmover();
		left.node = this.head;
		reverseDataRecursive(left, this.head, 0);

	}

	private void reverseDataRecursive(Heapmover left, Node right, int floor) {
		if (right == null) {
			return;
		}
		reverseDataRecursive(left, right.next, floor + 1);
		if (floor >= this.size / 2) {
			Node temp = left.node;
			left.node.data = right.data;
			right.data = temp.data;
		}
		left.node = left.node.next;
	}

	public boolean isPalindrome() {
		Heapmover left = new Heapmover();
		left.node = this.head;
		return isPalindrome(left, this.head, 0);

	}

	private boolean isPalindrome(Heapmover left, Node right, int floor) {
		if (right == null) {
			return true;
		}
		boolean b = isPalindrome(left, right.next, floor + 1);
		if (b == true) {
			if (floor >= this.size / 2) {
				if (left.node.data == right.data) {
					left.node = left.node.next;
					return true;
				} else
					return false;
			}
		}
		return b;
	}

	private class Heapmover {
		// Heapmover node = new Heapmover();
		Node node;
	}

	public void reverseDisplay() {
		displayReverse(this.head);
		System.out.println(".");
	}

	private void displayReverse(Node node) {
		if (node == null) {
			return;
		}
		displayReverse(node.next);
		System.out.print(node.data + " ->");
	}

	public void fold() {
		Heapmover left = new Heapmover();
		left.node = this.head;
		Node right = this.head;
		fold(left, right, 0);
	}

	private void fold(Heapmover left, Node right, int floor) {
		if (right == null) {
			return;
		}
		fold(left, right.next, floor + 1);
		if (floor > size / 2) {
			Node temp = left.node.next;
			left.node.next = right;
			right.next = temp;

			left.node = temp;
		}
		if (floor == size / 2) {
			this.tail = right;
			right.next = null;
		}
	}

	public int MidElement() {
		Node slow = this.head;
		Node fast = this.head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}

	private Node MidNode() {
		Node slow = this.head;
		Node fast = this.head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public int KthFromLast(int k) {
		Node slow = this.head;
		Node fast = this.head;
		for (int i = 1; i < k; i++) {
			fast = fast.next;
		}
		while (fast.next != null) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow.data;
	}

	public void removeDuplicates() {
		Node slow = this.head;
		Node fast = this.head;
		while (fast.next != null) {
			if (fast.data == fast.next.data) {
				fast = fast.next;
			} else {
				slow.next = fast.next;
				fast = fast.next;
			}
		}
	}

	public LinkedList mergeTwoSortedLL(LinkedList other) {
		LinkedList merged = new LinkedList();
		Node thisTemp = this.head;
		Node otherTemp = other.head;
		while (thisTemp != null && otherTemp != null) {
			if (thisTemp.data >= otherTemp.data) {
				merged.addLast(otherTemp.data);
				otherTemp = otherTemp.next;
			} else {
				merged.addLast(thisTemp.data);
				thisTemp = thisTemp.next;
			}
		}
		while (thisTemp != null) {
			merged.addLast(thisTemp.data);
			thisTemp = thisTemp.next;
		}
		while (otherTemp != null) {
			merged.addLast(otherTemp.data);
			otherTemp = otherTemp.next;
		}
		return merged;
	}

	public LinkedList mergesort() {
		if (this.size == 1) {
			return this;
		}
		Node mid = this.MidNode();
		Node midNext = mid.next;

		LinkedList po = new LinkedList();
		po.head = this.head;
		po.tail = mid;
		po.tail.next = null;
		po.size = (this.size + 1) / 2;

		LinkedList pt = new LinkedList();
		pt.head = midNext;
		pt.tail = this.tail;
		pt.tail.next = null;
		pt.size = this.size / 2;

		LinkedList sfh = po.mergesort();
		LinkedList ssh = pt.mergesort();

		return sfh.mergeTwoSortedLL(ssh);
	}

	public LinkedList kReverse(int k) throws Exception {
		LinkedList prev = null;
		LinkedList curr = new LinkedList();
		while (this.head != null) {
//		for(int i=0;i<2;i++){
			for (int j = 0; j < k; j++) {
				curr.addFirst(this.removeFirst());
			}
			if (prev == null) {
				prev = curr;
			} else {
             prev.tail.next= curr.head;
			prev.tail=curr.tail;
			prev.size+=curr.size;
			}
			curr = new LinkedList();
		}
			
		return prev;
	}

}