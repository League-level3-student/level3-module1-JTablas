package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

//Copyright The League of Amazing Programmers, 2015

public class _06_IPodShuffle implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton button;
	

	Boolean truth = false;

	ArrayList<Song> playlist;

	public _06_IPodShuffle() {
		// 1. Use the Song class the play the demo.mp3 file.
		Song sing = new Song("demo.mp3");
		sing.setDuration(20);

		/**
		 * 2. Congratulations on completing the sound check! * Now we want to
		 * make an iPod Shuffle that plays random music. * Create an ArrayList
		 * of Songs and a "Surprise Me!" button that will play a random song
		 * when it is clicked. * If you're really cool, you can stop all the
		 * songs, before playing a new one on subsequent button clicks.
		 */
		playlist = new ArrayList<Song>();
		playlist.add(sing);

	}

	public static void main(String[] args) {

		new _06_IPodShuffle().start();
	}

	public void start() {
		frame = new JFrame("IPod Shuffle");
		panel = new JPanel();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton();
		button.addActionListener(this);
		

		frame.add(panel);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setVisible(true);
		panel.add(button);
		
		button.setText("Surprise Me!");
		

		if (truth = true) {
			for (int i = 0; i < playlist.size(); i++) {
				playlist.get(0).play();

			}
		}


	}

	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton) e.getSource();
		if (buttonClicked.equals(button)) {
			truth = true;
			System.out.println("truth");
		}
		

	}

}