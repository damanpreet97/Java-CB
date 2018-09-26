package july17;

public class queue {
	int[] data;
	int size;
	int front;

	queue() {
		this(5);
	}

	queue(int cap) {
		this.data = new int[cap];
	}

	public void enqueue(int item) throws Exception {
		if (this.size == this.data.length) {
			throw new Exception("Queue is full");
		}
		int tail = (this.front + this.size) % this.data.length;
		this.data[tail] = item;
		size++;
	}

	public int dequeue() throws Exception {
		if (this.size == 0) {
			throw new Exception("Queue is Empty");
		}
		int rv = this.data[this.front];
		this.data[this.front] = 0;
		this.size--;
		this.front = (this.front + 1) % this.data.length;
		return rv;
	}

	public int front() throws Exception {
		if (this.size == 0) {
			throw new Exception("Queue is Empty");
		}
		return this.data[this.front];
	}

	public boolean isEmpty() {
		if (this.size == 0) {
			return true;
		}
		return false;
	}

	public void display() throws Exception {
		if (this.size == 0) {
			throw new Exception("Queue is Empty");
		}
		for (int i = 0; i < this.size; i++) {
			int ai = (this.front + i) % this.data.length;
			System.out.println(this.data[ai]);
		}
	}

	public void reverseQueue() throws Exception {
		if (this.size == 0) {
			return;
		}
		int rv = this.dequeue();
		this.reverseQueue();
		this.enqueue(rv);
	}

	// private void reverseOfQueue(int front,int rear){
	// int rv = this.dequeue();
	// reverseOfQueue(front+1, rear);

}
