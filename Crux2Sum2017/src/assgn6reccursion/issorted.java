package assgn6reccursion;

import java.util.Scanner;

public class issorted {
	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int N = scn.nextInt();
	int[] arr = new int[N];
	for(int i = 0; i < arr.length; i++){
		arr[i] = scn.nextInt();
	}
	System.out.println(isSortedSmarter(arr, 0));
}

public static boolean isSortedSmarter(int[] arr, int si) {
	//boolean k=true;
	if(si==arr.length-1){
		return true;
	}
	if(arr[0]>arr[1]){
	if(arr[si]>=arr[si+1]){
//		k= isSortedSmarter(arr,si+1);
//		if (k==false){
//			if(arr[si]>arr[si+1]){
//				return isSortedSmarter(arr,si+1);
//			}
//		}
		return isSortedSmarter(arr, si+1);
	}
	else {
		return false;
	}
}else{
	if(arr[si]<=arr[si+1]){
		return isSortedSmarter(arr, si+1);
	}
	else {
		return false;
	}
	}
}
}
