import java.util.ArrayList;
import java.util.Scanner;

import workout.Cardio;
import workout.Injury;
import workout.Strength;
import workout.WorkoutDay;
import workout.WorkoutKind;

public class DayManage {
	ArrayList<WorkoutDay> wd = new ArrayList<WorkoutDay>();
	Scanner input;  
	Injury injury = new Injury();
	
	DayManage(Scanner input){
		this.input = input;
	}
	
	public void addWorkoutDay(){
		System.out.println("Adding workout day...");
		WorkoutDay workoutDay;
		
		
		int kind = 0;
		
		while (kind != 1 && kind != 2 && kind != 3) {
			System.out.println("1.Strength Building  \n2.Muscle Building  \n3.Cardio");
			System.out.println("select a number between 1 ~ 3 to choose a workout kind : ");
			kind = input.nextInt();
			if (kind == 1){
				workoutDay = new Strength(WorkoutKind.StrengthBuilding);
				workoutDay.getUserInput(input);
				if (workoutDay.injuries == 1) {
					injury.setPossibleInjuries(1);
				}
				wd.add(workoutDay);
				break;
			}
			else if (kind == 2) {
				workoutDay = new WorkoutDay(WorkoutKind.MuscleBuilding);
				workoutDay.getUserInput(input);
				wd.add(workoutDay);
				break;
			}
			else if (kind == 3) {
				workoutDay = new Cardio(WorkoutKind.Cardio);
				workoutDay.getUserInput(input);
				wd.add(workoutDay);
				break;
			}
			else {
				System.out.println("kind num error");
			}
		}
	}
	
	public void deleteWorkoutDay() {
		System.out.println("what date to delete? : ");
		int date = input.nextInt();
		int index = -1;
		for(int i =0 ;i<wd.size(); i++) {
			if (wd.get(i).getDate() == date) {
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
		int Date = input.nextInt();
		
		for(int i=0; i<wd.size(); i++) {
				WorkoutDay workoutDay = wd.get(i);
				index = i;
				if (Date == workoutDay.getDate()) {
				
					int menuChoice = -1;
					
					while(menuChoice != 6) {
						System.out.println("1. Edit the day");
						System.out.println("2. Edit the type of workout");
						System.out.println("3. Edit the number of set");
						System.out.println("4. Edit the number of times");
						System.out.println("5. Edit the date");
						System.out.println("6. Exit");
						
						System.out.print("---- choose a menu ----\n input : ");
						menuChoice = input.nextInt();
						
						System.out.println("The day you want to change is : " + wd.get(index).getDate());
						
						if (menuChoice == 6) {
							System.out.println("editing section end");
							break;
						}
						
						else if (menuChoice == 1) {
							System.out.println("what day to change?");
							String day = input.next();
							workoutDay.setDay(day);
						}
						else if (menuChoice == 2) {
							System.out.println("Change to what type? : ");
							workoutDay.setType(input.next());
						}
						else if (menuChoice == 3) {
							System.out.println("Change to what type? : ");
							workoutDay.setSet(input.nextInt());
						}
						else if (menuChoice == 4) {
							System.out.println("Change the number of times : ");
							workoutDay.setNumbers(input.nextInt());
						}
						else if (menuChoice == 5) {
							System.out.println("Change the date : ");
							workoutDay.setDate(input.nextInt());
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
			
		}System.out.println("possible injuries : " + injury.getPossibleInjuries() + "days");
	}
}
