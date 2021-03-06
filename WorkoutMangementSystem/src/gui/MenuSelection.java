package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import event.ButtonAddListener;
import event.ButtonViewListener;

public class MenuSelection extends JPanel{
	
	WindowFrame frame;
	
	public MenuSelection(WindowFrame frame) {
		
		this.frame = frame;
		
		this.setLayout(new BorderLayout());
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JLabel label = new JLabel("Menu selection");
		JButton b1 = new JButton("add workout day");
		JButton b2 = new JButton("delete workout day");
		JButton b3 = new JButton("edit workout day");
		JButton b4 = new JButton("view workout day");
		JButton b5 = new JButton("show menu");
		JButton b6 = new JButton("exit");
		
		b1.addActionListener(new ButtonAddListener(frame));
		b4.addActionListener(new ButtonViewListener(frame));
		
		panel1.add(label);
		panel2.add(b1);
		panel2.add(b2);
		panel2.add(b3);
		panel2.add(b4);
		panel2.add(b5);
		panel2.add(b6);
		
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);

	}
}
