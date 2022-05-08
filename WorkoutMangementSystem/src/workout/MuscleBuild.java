package workout;

import java.util.Scanner;

public class MuscleBuild extends WorkoutDay implements WorkoutInput{
	
	public MuscleBuild(WorkoutKind Kind) {
		super(Kind);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("what day? : ");
		String Day = input.next();
		this.setDay(Day);
		
		System.out.print("what type? : ");
		String type = input.next();
		this.setType(type);
		
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
