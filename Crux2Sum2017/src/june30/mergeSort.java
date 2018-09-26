package june30;

public class mergeSort {

	public static void main(String[] args) {
			int[] ques= {1,9,3,0,6,2,7};
			int[] ans = mergesort(ques, 0, 6);
			for(int val:ans){
				System.out.print(val+" ");
			}
	}

	public static int[] mergesort(int[] arr, int lo, int hi) {
		if(lo==hi){
			int[] br=new int[1];
			br[0]=arr[lo];
			return br;
		}
		
		int mid=(lo+hi)/2;
		int[] lsarr=mergesort(arr, lo, mid);
		int[] rsarr=mergesort(arr, mid+1, hi);
		
		int[] sorted = june30.mergetwoSortedArrays.mergesort(lsarr, rsarr);
		return sorted;
	}
}
