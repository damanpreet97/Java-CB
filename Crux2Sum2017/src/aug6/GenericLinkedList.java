package aug6;

public class GenericLinkedList<T> {

	private class Node {
		T data;
		Node next;
	}

	Node head;
	Node tail;
	int size;

	public void addLast(T data) {
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

	public void addFirst(T data) {
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

	public void addAt(T data, int idx) throws Exception {
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

	public T getFirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("List is empty");
		}
		return this.head.data;
	}

	public T getLast() throws Exception {
		if (this.size == 0) {
			throw new Exception("List is empty");
		}
		return this.tail.data;
	}

	public T getAt(int idx) throws Exception {
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

	public T removeFirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("List is empty");
		}
		if (this.size == 1) {
			this.tail = null;
		}
		T rv = this.head.data;
		this.head = this.head.next;
		this.size--;
		return rv;
	}

	public T removeLast() throws Exception {
		if (this.size == 0) {
			throw new Exception("List is empty");
		} else if (this.size == 1) {
			T rv = this.head.data;
			this.head = null;
			this.tail = null;
			return rv;
		} else {
			Node node = getNodeAt(this.size - 2);
			T rv = node.next.data;
			node.next = null;
			this.tail = node;
			this.size--;
			return rv;
		}
	}

	public T removeAt(int idx) throws Exception {
		if (idx < 0 || idx >= this.size) {
			throw new Exception("Index out of Bounds");
		}
		if (idx == 0) {
			return removeFirst();
		} else if (idx == this.size - 1) {
			return removeLast();
		} else {
			Node nidxm1 = getNodeAt(idx - 1);
			T rv = nidxm1.next.data;
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

}