package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HangMan implements KeyListener{
	 JFrame frame;
	 JLabel label;
	 Scanner input;
	 Utilities text;
	 String currentWrd;
	 String blanks;
	 int key = 0;
	 int counter = 0;
	 String typed = "";
	public void main(String[] args) {
		 frame = new JFrame("Hangman");
		 label = new JLabel();
		 input = new Scanner(System.in);
		 text = new Utilities();
		 System.out.println("Enter a number between 1 and 266");
		Stack<String> words = new Stack<String>();
		int num = input.nextInt(); 
		
		for(int i=1;i<num;i++) {
			String word;
			word = text.readRandomLineFromFile("dictionary.txt");
			words.push(word);
			
		}
		currentWrd = words.pop();
		frame.add(label);
		blanks = "";
		for(int i=0;i<currentWrd.length();i++) {
			blanks+="_";
		}
		label.setText(blanks);
		frame.setVisible(true);
		frame.addKeyListener(this);
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("KeyPressed");
		String pressed = ""+e.getKeyChar();
		typed = "";
		for(int i=0;i<currentWrd.length();i++) {
			if(currentWrd.charAt(i)==e.getKeyChar()) {
				if(i==0) {
					typed = pressed;
					typed += label.getText().substring(1);
				}else if(i>0&&i<currentWrd.length()) {
					
				}else if(i==currentWrd.length()-1) {
					
				}
			}
		}
		
			frame.remove(label);
			label = new JLabel();
			label.setText(typed);
			frame.add(label);
			frame.setVisible(true);
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
