import java.util.InputMismatchException;
import java.util.Scanner;

import exception.DayFormatException;

//메뉴를 보여주고 DayManage 클래스의 메소드들을 호출 하는 메인 테스터 역할.
//여기서 메뉴를 보여주고 사용자가 메뉴를 고르면 DayManage 클래스가 WorkoutDay 객체를 이용하여 기능들을 수행함.

public class WorkoutManagementSys {
	
	public static void main(String[] args) throws DayFormatException {
		Scanner input = new Scanner(System.in);
		DayManage w = new DayManage(input);
		selectMenu(input, w);
	}
	
	public static void selectMenu(Scanner input, DayManage w) throws DayFormatException {
		while(true) { //shows the menus until user exit the code.
			try {
				showMenu();
				int a = input.nextInt();
				
				if (a == 1) { // user adding a info of a work day
					System.out.println("Adding a workout day...");
					w.addWorkoutDay();
				}
				else if(a == 2) { // user deleting a especial work day
					System.out.println("Deleting a workout day...");
					w.deleteWorkoutDay();
				}
				else if (a == 3) {
					System.out.println("Editing a workoutday...");
					w.editWorkoutDay();
				}
				else if (a == 4) {
					System.out.println("Viewing total workout days...");
					w.viewTotal();
				}
				else if (a == 5) {
					System.out.println("Show menu...");
					continue;
				}
				else {
					System.out.println("program exit.");
					break;
				}
			}catch(InputMismatchException e) {
				System.out.println("please enter number 1~6!");
				if (input.hasNext()) {
					input.next();
				}
			}
		}
	}
	
	public static void showMenu() {
		System.out.println("1. Add Workout days");
		System.out.println("2. Delete Workout days");
		System.out.println("3. Edit Workout day");
		System.out.println("4. View total Workout days");
		System.out.println("5. Show menu");
		System.out.println("6. Exit");
		System.out.print("---- choose a menu ----\n input : ");
	}
}
