package workout;

public class Injury {
	public int possibleInjuries = 0;
	public Injury() {
	}
	
	public void setPossibleInjuries(int possibleInjuries) {
		this.possibleInjuries += possibleInjuries;
	}
	public int getPossibleInjuries() {
		return possibleInjuries;
	}
}
