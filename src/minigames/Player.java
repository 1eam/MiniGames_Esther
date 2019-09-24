package minigames;

public class Player {
	private String name;
	private String pawn;
	private int score;

	public int getScore() {
		return this.score;
	}

	public String getPawn() {
		return this.pawn;
	}

	public String getName() {
		return this.name;
	}

	public Player(String name, String pawn) {
		this.score = 0;
		this.name = name;
		this.pawn = pawn;
		public void Win() {
			System.out.println(this.name + " has won!");
			this.score++;
		}
		public String toString() { return this.name + " score : " + this.score; }
	}
}
