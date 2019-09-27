package minigames;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner textInput = new Scanner(System.in);


		System.out.print("Enter name: Player 1 ");
		String namePlayer1 = textInput.nextLine();											

		System.out.print("Enter name: Player 2 ");
		String namePlayer2 = textInput.nextLine();

		String currentPlayer = namePlayer1;

		//Print van keuzemenu
		System.out.println("Choose your game");
		System.out.println("[1] 4 In A Row");
		System.out.println("[2] Raad Het getal");
		System.out.println("[0] Exit"); 

		//Get selected game
		int selectedGame = textInput.nextInt();

		//TODO: Run chosen game
//		if (selectedGame == 1) {
//			FourInARow game = new FourInARow(namePlayer1, namePlayer2);
//			}
		
		//TODO Wingame

	}
}




//Example:
//		public Player player1 = new Player(playerName, 'x');
//		public Player player2 = new Player(playerName, 'y');
//		
//		FourInARow game = new FourInARow(player1, player2);
//		game.play();
//
//	}
//
//}
