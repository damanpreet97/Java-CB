package july7;

public class mzpDiagIterative {

	public static void main(String[] args) {
		int n = mzpI(2, 2);
		System.out.println(n);

	}

	public static int mzpI(int er, int ec) {
		int[][] arr = new int[er + 1][ec + 1];
		// int count=0;
		arr[er][ec] = 1;
		for (int i = er; i >= 0; i--) {
			for (int j = ec; j >= 0; j--) {
				if (i == er && j == ec) {
					
				} 
				else if (i == er) {
					arr[i][j] = arr[i][j + 1];
				} 
				else if (j == ec) {
					arr[i][j] = arr[i + 1][j];
				} 
				else {
					arr[i][j] = arr[i + 1][j] + arr[i][j + 1]+arr[i+1][j+1];
				}
			}
		}
		return arr[0][0];
	}


}
