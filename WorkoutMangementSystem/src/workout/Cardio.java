package workout;

import java.util.Scanner;

public class Cardio extends WorkoutDay {
	
	public Cardio(WorkoutKind Kind) {
		super(Kind);
	}
	public void getUserInput(Scanner input) {
		setWorkoutDay(input);
		
		setWorkoutType(input);
		
		System.out.print("total time : ");
		String time = input.next();
		this.setTime(time);
		
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
						+ " time : " + time
						+ " date : " + date );
		}
}
