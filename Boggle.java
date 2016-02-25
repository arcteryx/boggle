public class Boggle {
	private final static int SIZE = 4;
	private char[][] board;

	public void BoggleBoard() {
		this.board = new char[Boggle.SIZE][Boggle.SIZE];
		for (int r = 0; r < this.board.length; r++) {
			for (int c = 0; c < this.board.length; c++) {
				this.board[r][c] = (char) ('a' + (int) (Math.random() * 26));
			}
		}
	}

	public boolean findWord(String word) {
		for (int row = 0; row < this.board.length; row++) {
			for (int col = 0; col < this.board.length; col++) {
				if (this.findWord(word, row, col)) {
					return true;
				}
			}
		}
		return false;
	}