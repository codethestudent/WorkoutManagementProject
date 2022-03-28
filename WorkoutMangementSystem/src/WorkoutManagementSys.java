import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WorkoutManagementSys {
	
	public static void addWorkoutDay(){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Adding workout day...");
		System.out.print("what day? : ");
		String workoutDays = input.next();
				
		WorkoutDay workoutDay = new WorkoutDay();
		
		workoutDay.array.add(workoutDays);
		System.out.println(WorkoutDay.array);
		
	}
	
	public static void deleteWorkoutDay() {
		
	}
	
	public static void editWorkoutDay() {
		
	}
	
	public static void viewTotal() {
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		while(true) { //show the menus until user exit the code.
			System.out.println("1. Add Workout days");
			System.out.println("2. Delete Workout days");
			System.out.println("3. Edit Workout day");
			System.out.println("4. View total Workout days");
			System.out.println("5. Show menu");
			System.out.println("6. Exit");
			System.out.print("---- choose a menu ----\n input : ");
			
			int a = input.nextInt();
			
			if (a == 1) { // user adding a info of a work day
				
				addWorkoutDay();
				
			}
			else if(a == 2) { // user deleting a especial work day
				System.out.println("Deleting a workout day...");
				deleteWorkoutDay();
			}
			else if (a == 3) {
				System.out.println("Editing a workoutday...");
				editWorkoutDay();
			}
			else if (a == 4) {
				System.out.println("Viewing total workout days...");
				viewTotal();
			}
			else if (a == 5) {
				System.out.println("Show menu...");
				continue;
			}
			else {
				System.out.println("program exit.");
				break;
			}
		}
		

	}

}
