package _03_IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class _01_IntroToStack {
	public static void main(String[] args) {
		// 1. Create a Stack of Doubles
		// Don't forget to import the Stack class
		Stack<Double> doub = new Stack<Double>();
		// 2. Use a loop to push 100 random doubles between 0 and 100 to the
		// Stack.
		Random ran = new Random();
		for (int i = 0; i < 100; i++) {
			doub.push(ran.nextDouble() * 100);
		}
		System.out.println(doub);
		// 3. Ask the user to enter in two numbers between 0 and 100, inclusive.
		String num = JOptionPane.showInputDialog("Choose any number between 0 and 100");
		int numb = Integer.parseInt(num);
		String nume = JOptionPane.showInputDialog("Choose another number between 0 and 100");
		int numbe = Integer.parseInt(nume);
		int small = 0;
		int big = 0;
		if (numb < numbe) {
			small = numb;
			big = numbe;
		} else {
			small = numbe;
			big = numb;
		}
		System.out.println(small);
		System.out.println(big);
		// 4. Pop all the elements off of the Stack. Every time a double is
		// popped that is
		// between the two numbers entered by the user, print it to the screen.
		for (int i = 0; i < doub.size(); i++) {

			if (doub.get(i) > small && doub.get(i) < big) {
				System.out.println(doub.get(i));
			}
		}
		// EXAMPLE:
		// NUM 1: 65
		// NUM 2: 75

		// Popping elements off stack...
		// Elements between 65 and 75:
		// 66.66876846
		// 74.51651681
		// 70.05110654
		// 69.21350456
		// 71.54506465
		// 66.47984807
		// 74.12121224
	}
}
