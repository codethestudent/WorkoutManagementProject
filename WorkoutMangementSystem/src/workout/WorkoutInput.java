package workout;

import java.util.Scanner;

import exception.DayFormatException;

public interface WorkoutInput {
	
	public String getDay();
	
	public void setDay(String day) throws DayFormatException;
	
	public void setType(String type);
	
	public String getType();
	
	public void setNumbers(int numbers);
	
	public int getNumbers();
	
	public void setSet(int set);
	
	public int getSet();
	
	public void setDate(int date);
	
	public int getDate();
	
	public void getUserInput(Scanner input); 
	
	public void printInfo();

}
