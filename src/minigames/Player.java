package minigames;

public class Player {
	private String playerName;
	private int playerScore;

	public String getName() {
		return this.playerName;
	}
	
	public int getScore() {
		return this.playerScore;
	}

	public Player(String playerName) {
		this.playerScore = 0;
		this.playerName = playerName;
	}



	public String toString() {
		return this.playerName + " score : " + this.playerScore;
	}

}
