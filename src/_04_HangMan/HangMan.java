package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan implements KeyListener {
	int wordnum;
	Stack<String> hang = new Stack<String>();

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();

	int lives = 5;

	String wo;
	String spaces = "";

	public static void main(String[] args) {
		HangMan stuff = new HangMan();
	}

	HangMan() {
		String wordcho = JOptionPane.showInputDialog("Choose a number between 1 and 266.");
		wordnum = Integer.parseInt(wordcho);

		System.out.println(wordnum);

		for (int i = 0; i < wordnum; i++) {
			hang.push(Utilities.readRandomLineFromFile("dictionary.txt"));
			System.out.println(hang);
		}

		int let = 0;

		wo = hang.pop();

		for (int i = 0; i < wo.length(); i++) {

			spaces += "_";
		}
		System.out.println(spaces);

		label.setText(spaces);
		panel.add(label);
		frame.add(panel);
		frame.setTitle("HangMan");
		frame.addKeyListener(this);

		frame.setVisible(true);
		panel.setVisible(true); 
		label.setVisible(true);

		frame.pack();
		
		if (spaces.) {
			
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		char type = e.getKeyChar();
		String blank = "";
		for (int i = 0; i < wo.length(); i++) {
			if (wo.charAt(i) == type) {
				blank +=wo.charAt(i);
			}else{
				blank += spaces.charAt(i);
			}
		}
		spaces = blank;
		label.setText(spaces);
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

}
