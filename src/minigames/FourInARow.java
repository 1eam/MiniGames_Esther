package minigames;

public class FourInARow {

	private Player player 1;
	private Player player 2;
	private Player currentPlayer;

	private Field[][] board;

	public FourInARow(Player player 1, Player player2,) {
		this.player1 = player1;
		this.player2 = player2;

		currentPlayer = player1;
		/*------------------------------------------------------------------------*/

		//initialize board, we moeten het bord gaan vullen
		//de buitenste for loow is de row

		board = new Field[6][7];

		for (int row =0; row <6; row++) {
			for (int column =0; column <7; column++) {
				board [row][column] = new Field ('.');
			}

		}
	}

	public void play() {
		printBoard();
	}

	private void switchPlayers() {

	}

	private void printBoard() {
		for (int row =0; row <6; row++) {
			for (int column =0; column <7; column++) {
				System.out.println(board [row][column].get() + " ");
			}
			System.out.println();
		}
		System.out.println("1 2 3 4 5 6 7");
	}

	private void setField() {

	}

	private boolean gameIsWon() {
		return false;
	}

	private void gameEnded(Player player) {

	}

	private void resetGame() {

	}
}
