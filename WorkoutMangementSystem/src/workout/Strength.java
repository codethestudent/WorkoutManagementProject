package workout;

import java.util.Scanner;

public class Strength extends WorkoutDay {
	public static int injuries =0;
	
	public Strength() {
		
	}
	
	public Strength(WorkoutKind Kind) {
		super(Kind);
	}
	
	public void getUserInput(Scanner input) {
		setWorkoutDay(input);
		
		setWorkoutType(input);
		
		setWorkoutSet(input);
		
		setWorkoutNumbers(input);
		
		setWorkoutDate(input);
		
		System.out.println("How long did you do the warm-up?(30min is recomended) : (min)");
		int warmUp = input.nextInt();
		if (warmUp>=30) {
			System.out.println("Good Job");
		}
		else {
			System.out.println("need some more warm-up time... too easy to get injuries");
			this.injuries = 1;
		}
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
