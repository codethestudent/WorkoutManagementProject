package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.WindowFrame;
import gui.WorkoutDayAddr;
import gui.WorkoutDayViewer;

public class ButtonAddListener implements ActionListener{
	
	WindowFrame frame;

	public ButtonAddListener(WindowFrame frame) {
		this.frame = frame;
	}
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		WorkoutDayAddr adder = frame.getWorkoutDayAddr();
		frame.setupPanel(adder);
		System.out.println(b.getText());
	}

}
