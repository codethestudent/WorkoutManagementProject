package workout;

import java.io.Serializable;

public class Injury implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5292870186214202745L;
	
	public int possibleInjuries = 0;
	
	public void setPossibleInjuries(int possibleInjuries) {
		this.possibleInjuries += possibleInjuries;
	}
	public int getPossibleInjuries() {
		return possibleInjuries;
	}
}
