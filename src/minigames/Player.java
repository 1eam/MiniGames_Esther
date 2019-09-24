package minigames;

public class Player {
	private String name;
	private char token;
	private int score;

	public int getScore() {
		return this.score;
	}

	public char getToken() {
		return this.token;
	}

	public String getName() {
		return this.name;
	}

	public Player(String name, char Token) {
		this.score = 0;
		this.name = name;
		this.token = token;
		public void Win() {
			System.out.println(this.name + " has won!");
			this.score++;
		}
		public String toString() { return this.name + " score : " + this.score; }
	}
}
