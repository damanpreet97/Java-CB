package june30;

public class mergetwoSortedArrays {

	public static void main(String[] args) {
		int arr1[]= {1,5,7,9};
		int arr2[]= {2,4,8,10,18};
		int merged[]=mergesort(arr1, arr2);
		for(int val:merged){
			System.out.print(val+" ");
		}
	}
public static int[] mergesort(int[] one, int[] two){
	int i=0,j=0,k=0,count=0;
	int[] ans= new int[one.length+two.length];
	
	while(i<one.length&&j<two.length){
		if(one[i]<=two[j]){
			ans[k]=one[i];
			i++;
		}
		else{
			ans[k]=two[j];
			j++;
		}
		k++;
	}
		 while(i<one.length){
			 ans[k]= one[i];
			 i++;
			 k++;
		 }
			while(j<two.length){
				 ans[k]= two[j];
				 j++;
				 k++;
			 }
	return ans;
}

}
