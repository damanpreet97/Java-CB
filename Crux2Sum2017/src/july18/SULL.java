package july18;

public class SULL {
	private LinkedList list= new LinkedList();

	public void push(int item) {
		list.addFirst(item);
	}

	public int pop() throws Exception {
		try {
			return list.removeFirst();
		} catch (Exception e) {
			throw new Exception("Stack is Empty");
		}
	}

	public int top() throws Exception {
		try {
			return list.getFirst();
		} catch (Exception e) {
			throw new Exception("Stack is Empty");
		}
	}

	public int size() {
		return list.size();
	}

	public void display() throws Exception {
		try {
			list.display();
		} catch (Exception e) {
			throw new Exception(" Stack is Empty");
		}
	}

}
