package july18;

public class QueueUsingLinkedList {

	private LinkedList list1  = new LinkedList();

	public void enqueue(int data) {
		list1.addLast(data);
	}

	public int dequeue() throws Exception {
		try {
			return list1.removeFirst();
		} catch (Exception e) {
			throw new Exception("Queue is Empty");
		}
	}

	public int front() throws Exception {
		try {
			return list1.getFirst();
		} catch (Exception e) {
			throw new Exception("Queue is Empty");
		}
	}

	public void display() throws Exception {
		try {
			list1.display();
		} catch (Exception e) {
			throw new Exception(" Queue is Empty");
			}
	}

	public int size() {
		return list1.size();
	}

	public boolean isEmpty() {
		return list1.isempty();
	}
}
