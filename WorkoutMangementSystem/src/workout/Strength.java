package workout;

import java.util.Scanner;

public class Strength extends WorkoutDay{
	
	public void getUserInput(Scanner input) {
		System.out.print("what day? : ");
		String Day = input.next();
		this.setDay(Day);
		
		System.out.print("what type? : ");
		String type = input.next();
		this.setType(type);
		
		System.out.println("How long did you do the warm-up?(30min is recomended) : (min)");
		int warmUp = input.nextInt();
		if (warmUp>=30) {
			System.out.println("Good Job");
		}
		else {
			System.out.println("need some more warm-up time... too vulnerable to get injuries");
			super.possibleInjury = 1;
		}
		
		System.out.print("how many set? : ");
		int set = input.nextInt();
		this.setSet(set);
		
		System.out.print("how many times per set? : ");
		int numbers = input.nextInt();
		this.setNumbers(numbers);
		
		System.out.print("date : ");
		int date = input.nextInt();
		this.setDate(date);
	}

}
