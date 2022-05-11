package workout;

import java.util.Scanner;

import exception.DayFormatException;

public abstract class WorkoutDay implements WorkoutInput{
	
	protected WorkoutKind Kind = WorkoutKind.MuscleBuilding;
	protected String Day;
	protected String type;
	protected int set;
	protected int numbers;
	protected int date;
	protected String time;
	public int injuries = 0;
	
	
	public WorkoutDay() {
		
	}
	
	public WorkoutDay(WorkoutKind Kind) {
		this.Kind = Kind;
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
	public WorkoutDay(WorkoutKind kind, String day, String type, int set, int numbers, int date) {
		this.Kind = kind;
		this.Day = day;
		this.type = type;
		this.set = set;
		this.date = date;
	}

	public WorkoutKind getWorkoutKind() {
		return Kind;
	}

	public void setWorkoutKind(WorkoutKind Kind) {
		this.Kind = Kind;
	}

	public String getDay() {
		return Day;
	}

	public void setDay(String day) throws DayFormatException{
		if (!day.contains("day")) {
			throw new DayFormatException();
		}
		this.Day = day;
	}
 
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public void setTime(String time) {
		this.time = time;
	}
	public String getTime(String time) {
		return time;
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
	
	public abstract void printInfo();
	
	public void setWorkoutDay(Scanner input) {
		String Day = "";
		while (!Day.contains("day")) {
			System.out.print("\nwhat day? : ");
			Day = input.next();
			try {
				this.setDay(Day);
			} catch (DayFormatException e) {
				System.out.println("incorrect day format, please enter a day containing the word 'day'.");
			}
		}
	}
	
	public void setWorkoutType(Scanner input) {
		System.out.print("what type? : ");
		String type = input.next();
		this.setType(type);
	}
	
	public void setWorkoutSet(Scanner input) {
		System.out.print("how many set? : ");
		int set = input.nextInt();
		this.setSet(set);
	}
	
	public void setWorkoutNumbers(Scanner input) {
		System.out.print("how many times per set? : ");
		int numbers = input.nextInt();
		this.setNumbers(numbers);
	}
	
	public void setWorkoutDate(Scanner input) {
		System.out.print("date : ");
		int date = input.nextInt();
		this.setDate(date);
	}
	
}
