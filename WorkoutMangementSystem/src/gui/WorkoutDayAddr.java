package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import event.WorkoutDayAdderCancelListener;
import event.WorkoutDayAdderListener;
import manager.DayManage;

public class WorkoutDayAddr extends JPanel {
	
	WindowFrame frame;
	DayManage dayManage;
	
	public WorkoutDayAddr(WindowFrame frame, DayManage dayManage) {
		
		this.frame = frame;
		this.dayManage = dayManage;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout()); 
		
		JLabel labelDAY = new JLabel("DAY : ", JLabel.TRAILING);
		JTextField fieldDAY = new JTextField(10);
		labelDAY.setLabelFor(fieldDAY);
		panel.add(labelDAY);
		panel.add(fieldDAY);
		
		JLabel labelDATE = new JLabel("DATE : ", JLabel.TRAILING);
		JTextField fieldDATE = new JTextField(10);
		labelDATE.setLabelFor(fieldDATE);
		panel.add(labelDATE);
		panel.add(fieldDATE);
		
		JLabel labelTYPE = new JLabel("TYPE : ", JLabel.TRAILING);
		JTextField fieldTYPE = new JTextField(10);
		labelTYPE.setLabelFor(fieldTYPE);
		panel.add(labelTYPE);
		panel.add(fieldTYPE);
		
		JLabel labelSET = new JLabel("SET : ", JLabel.TRAILING);
		JTextField fieldSET = new JTextField(10);
		labelSET.setLabelFor(fieldSET);
		panel.add(labelSET);
		panel.add(fieldSET);
		
		JLabel labelNUMBERS = new JLabel("NUMBERS : ", JLabel.TRAILING);
		JTextField fieldNUMBERS = new JTextField(10);
		labelNUMBERS.setLabelFor(fieldNUMBERS);
		panel.add(labelNUMBERS);
		panel.add(fieldNUMBERS);
		
		JButton saveButton = new JButton("save");
		saveButton.addActionListener(new WorkoutDayAdderListener(fieldDAY, fieldTYPE, fieldSET, fieldNUMBERS, fieldDATE, dayManage));
		
		JButton cancelButton = new JButton("cancel");
		cancelButton.addActionListener(new WorkoutDayAdderCancelListener(frame));
		
		panel.add(saveButton);
		panel.add(cancelButton);
		
		SpringUtilities.makeCompactGrid(panel, 6, 2, 6, 6, 6, 6);
		
		this.add(panel);
		this.setVisible(true);
	}
}
