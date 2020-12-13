package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements ActionListener {
  /* 
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * Create a GUI with three buttons. 
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 * 
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 *
	 * */
	HashMap<Integer,String> names = new HashMap<Integer, String>();
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton("Add");
	JButton idSearch = new JButton("Search by ID");
	JButton list = new JButton("Expand List");
	JButton remove  = new JButton("Delete Entry");
	
	public void run() {
		//components to panel
		panel.add(add);panel.add(idSearch);panel.add(list);panel.add(remove);
		//panel to frame
		frame.add(panel);
		//setup frame up
		frame.setVisible(true);frame.pack();
		add.addActionListener(this);
		idSearch.addActionListener(this);
		list.addActionListener(this);
		remove.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(add)) {
			String inputID = JOptionPane.showInputDialog("Enter an ID: ");
			String inputName = JOptionPane.showInputDialog("Enter the name: ");
			
			names.put(Integer.parseInt(inputID), inputName);
			
		}
		if(e.getSource().equals(idSearch)) {
			String inputID = JOptionPane.showInputDialog("Enter an ID: ");
			
			if(names.containsKey(Integer.parseInt(inputID))) {
				JOptionPane.showMessageDialog(null, names.get(Integer.parseInt(inputID)));
			}
		}
		if(e.getSource().equals(list)) {
			String fullList = "";
			
 			
 		
		}
		if(e.getSource().equals(remove)) {
			String inputID = JOptionPane.showInputDialog("Enter an ID: ");
			
			if(names.containsKey(Integer.parseInt(inputID))) {
				names.remove(Integer.parseInt(inputID));
			}
		}
	}
	
	
	
}
