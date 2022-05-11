package workout;

import java.util.Scanner;

public class MuscleBuild extends WorkoutDay {
	
	public MuscleBuild(WorkoutKind Kind) {
		super(Kind);
	}
	
	public void getUserInput(Scanner input) {
		
		setWorkoutDay(input);
		
		setWorkoutType(input);
		
		setWorkoutSet(input);
		
		setWorkoutNumbers(input);
		
		setWorkoutDate(input);
	}
	
	public void printInfo() {
		String skind = "none";
		switch(this.Kind) {
		case StrengthBuilding:
			skind = "StrBuild";
			break;
		case MuscleBuilding:
			skind = "MuscleBuild";
			break;
		case Cardio:
			skind = "Cardio";
			break;
		default:
		
		}
		System.out.println("kind : " + skind
						+ " day : " + Day 
						+ " type : " + type 
						+ " set : " + set 
						+ " numbers : " + numbers 
						+ " date : " + date );
	}
}
