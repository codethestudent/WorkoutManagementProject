package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.WindowFrame;
import gui.WorkoutDayViewer;

public class ButtonViewListener implements ActionListener{
	
	WindowFrame frame;

	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		WorkoutDayViewer viewer = frame.getWorkoutDayViewer();
		frame.setupPanel(viewer);
		System.out.println(b.getText());
	}

}
