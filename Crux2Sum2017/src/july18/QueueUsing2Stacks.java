package july18;

import july12.DynamicStack;

public class QueueUsing2Stacks {

	private DynamicStack sp = new DynamicStack();
	private DynamicStack sh = new DynamicStack();

	public void enqueue(int item) throws Exception {
		// if(sh.size()!=0){
		// for(int i=0;i<sh.size();i++){
		// sp.push(sh.pop());
		// }
		// }
		sp.push(item);
		// sp.push(sh.pop());
	}

	public int dequeue() throws Exception {
		while (sp.size() != 0) {
			sh.push(sp.pop());
		}
		int rv = sh.pop();
		if (sh.size() != 0) {
			while (sh.size() != 0) {
				sp.push(sh.pop());
			}
		}
		return rv;
	}

	public int front() throws Exception {
		while (sp.size() != 0) {
			sh.push(sp.pop());
		}
		int rv = sh.top();
		if (sh.size() != 0) {
			while (sh.size() != 0) {
				sp.push(sh.pop());
			}
		}
		return rv;

	}

	public int size() {
		return sp.size();
	}

	public void display() throws Exception {
		while (sp.size() != 0) {
			sh.push(sp.pop());
		}
		sh.display();
		while (sh.size() != 0) {
			sp.push(sh.pop());
		}
		// sh.display();
	}

	public boolean isEmpty() {
		return sp.isEmpty();
	}
}
