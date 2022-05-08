package workout;

import java.util.Scanner;

public abstract class WorkoutDay {
	
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

	public void setDay(String day) {
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
	
}
