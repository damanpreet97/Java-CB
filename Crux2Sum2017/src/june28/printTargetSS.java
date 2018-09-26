package june28;

public class printTargetSS {

	public static void main(String[] args) {
		int[] ar ={10, 20, 30, 40,50,60,70};
		printtargetSS(ar,0,60,"");
	}
public static void printtargetSS(int[] arr,int vidx, int target, String asf){
	if(vidx==arr.length){
		return;
	} 
//	int sum=0;
//	for(int i=0;i<=vidx;i++){
//		sum=sum+arr[i];
//		if(sum==target){
//			System.out.println(asf);
//		}
	if(target==0){
		System.out.println(asf);
	}
	printtargetSS(arr, vidx+1, target, asf);
	printtargetSS(arr,vidx+1,target-arr[vidx],asf+"\t"+arr[vidx]);
}
}
