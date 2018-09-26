package june28;

public class splitarray {

	public static void main(String[] args) {
		int[] ar ={10, 20, 30, 40,50,60,70};
		printtargetSS(ar,0,"","",0,0);
	}
public static void printtargetSS(int[] arr,int vidx, String g1, String g2, int s1,int s2){
	if(vidx==arr.length){
		if(s1==s2){
			System.out.println(g1 + "\t" + g2);
		}
		return;
	} 
	printtargetSS(arr,vidx+1,g1+arr[vidx],g2,s1+arr[vidx],s2);
	printtargetSS(arr,vidx+1,g1,g2+arr[vidx],s1,s2+arr[vidx]);
}
}