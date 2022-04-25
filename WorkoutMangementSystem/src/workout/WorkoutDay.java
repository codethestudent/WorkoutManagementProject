package workout;

import java.util.Scanner;

public class WorkoutDay {
	
	protected WorkoutKind workoutKind = WorkoutKind.StrengthBuilding;
	protected String Day;
	protected String type;
	protected int set;
	protected int numbers;
	protected int date;
	public int possibleInjury = 0;
	
	public WorkoutDay() {
		
	}
	
	public WorkoutDay(String day, String type) {
		this.Day = day;
		this.type = type;
	}
	
	public WorkoutDay(String day, String type, int set, int numbers, int date) {
		this.Day = day;
		this.type = type;
		this.set = set;
		this.date = date;
	}

	public WorkoutKind getWorkoutKind() {
		return workoutKind;
	}

	public void setWorkoutKind(WorkoutKind workoutKind) {
		this.workoutKind = workoutKind;
	}

	public String getDay() {
		return Day;
	}

	public void setDay(String day) {
		this.Day = day;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getSet() {
		return set;
	}

	public void setSet(int set) {
		this.set = set;
	}

	public int getNumbers() {
		return numbers;
	}

	public void setNumbers(int numbers) {
		this.numbers = numbers;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getPossibleInjury() {
		return possibleInjury;
	}
	
	public void setPossibleInjury(int possibleInjury) {
		this.possibleInjury += possibleInjury;
	}
	
	public void printInfo() {
		System.out.println("day : " + Day 
						+ " type : " + type 
						+ " set : " + set 
						+ " numbers : " + numbers 
						+ " date : " + date 
						+ " possible injury days : " + possibleInjury);
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

}
