package _04_HangMan;

import javax.swing.JOptionPane;

public class HangMan{
	
	public static void main(String[] args) {
		String wordcho = JOptionPane.showInputDialog("Choose a number between 1 and 266.");
		int wordnum = Integer.parseInt(wordcho);
	Utilities.readRandomLineFromFile(wordcho);
	}
	
}
