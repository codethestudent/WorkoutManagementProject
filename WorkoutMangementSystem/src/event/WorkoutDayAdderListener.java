package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import exception.DayFormatException;
import manager.DayManage;
import workout.MuscleBuild;
import workout.Strength;
import workout.WorkoutInput;
import workout.WorkoutKind;

public class WorkoutDayAdderListener implements ActionListener {

	JTextField fieldDay;
	JTextField fieldType;
	JTextField fieldSet;
	JTextField fieldNumbers;
	JTextField fieldDate;
	
	DayManage dayManage;
	
	public WorkoutDayAdderListener(
			JTextField fieldDay, 
			JTextField fieldType, 
			JTextField fieldSet,
			JTextField fieldNumbers,
			JTextField fieldDate, 
			DayManage dayManage) {
		this.fieldDay = fieldDay;
		this.fieldType = fieldType;
		this.fieldSet = fieldSet;
		this.fieldNumbers = fieldNumbers;
		this.fieldDate = fieldDate;
		this.dayManage = dayManage;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		WorkoutInput workoutday = new MuscleBuild(WorkoutKind.MuscleBuilding);
		try {
			workoutday.setDay(fieldDay.getText());
			workoutday.setType(fieldType.getText());
			workoutday.setSet(Integer.parseInt(fieldSet.getText()));
			workoutday.setNumbers(Integer.parseInt(fieldNumbers.getText()));
			workoutday.setDate(Integer.parseInt(fieldDate.getText()));
			dayManage.addWorkoutDay(workoutday);
			putObject(dayManage, "WorkoutDayManager.ser");
			workoutday.printInfo();
		} catch (DayFormatException e1) {
			e1.printStackTrace();
		}
		
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
