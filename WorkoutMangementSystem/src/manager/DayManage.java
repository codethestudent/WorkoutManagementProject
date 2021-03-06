package manager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import exception.DayFormatException;
import workout.Cardio;
import workout.Injury;
import workout.MuscleBuild;
import workout.Strength;
import workout.WorkoutInput;
import workout.WorkoutKind;

public class DayManage implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -924934536743963328L;
	
	ArrayList<WorkoutInput> wd = new ArrayList<WorkoutInput>();
	transient Scanner input;  
	Injury injury = new Injury();
	Strength stre;
	
	DayManage(Scanner input){
		this.input = input;
	}
	public void setScanner(Scanner input2) {
		this.input = input2;
	}
	
	public void addWorkoutDay(String day, String type, String set, String numbers, String date) {
		WorkoutInput workoutInput = new MuscleBuild(WorkoutKind.MuscleBuilding);
		workoutInput.getUserInput(input);
		wd.add(workoutInput);
	}
	public void addWorkoutDay(WorkoutInput workoutInput) {
		wd.add(workoutInput);
	}
	
	public void addWorkoutDay(){
		
		WorkoutInput workoutInput;
		
		int kind = 0;
		
		while (kind != 1 && kind != 2 && kind != 3) {
			try {
				System.out.println("\n1.Strength Building  \n2.Muscle Building  \n3.Cardio");
				System.out.println("select a number between 1 ~ 3 to choose a workout kind : ");
				kind = input.nextInt();
				if (kind == 1){
					workoutInput = new Strength(WorkoutKind.StrengthBuilding);
					workoutInput.getUserInput(input);
					if (Strength.injuries == 1) {
						injury.setPossibleInjuries(1);
					}
					wd.add(workoutInput);
					//System.out.println(stre.injuries);
					break;
				}
				else if (kind == 2) {
					workoutInput = new MuscleBuild(WorkoutKind.MuscleBuilding);
					workoutInput.getUserInput(input);
					wd.add(workoutInput);
					break;
				}
				else if (kind == 3) {
					workoutInput = new Cardio(WorkoutKind.Cardio);
					workoutInput.getUserInput(input);
					wd.add(workoutInput);
					break;
				}
				else {
					System.out.println("kind num error");
				}
			}catch(InputMismatchException e) {
				System.out.println("please enter a number between 1 ~ 3");
				if (input.hasNext()) {
					input.next();
				}
				kind = -1;
		
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
	
	public void editWorkoutDay() throws DayFormatException {
		int index = 0;
		System.out.println("what date to edit? : ");
		int Date = input.nextInt();
		
		for(int i=0; i<wd.size(); i++) {
				WorkoutInput workoutInput = wd.get(i);
				index = i;
				if (Date == workoutInput.getDate()) {
				
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
							workoutInput.setDay(day); 
						}
						else if (menuChoice == 2) {
							System.out.println("Change to what type? : ");
							workoutInput.setType(input.next());
						}
						else if (menuChoice == 3) {
							System.out.println("Change to what type? : ");
							workoutInput.setSet(input.nextInt());
						}
						else if (menuChoice == 4) {
							System.out.println("Change the number of times : ");
							workoutInput.setNumbers(input.nextInt());
						}
						else if (menuChoice == 5) {
							System.out.println("Change the date : ");
							workoutInput.setDate(input.nextInt());
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
			
		}System.out.println("possible injuries : " + injury.getPossibleInjuries() + " days");
	}
	
	public int size() {
		return wd.size();
	}
	
	public WorkoutInput get(int index) {
		return wd.get(index);
	}

	
}
