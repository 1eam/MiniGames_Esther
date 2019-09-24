package minigames;

public class Field {
	private char value;
	private char defaultValue;

	public Field(char value) {
		this.value = defaultValue;
	}

	public void set(char value) {
		this.value = value;
	}

	public char get() {
		return value;
	}

	public void reset() {
		this.value = defaultValue;
	}

	public boolean isEmpty() {
		return true;
	}
//'.' blijft altijd in de default value.
}
