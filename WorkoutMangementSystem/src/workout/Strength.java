package workout;

import java.util.Scanner;

public class Strength extends WorkoutDay implements WorkoutInput{
	public static int injuries =0;
	
	public Strength() {
		
	}
	
	public Strength(WorkoutKind Kind) {
		this.Kind = Kind;
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("what day? : ");
		String Day = input.next();
		this.setDay(Day);
		
		System.out.print("what type? : ");
		String type = input.next();
		this.setType(type);
		
		System.out.println("How long did you do the warm-up?(30min is recomended) : (min)");
		int warmUp = input.nextInt();
		if (warmUp>=30) {
			System.out.println("Good Job");
		}
		else {
			System.out.println("need some more warm-up time... too easy to get injuries");
			this.injuries = 1;
		}
		
		System.out.print("how many set? : ");
		int set = input.nextInt();
		this.setSet(set);
		
		System.out.print("how many times per set? : ");
		int numbers = input.nextInt();
		this.setNumbers(numbers);
		
		System.out.print("date : ");
		int date = input.nextInt();
		this.setDate(date);
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
