package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.DayManage;

public class WindowFrame extends JFrame{
	
	DayManage dayManage;
	
	MenuSelection menuSelection;
	WorkoutDayAddr workoutDayAddr;
	WorkoutDayViewer workoutDayViewer;

	
	public WindowFrame(DayManage dayManage) {
		// TODO Auto-generated constructor stub
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("my frame");
		
		this.dayManage = dayManage;
		menuSelection = new MenuSelection(this);
		workoutDayAddr = new WorkoutDayAddr(this);
		workoutDayViewer = new WorkoutDayViewer(this, this.dayManage);

		
		this.setupPanel(menuSelection);
		this.setVisible(true);
	}
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.add(panel); 
		this.revalidate();
		this.repaint();
	}
	public MenuSelection getMenuSelection() {
		return menuSelection;
	}
	public void setMenuSelection(MenuSelection menuSelection) {
		this.menuSelection = menuSelection;
	}
	public WorkoutDayAddr getWorkoutDayAddr() {
		return workoutDayAddr;
	}
	public void setWorkoutDayAddr(WorkoutDayAddr workoutDayAddr) {
		this.workoutDayAddr = workoutDayAddr;
	}
	public WorkoutDayViewer getWorkoutDayViewer() {
		return workoutDayViewer;
	}
	public void setWorkoutDayViewer(WorkoutDayViewer workoutDayViewer) {
		this.workoutDayViewer = workoutDayViewer;
	}

}
