package assgn6reccursion;
import java.util.*;
public class selectionsort {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int n=scn.nextInt();
		int arr[]= new int[n];
		for (int i=0;i<n;i++){
			arr[i]= scn.nextInt();
		}
		selectionSort(arr,0);
		for(int val:arr){
			System.out.print(val);
		}
	}
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
public static void selectionSort(int[] arr,int vidx){
	if(vidx==arr.length-1){
		return;
	}
	for(int )
	if(arr[vidx]>arr[vidx+1]){
		swap(arr,vidx,vidx+1);
	}
	selectionSort(arr,vidx+1);
}
}
