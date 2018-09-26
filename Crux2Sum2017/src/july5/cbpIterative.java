package july5;

public class cbpIterative {

	public static void main(String[] args) {
		int n=cbpinormal(0,10);
		System.out.println(n);
	}
public static int cbpinormal(int curr, int end){
	int[] arr= new int[end+6];
	arr[end]=1;
	for(int i=end-1;i>=curr;i--){
		arr[i]=arr[i+1]+arr[i+2]+arr[i+3]+arr[i+4]+arr[i+5]+arr[i+6];
	}
	return arr[curr];
}
}
