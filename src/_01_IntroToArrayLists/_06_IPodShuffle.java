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
	public _06_IPodShuffle() {
		// 1. Use the Song class the play the demo.mp3 file.
				JFrame frame = new JFrame("IPod Shuffler");
				JPanel panel = new JPanel();
				JButton random = new JButton("Random");
				JTextField search = new JTextField("Link");
				search.setColumns(10);
				JButton searchLink = new JButton("Play Link");
				panel.add(searchLink);panel.add(search);panel.add(random);
				frame.add(panel);frame.setVisible(true);frame.pack();
				random.addActionListener(this);
				searchLink.addActionListener(this);
				
				Song player = new Song("demo.mp3");
				//player.play();
				ArrayList<String> strongAddresses = new ArrayList<String>();
				strongAddresses.add("https://tif.fjrifj.frl/a4bd09b62495bc98dfb640c4be7114b1/xUNqsfFUwhY/razunzcsuzceo");
				strongAddresses.add("https://ijl.fjrifj.frl/a42196ca8eaaca081d86064be099e4aa/45cYwDMibGo/rawunwcsuwceo");
				strongAddresses.add("https://ftl.fjrifj.frl/aa370c876a0e4caa54c3f4e5a4f731bf/NrgmdOz227I/rawunwcsuwceo");
				strongAddresses.add("https://jjj.fjrifj.frl/1e16227895f3b6751b3f25b726a050cd/QDYfEBY9NM4/raxunxcsuxceo");
				strongAddresses.add("");
				
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
		
	}
}