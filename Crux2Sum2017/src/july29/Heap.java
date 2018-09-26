package july29;

import java.util.ArrayList;

public class Heap {

	private boolean ismin;
	ArrayList<Integer> data = new ArrayList<>();

	public Heap(boolean ismin) {
		this.ismin = ismin; // ismin true => minHeap
	}

	public Heap(boolean ismin, int[] usa){  // O(n) .. to be precise its O(2n)
		this.ismin= ismin;
		
		for(int val:usa){
			add(val);
		}
		
		for(int i=data.size()/2 - 1; i>=0;i--){
			downheapify(i);
		}
		
	}
	
	
	
 	public int size() {
		return data.size();
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public void display() {
		System.out.println(data);
	}

	public void add(int value) {
		data.add(value);
		upheapify(data.size() - 1);

	}

	private void upheapify(int ci) {
		if (ci == 0) {
			return;
		}
		int pi = (ci - 1) / 2;

		if (isLarger(ci, pi) == true) {
			swap(ci, pi);  //child's data is now at pi
			upheapify(pi); // recursive call on parent's index coz now child was at pi.
		}
	}

	private void swap(int i, int j) {
		int temp = data.get(i);
		int temp2 = data.get(j);

		data.set(i, temp2);
		data.set(j, temp);
	}

	private boolean isLarger(int ci, int pi) {  //This function tells us whether we need to swap the child and the parent or not 
		int cd = data.get(ci);                  //depending upon whether we are creating a minHeap or a maxHeap.
		int pd = data.get(pi);

		if (ismin) {
			if (cd < pd) {
				return true;
			} else {
				return false;
			}
		} else {
			if (cd > pd) {
				return true;
			} else {
				return false;
			}
		}

	}

	public int getHP() {
		return data.get(0);
	}

	public int removeHP() {

		int rv = data.get(0);
		swap(0, data.size() - 1);
		data.remove(data.size()-1);

		downheapify(0);

		return rv;

	}

	private void downheapify(int pi) {

		int lc = 2 * pi + 1;
		int rc = 2 * pi + 2;
		int max = pi;

		if (lc < data.size() && isLarger(lc, max)) {
			max = lc;
		}
		if (rc < data.size() && isLarger(rc, max)) {
			max = rc;
		}

		if (max != pi) { //=> max now contains the index of a child
			swap(max, pi); //parent is now on child's index 
			downheapify(max); // recursive call on child's index
		}
	}

	
	
}
