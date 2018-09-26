package june14;

public class exitgate {

	public static void main(String[] args) {
//		int[][] arr = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 },
	//			{ 51, 52, 53, 54 } };
		int[][] arr = { { 0,0,1,0 }, { 1,0,0,0 }, { 0,0,0,0 }, { 1,0,1,0 }};
		display(arr);
		System.out.println();
		exitpoint(arr);
	}

	public static void display(int[][] arr) {
		int row = 0, col = 0;
		for (row = 0; row < arr.length; row++) {
			for (col = 0; col < arr[0].length; col++) {
				System.out.print(arr[row][col] + "\t");
			}
			System.out.println();
		}
	}
	public static void exitpoint(int[][] arr) {
		int row = 0, col = 0,countu=0,countr=0;
		//System.out.println("jhg");
		while(row<arr.length&&row>=0&&col<arr[0].length&&col>=0){
		if(arr[row][col]==0){
			if(countr%2==0){
			col++;
		} 
			else{
				col--;
			}
		countr++;
	}
		else{
			if(countu%2==0){
				row++;
			}
			else {
				row--;
			}
			countu++;
		}
	}
		System.out.println("hjgh"); 
	}
}