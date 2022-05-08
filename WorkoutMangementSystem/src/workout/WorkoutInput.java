package workout;

import java.util.Scanner;

public interface WorkoutInput {
	
	public String getDay();
	public int getDate();
	public void setDay(String day);
	public void setType(String type);
	public void setNumbers(int numbers);
	public void setSet(int set);
	public void setDate(int date);
	public void getUserInput(Scanner input); 
	public void printInfo();

}
