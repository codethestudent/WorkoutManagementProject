package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class WorkoutDayAddr extends JFrame {
	
	public WorkoutDayAddr() {
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
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 6, 2, 6, 6, 6, 6);
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panel);
		this.setVisible(true);
	}
}
