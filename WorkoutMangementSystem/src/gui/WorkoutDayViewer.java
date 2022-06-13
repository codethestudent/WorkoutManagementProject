package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import manager.DayManage;
import workout.WorkoutInput;

public class WorkoutDayViewer extends JPanel {
	
	WindowFrame frame;
	DayManage dayManage;
	
	public DayManage getDayManage() {
		return dayManage;
	}

	public void setDayManage(DayManage dayManage) {
		this.dayManage = dayManage;
		this.removeAll();
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Day");
		model.addColumn("Type");
		model.addColumn("Set");
		model.addColumn("Numbers");
		model.addColumn("Date");
		
		for(int i =0; i<dayManage.size(); i++) {
			Vector row = new Vector();
			WorkoutInput wi = dayManage.get(i);
			row.add(wi.getDay());
			row.add(wi.getType());
			row.add(wi.getSet());
			row.add(wi.getNumbers());
			row.add(wi.getDate());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		this.add(sp);
	}

	public WorkoutDayViewer(WindowFrame frame,DayManage dayManage) {
		
		this.frame = frame;
		this.dayManage = dayManage;
		
		System.out.println("****" + dayManage.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Day");
		model.addColumn("Type");
		model.addColumn("Set");
		model.addColumn("Numbers");
		model.addColumn("Date");
		
		for(int i =0; i<dayManage.size(); i++) {
			Vector row = new Vector();
			WorkoutInput wi = dayManage.get(i);
			row.add(wi.getDay());
			row.add(wi.getType());
			row.add(wi.getSet());
			row.add(wi.getNumbers());
			row.add(wi.getDate());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		this.add(sp);
	}
}
