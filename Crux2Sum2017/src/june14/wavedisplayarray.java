package june14;

public class wavedisplayarray {

	public static void main(String[] args) {
		int[][] arr = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 },
				{ 51, 52, 53, 54 } };
		display(arr);
		System.out.println();
		wavedisplay(arr);
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

	public static void wavedisplay(int[][] arr) {
		int row = 0, col = 0;
		for (col = 0; col < arr[0].length; col++) {
			if (col % 2 == 0) {
				for (row = 0; row < arr.length; row++) {
					System.out.print(arr[row][col] + "\t");
				}
			} else {
				for (row = arr.length - 1; row >= 0; row--) {
					System.out.print(arr[row][col] + "\t");
				}
			}
		}
	}
}