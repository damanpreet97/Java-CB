package assgn8b;

public class nknights {

	public static void main(String[] args) {

		boolean[][] board = new boolean[3][3];
		nknight(1, board, "", 0);
	}

	public static void nknight(int cellno, boolean[][] board, String config, int kpsf) {

		if(kpsf==board.length){
			System.out.println(config);
			return;
		}
		for (int i = cellno; i <= board.length * board.length; i++) {
			int cr = (i-1) / board.length;
			int cc = (i-1) % board.length;
			if (june28.nknights.isItSafe(board, cr, cc)) {
				board[cr][cc] = true;
				nknight(i + 1, board, config + "["+ cr + "-" +cc+"] ", kpsf + 1);
				board[cr][cc] = false;
			}
		}
	}

}
