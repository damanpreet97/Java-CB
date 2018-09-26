package june28;

public class splitwithnoconsecutive {

	public static void main(String[] args) {
		int[] ar ={10, 20, 30, 40,50,100,70};
		printtargetSS(ar,0,"","",0,0,false,false);
	}
public static void printtargetSS(int[] arr,int vidx, String g1, String g2, int s1,int s2,boolean t1,boolean t2){
	if(vidx==arr.length){
		if(s1==s2){
			System.out.println(g1 + "\t" + g2);
		}
		return;
	} 
	if(t1=false&&t2==false){
	printtargetSS(arr,vidx+1,g1+arr[vidx],g2,s1+arr[vidx],s2,true, false);
	printtargetSS(arr,vidx+1,g1,g2+arr[vidx],s1,s2+arr[vidx],false,true);
}
	else if(t1=false&&t2==true){
		printtargetSS(arr,vidx+1,g1+arr[vidx],g2,s1+arr[vidx],s2,true, false);		
	}
	else if(t1=true&&t2==false){
		printtargetSS(arr,vidx+1,g1,g2+arr[vidx],s1,s2+arr[vidx],false,true);
	}
}
}
