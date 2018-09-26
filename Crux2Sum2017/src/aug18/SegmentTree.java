package aug18;

public class SegmentTree {

	public class Node {
		int ei;
		int si;
		int data;
		Node left;
		Node right;
	}

	private int size;
	private Node root;
	private ISegmentOperator operator;
	 
	public SegmentTree(int[] arr, ISegmentOperator operator) {
		this.operator = operator;
		root = construct(arr, 0, arr.length - 1);
	}

	private Node construct(int[] arr, int si, int ei) {

		if (si == ei) {
			Node base = new Node();
			this.size++;
			base.data = arr[si];
			base.ei = base.si = si;
			return base;
		}

		int mid = (si + ei) / 2;

		Node node = new Node();
		this.size++;
		node.si = si;
		node.ei = ei;
		node.left = construct(arr, si, mid);
		node.right = construct(arr, mid + 1, ei);
		node.data = this.operator.operation(node.left.data, node.right.data);

		return node;
	}

	public void ChangeOperator(ISegmentOperator operator) {
		this.operator = operator;
		updateTonewOperator(root);
	}
	
	private void updateTonewOperator(Node node){
		if(node.ei==node.si){
			return;
		}
		updateTonewOperator(node.left);
		updateTonewOperator(node.right);
		node.data = this.operator.operation(node.left.data, node.right.data);
	}

	public int query(int qsi, int qei) {
		return query(root, qsi, qei);
	}

	private int query(Node node, int qsi, int qei) {
		if (node.si >= qsi && node.ei <= qei) {
			return node.data;
		} else if (node.si > qei || node.ei < qsi) {
			return this.operator.defaultValue();
		} else {
			int ls = query(node.left, qsi, qei);
			int rs = query(node.right, qsi, qei);
			return this.operator.operation(ls, rs);
		}
	}

	public void update(int idx, int nv) {
		update(root, idx, nv);
	}

	private void update(Node node, int idx, int nv) {
		// if(node.ei == node.si && node.si== idx){
		// int temp = node.data;
		// node.data = nv;
		// return temp-nv;
		// }else if((node.si + node.ei)/2 >= idx){
		// int diff = update(node.left,idx,nv);
		// node.data = node.data - diff;
		// return diff;
		// }else{
		// int diff = update(node.right, idx, nv);
		// node.data = node.data - diff;
		// return diff;
		// }

		if (idx == node.si && idx == node.ei) {
			node.data = nv;
			return;
		}
		int mid = (node.si + node.ei) / 2;
		if (mid >= idx) {
			update(node.left, idx, nv);
		} else {
			update(node.right, idx, nv);
		}
		node.data = this.operator.operation(node.left.data, node.right.data);
	}
}
