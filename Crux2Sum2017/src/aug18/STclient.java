package aug18;

public class STclient {

	public static void main(String[] args) {

		int[] arr = {10, 2, -3, 7, 6, -4, 8, -2}; 
		SegmentTree st =  new SegmentTree(arr, new SegmentSumOperator());
		System.out.println(st.query(2, 5));
		st.update(3, 8);
		st.ChangeOperator(new SegmentMinOperator());
		System.out.println(st.query(2, 5));
	}
}
