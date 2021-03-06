package _03_IntroToStacks;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class _02_TextUndoRedo implements KeyListener {
	/*
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should
	 * look like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last
	 * character is erased from the JLabel. Save that deleted character onto a
	 * Stack of Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is
	 * pressed, the top Character is popped off the Stack and added back to the
	 * JLabel.
	 * 
	 */

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();

	Stack<String> letters = new Stack<String>();

	_02_TextUndoRedo() {
		frame.setVisible(true);
		panel.setVisible(true);
		label.setVisible(true);

		frame.setSize(400, 300);

		frame.add(panel);
		panel.add(label);
		frame.addKeyListener(this);

	}

	public static void main(String[] args) {
		_02_TextUndoRedo undoRedo = new _02_TextUndoRedo();
	}

	public void keyPressed(KeyEvent e) {
		String order = label.getText();

		// System.out.println(e.getKeyChar());

		if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {

			String ord = order.substring(0, order.length() - 1);
			label.setText(ord);
			letters.push(order.substring(order.length() - 1));
			System.out.println(letters);

		} else if (e.getKeyCode() == KeyEvent.VK_UP) {
			
			label.setText(order + letters.pop());
			System.out.println("tab");
		} else {
			label.setText(order + e.getKeyChar());
		}
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
