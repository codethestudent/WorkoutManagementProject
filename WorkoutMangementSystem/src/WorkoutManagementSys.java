import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WorkoutManagementSys {
	
	public static void addWorkoutday(){
		List<String> array = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		System.out.println("Adding workout day...");
		System.out.print("what day? : ");
		String workoutDay = input.next();
				
		array.add(workoutDay);
		
		System.out.println(array);
		int i = 0;
		i = i+1;
	}
	
	public static void deleteWorkoutday() {
		
	}
	
	public static void editWorkoutday() {
		
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
				addWorkoutday();
				
			}
			else if(a == 2) { // user deleting a especial work day
				System.out.println("Deleting a workout day...");
			}
			else if (a == 3) {
				System.out.println("Editing a workoutday...");
				
			}
			else if (a == 4) {
				System.out.println("Viewing total workout days...");
			}
			else if (a == 5) {
				System.out.println("Show menu...");
			}
			else {
				System.out.println("program exit.");
				break;
			}
		}
		

	}

}
