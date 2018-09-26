package july12;

public class stack {
	protected int[] data;
	protected int tos = -1;
	
	public stack(){
		this(5);
	}

	public stack(int cap) {
		this.data = new int[cap];
	}

	public void push(int item) throws Exception {
		if (this.tos == this.data.length - 1) {
			throw new Exception();
		}

		this.tos++;
		this.data[this.tos] = item;
	}

	public int top() throws Exception {
		if (this.tos == -1) {
			throw new Exception();
		}
		return this.data[this.tos];
	}

	public int pop() throws Exception {
		if (this.tos == -1) {
			throw new Exception("Stack Empty");
		}
		int v = this.data[this.tos];
		this.data[this.tos] = 0;
		this.tos--;
		return v;

	}

	public int size() {
		return this.tos+1;
	}

	public boolean isEmpty() {
		if (this.tos == -1) {
			return true;
		}
		return false;
	}

	public void display() {
		for (int i = this.tos; i >= 0; i--) {
			System.out.print(this.data[i]+", ");
		}
		System.out.println();
	}
}
