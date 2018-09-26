package july31;

import java.util.ArrayList;
import java.util.Comparator;

public class GenericHeap<T> {

	Comparator<T> compt;
	ArrayList<T> data = new ArrayList<>();
	

	public GenericHeap(Comparator<T> compt) {
		this.compt = compt;
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

	public void add(T value) {
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
		T temp = data.get(i);
		T temp2 = data.get(j);

		data.set(i, temp2);
		data.set(j, temp);
	}

	private boolean isLarger(int ci, int pi) {  //This function tells us whether we need to swap the child and the parent or not 
		T cd = data.get(ci);                  //depending upon whether we are creating a minHeap or a maxHeap.
		T pd = data.get(pi);

		if(compt.compare(cd, pd)>0){
			return true;
		}
		else return false;
		
	}

	public T getHP() {
		return data.get(0);
	}

	public T removeHP() {

		T rv = data.get(0);
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

	public void updatePriority(T value) {
		int idx=0;
		for(int i =0;i<data.size();i++){
			if(data.get(i).equals(value)){
				idx=i;
				break;
			}
		}
		upheapify(idx);
		downheapify(idx);
	}

	
	
}
