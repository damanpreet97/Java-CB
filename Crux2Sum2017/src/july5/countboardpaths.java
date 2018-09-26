package july5;

public class countboardpaths {

	public static void main(String[] args) {
		int n=cbp(0,10,new int[10]);
				System.out.println(n);
	}
public static int cbp(int curr, int end,int[] arr){
	if(curr==end){
		return 1;
	}
//	if(curr>end){
//		return 0;
//	}
	int count=0;
	if(arr[curr]!=0){
		return arr[curr];
	}
	for(int i=1;i<=6;i++){
		if(curr+i<=end){
			count+=cbp(curr+i,end,arr);
			}
	}
	arr[curr]=count;
	
	return count;
}	
}
