import java.util.Scanner;

public class DayManage {
	Scanner input = new Scanner(System.in);
	WorkoutDay workoutday;
	
	public void addWorkoutDay(){
		workoutday = new WorkoutDay();
		System.out.println("Adding workout day...");
		
		System.out.print("what day? : ");
		workoutday.workoutDay = input.next();
		System.out.print("what type? : ");
		workoutday.type = input.next();
		System.out.print("how many set? : ");
		workoutday.set = input.nextInt();
		System.out.print("how many times per set? : ");
		workoutday.numbers = input.nextInt();
		System.out.print("date : ");
		workoutday.date = input.nextInt();
		
	}
	
	public void deleteWorkoutDay() {
		System.out.println("what date to delete? : ");
		String workoutDay = input.next();
		if (workoutday == null) {
			System.out.println("the day is not registered.");
		}
		if (workoutDay == workoutday.workoutDay) {
			workoutday = null;
			System.out.println("the day deleted.");
		}
	}
	
	public void editWorkoutDay() {
		System.out.println("what date to edit? : ");
		String workoutDay = input.next();
	}
	
	public void viewTotal() {
		System.out.println("view total");
		workoutday.printInfo();
	}
}
