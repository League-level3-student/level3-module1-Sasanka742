package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


//Copyright The League of Amazing Programmers, 2015

public class _06_IPodShuffle implements ActionListener{
	JFrame frame;
	JPanel panel;
	JButton random;
	JTextField search; 
	JButton searchLink;
	ArrayList<String> songAddresses;
	Song player;
	public _06_IPodShuffle() {
		// 1. Use the Song class the play the demo.mp3 file.
		
				frame = new JFrame("IPod Shuffler");
				panel = new JPanel();
				random = new JButton("Random");
				search = new JTextField("");
				search.setColumns(10);
				searchLink = new JButton("Play Link");
				panel.add(searchLink);panel.add(search);panel.add(random);
				frame.add(panel);frame.setVisible(true);frame.pack();
				random.addActionListener(this);
				searchLink.addActionListener(this);
				player = new Song("demo.mp3");
				//player song list;
				songAddresses = new ArrayList<String>();
				songAddresses.add("demo.mp3");				
		/**
		 * 2. Congratulations on completing the sound check! * Now we want to make an
		 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
		 * "Surprise Me!" button that will play a random song when it is clicked. * If
		 * you're really cool, you can stop all the songs, before playing a new one on
		 * subsequent button clicks.
		 */
		
	}
	
	public static void main(String[] args) {
		new _06_IPodShuffle();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(random.isSelected()) {
			player.stop();
			int rand = new Random().nextInt(songAddresses.size());
			player = new Song(songAddresses.get(rand));
			player.play();
		}
		if(searchLink.isSelected()) {
			player.stop();
			String link = search.getText().toString();
			player = new Song(link);
			player.play();
		}
	}
}