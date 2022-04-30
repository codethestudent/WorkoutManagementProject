package workout;

import java.util.Scanner;

public class Cardio extends WorkoutDay{
	
	public Cardio(WorkoutKind Kind) {
		this.Kind = Kind;
	}
	public void getUserInput(Scanner input) {
		System.out.print("what day? : ");
		String Day = input.next();
		this.setDay(Day);
		
		System.out.print("what type? : ");
		String type = input.next();
		this.setType(type);
		
		System.out.print("total time : ");
		String time = input.next();
		this.setTime(time);
		
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
						+ " time : " + time
						+ " date : " + date );
		}
}
