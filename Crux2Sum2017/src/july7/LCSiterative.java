package july7;

public class LCSiterative {

	public static void main(String[] args) {
		int n = lcsi("abcfg", "aefg");
		System.out.println(n);
	}
	public static int lcsi(String s,String g){
	int[][] arr=new int[s.length()+1][g.length()+1];
	
	for(int row=s.length()-1;row>=0;row--){
		for(int col=g.length()-1;col>=0;col--){
			if(s.charAt(row)==g.charAt(col)){
				arr[row][col]=1+arr[row+1][col+1];
			}
			else{
				arr[row][col]=Math.max(arr[row][col+1], arr[row+1][col]);
			}
		}
	}
	return arr[0][0];
	
	}
}
