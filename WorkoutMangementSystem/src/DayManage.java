import java.util.ArrayList;
import java.util.Scanner;

public class DayManage {
	ArrayList<WorkoutDay> wd = new ArrayList<WorkoutDay>();
	Scanner input;  

	DayManage(Scanner input){
		this.input = input;
	}
	
	public void addWorkoutDay(){
		WorkoutDay workoutday = new WorkoutDay();
		System.out.println("Adding workout day...");
		
		System.out.print("what day? : ");
		workoutday.  Day = input.next();
		System.out.print("what type? : ");
		workoutday.type = input.next();
		System.out.print("how many set? : ");
		workoutday.set = input.nextInt();
		System.out.print("how many times per set? : ");
		workoutday.numbers = input.nextInt();
		System.out.print("date : ");
		workoutday.date = input.nextInt();
		wd.add(workoutday);
	}
	
	public void deleteWorkoutDay() {
		System.out.println("what date to delete? : ");
		int date = input.nextInt();
		int index = -1;
		for(int i =0 ;i<wd.size(); i++) {
			if (wd.get(i).date == date) {
				index = i;
				break;
			}
		}
		if (index >= 0) {
			wd.remove(index);
			System.out.println("The date is deleted.");
		}
		else {
			System.out.println("the day is not registered.");
		}
		
	}
	
	public void editWorkoutDay() {
		int index = 0;
		System.out.println("what date to edit? : ");
		int Day = input.nextInt();
		
		for(int i=0; i<wd.size(); i++) {
				WorkoutDay workoutDay = wd.get(i);
				index = i;
				if (Day == workoutDay.date) {
				
					int menuChoice = -1;
					
					while(menuChoice !=6) {
						System.out.println("1. Edit the day");
						System.out.println("2. Edit the type of workout");
						System.out.println("3. Edit the number of set");
						System.out.println("4. Edit the number of times");
						System.out.println("5. Edit the date");
						System.out.println("6. Exit");
						
						System.out.print("---- choose a menu ----\n input : ");
						menuChoice = input.nextInt();
						
						System.out.println("The day you want to change is : " + wd.get(index).date);
						
						if (menuChoice == 6) {
							System.out.println("editing section end");
							break;
						}
						
						else if (menuChoice == 1) {
							System.out.println("what day to change?");
							
							workoutDay.Day = input.next();
						}
						else if (menuChoice == 2) {
							System.out.println("Change to what type? : ");
							wd.get(index).type = input.next();
						}
						else if (menuChoice == 4) {
							System.out.println("Change the number of times : ");
							wd.get(index).numbers = input.nextInt();
						}
						else if (menuChoice == 5) {
							System.out.println("Change the date : ");
							wd.get(index).date = input.nextInt();
						}
						else {
							continue;
						}//if
						
					}//while
					break;
				}//if
		}//for
	}
	
	public void viewTotal() {
		System.out.println("view total");
		for(int i =0; i<wd.size(); i++) {
			wd.get(i).printInfo();
		}
	}
}
