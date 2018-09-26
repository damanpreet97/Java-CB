package june28;

public class nknights {

	public static void main(String[] args) {
		boolean[][] board = new boolean[3][3];
		printNQueens(board, 0, 0, 0, "");
	}

	public static void printNQueens(boolean[][] board, int qpsf, int r, int c, String ans) {
		if (qpsf == board.length) {
			System.out.println(ans);
			return;
		}
		if (c == board[0].length) {
			printNQueens(board, qpsf, r + 1, 0, ans);
			return;
		}
		if (r == board.length) {
			return;
		}
		for (int row = r; row < board.length; row++) {
			for (int col = c; col < board[0].length; col++) {
				if (isItSafe(board, row, col) == true) {
					board[row][col] = true;
					printNQueens(board, qpsf + 1, row, col + 1, ans + "[" + row + "-" + col + "]");
					board[row][col] = false;
					if (col == board.length - 1) {
						c = 0;
					}
				}
				if (col == board.length - 1) {
					c = 0;
				}
			}
		}
	}

	public static boolean isItSafe(boolean[][] board, int row, int col) {
		int r = row, c = col;
		if (board[row][col] == true) {
			return false;
		}
		// check vertical left side
		r -= 2;
		c -= 1;
		if (r >= 0 && c >= 0) {
			if (board[r][c] == true) {
				return false;
			}
		}
		// check horizontal left side
		r += 1;
		c -= 1;
		if (r >= 0 && c >= 0) {
			if (board[r][c] == true) {
				return false;
			}
		}
		// check horizontal right side
		c += 4;
		if (r >= 0 && c < board[0].length) {
			if (board[r][c] == true) {
				return false;
			}
		}
		// check vertical right side
		c -= 1;
		r -= 1;
		if (r >= 0 && c < board[0].length) {
			if (board[r][c] == true) {
				return false;
			}
		}

		// while(r >= 0 && c < board.length){
		// if(board[r][c] == true){
		// return false;
		// }
		// r--;
		// c++;
		// }
		//
		// // check -ve diag
		// r = row;
		// c = col;
		// while(r >= 0 && c >= 0){
		// if(board[r][c] == true){
		// return false;
		// }
		// r--;
		// c--;
		// }
		//
		return true;
	}

}
