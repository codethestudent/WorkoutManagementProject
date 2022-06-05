package manager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import exception.DayFormatException;
import gui.WindowFrame;
import log.EventLogger;
import workout.Strength;

//메뉴를 보여주고 DayManage 클래스의 메소드들을 호출 하는 메인 테스터 역할.
//여기서 메뉴를 보여주고 사용자가 메뉴를 고르면 DayManage 클래스가 WorkoutDay 객체를 이용하여 기능들을 수행함.

public class WorkoutManagementSys {
	static EventLogger logger = new EventLogger("log.txt");
	
	public static void main(String[] args) throws DayFormatException {
		
		Scanner input = new Scanner(System.in);
		DayManage w = getObject("WorkoutDayManager.ser");
		if (w == null) {
			w = new DayManage(input);
		}
		else {
			w.setScanner(input);
		}
		WindowFrame frame = new WindowFrame(w);
		selectMenu(input, w);
		putObject(w, "WorkoutDayManager.ser");
	}
	
	public static void selectMenu(Scanner input, DayManage w) throws DayFormatException {
		while(true) { //shows the menus until user exit the code.
			try {
				showMenu();
				int a = input.nextInt();
				
				if (a == 1) { // user adding a info of a work day
					System.out.println("Adding a workout day...");
					w.addWorkoutDay();
					logger.log("add a workout day");
				}
				else if(a == 2) { // user deleting a especial work day
					System.out.println("Deleting a workout day...");
					w.deleteWorkoutDay();
					logger.log("deleting a workout day");
				}
				else if (a == 3) {
					System.out.println("Editing a workout day...");
					w.editWorkoutDay();
					logger.log("edit a workout day");
				}
				else if (a == 4) {
					System.out.println("Viewing total workout days...");
					w.viewTotal();
					logger.log("view total");
				}
				else if (a == 5) {
					System.out.println("Show menu...");
					logger.log("showing a menu");
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
	public static DayManage getObject(String filename) {
		DayManage w = null;
		
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			w = (DayManage) in.readObject();
			
			in.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			return w;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return w;
	}
	
	public static void putObject(DayManage w, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(w);
			out.writeObject(Strength.injuries);
			
			out.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
