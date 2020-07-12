package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_GuestBook implements ActionListener{
	 // Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	JFrame frame;
	JPanel panel;
	JButton addName;
	JButton viewName;
	ArrayList<String> names;
	public static void main(String[] args) {
		_02_GuestBook nameBook = new _02_GuestBook();
		nameBook.build();
	}
	
	void build() {
		frame = new JFrame("Names");
		panel = new JPanel();
		addName = new JButton("Add Name");
		viewName = new JButton("View Names");
		names = new ArrayList<String>();
		panel.add(addName);
		panel.add(viewName);
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
		addName.addActionListener(this);
		viewName.addActionListener(this);
	}
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(addName)) {
		 String name = JOptionPane.showInputDialog("Enter a name: ");
		 names.add(name);
		}else if(e.getSource().equals(viewName)) {
			for(String s: names) {
				System.out.println(s+" - ");
			}
		}
		
	}
	
	
	
}
