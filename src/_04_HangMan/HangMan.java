package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HangMan implements KeyListener{
	 JFrame frame;
	 Scanner input;
	 Utilities text;
	public void main(String[] args) {
		 frame = new JFrame("Hangman");
		 JLabel label = new JLabel();
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
		String currentWrd = words.pop();
		frame.add(label);
		String blanks = "";
		for(int i=0;i<currentWrd.length();i++) {
			blanks+="_ ";
		}
		label.setText(blanks);
		frame.setVisible(true);
		label.addKeyListener(this);
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyChar()==)
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
