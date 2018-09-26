package june30;

public class quicksort {

	public static void main(String[] args) {
		int[] ques = { 1, 9, 3, 0, 6, 2, 7 };
		quicksrt(ques, 0, ques.length-1);
		for (int val : ques) {
			System.out.print(val + " ");
		}
	}

	public static void quicksrt(int[] arr,int low,int high){
		if(low>=high){
			return;
		}
		int mid=(low+high)/2;
		int pivot=arr[mid];
		int left=low,right= high;
		while(left<=right){
			while(arr[left]<pivot){
				left++;
			}
			while(arr[right]>pivot){
				right--;
			}
			if(left<=right){
				int temp= arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
//			left++;
//			right--;
			}
		}
		quicksrt(arr,low,right);
		quicksrt(arr,left,high);
	}
}