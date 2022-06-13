package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.WindowFrame;

public class WorkoutDayAdderCancelListener implements ActionListener{
	
	WindowFrame frame;

	public WorkoutDayAdderCancelListener(WindowFrame frame) {
		this.frame = frame;
	}
	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getMenuSelection());
		frame.revalidate();
		frame.repaint();
	}

}
