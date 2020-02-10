package _04_HangMan;

import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan {

	public static void main(String[] args) {
		String wordcho = JOptionPane.showInputDialog("Choose a number between 1 and 266.");
		int wordnum = Integer.parseInt(wordcho);
		System.out.println(wordnum);
		Stack<Utilities> util = new Stack<Utilities>();

		Stack<String> hang = new Stack<String>();

		for (int i = 0; i < wordnum; i++) {
			hang.push(Utilities.readRandomLineFromFile("dictionary.txt"));
			System.out.println(hang);
		}
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();

		
		
	}

}
