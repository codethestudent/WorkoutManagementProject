package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import gui.WindowFrame;
import gui.WorkoutDayViewer;
import manager.DayManage;

public class ButtonViewListener implements ActionListener{
	
	WindowFrame frame;

	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}
	public void actionPerformed(ActionEvent e) {
		WorkoutDayViewer workoutDayViewer = frame.getWorkoutDayViewer();
		DayManage dayManage = getObject("WorkoutDayManager.ser");
		workoutDayViewer.setDayManage(dayManage);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(workoutDayViewer); 
		frame.revalidate();
		frame.repaint();
	
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
}
