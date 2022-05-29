package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class WorkoutDayViewer extends JFrame {
	public WorkoutDayViewer() {
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Day");
		model.addColumn("Type");
		model.addColumn("Set");
		model.addColumn("Numbers");
		model.addColumn("Date");
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		this.add(sp);
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
