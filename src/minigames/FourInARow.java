package minigames;

public class FourInARow {

	private Player player1;
	private Player player2;
	private Player currentPlayer;

	private Field[][] board;

	public FourInARow(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;

		currentPlayer = player1;
		board = new Field[6][7];
		for (int row = 0; row < 6; row++) {
			for (int column = 0; column < 7; column++) {
				board[row][column] = new Field('.');
			}
		}
	}

	public void play() {
		boolean gameEnded = false;
		while (!gameEnded) {
			printBoard();

			System.out.println("current player: " + currentPlayer.getName());

			int column = Main.scanner.nextInt();
			if (setField(column - 1)) {
				switchPlayers();
			} else {
				System.out.println("Choose Athother column");
			}

		}
	}

	private void switchPlayers() {
		currentPlayer = currentPlayer == player1 ? player2 : player1;
	}

	private void printBoard() {
		for (int row = 0; row < 6; row++) {
			for (int column = 0; column < 7; column++) {
				System.out.println(board[row][column].get() + " ");
			}
			System.out.println();
		}
		System.out.println("1 2 3 4 5 6 7");
	}

	private boolean setField(int index) {
		boolean result = false;
		if (index >= 0 && index <= 6) {
			for (int i = 5; i >= 0; i--) {
				if (board[i][index].isEmpty()) {
					board[i][index].set(currentPlayer.getToken());
					result = true;
					break;
				}
			}
		}
		return result;
	}

	private boolean gameIsWon() {
		return false;
	}

	private void gameEnded(Player player) {

	}

	private void resetGame() {

	}
}
