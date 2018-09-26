package assgn6reccursion;

public class invertarray {

	public static void main(String[] args) {
		int arr[]={3,2,0,1,4};
		inverse(arr,0);
		for(int val: arr){
			System.out.println(val);
		}
	}

	public static void inverse(int[] arr, int vidx){
		if(vidx==arr.length){
			return;
		}
		int temp=arr[vidx];
		inverse(arr,vidx+1);
		arr[temp]=vidx;
	}
}
