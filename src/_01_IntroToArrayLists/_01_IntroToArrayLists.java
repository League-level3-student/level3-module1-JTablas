package _01_IntroToArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		// 1. Create an array list of Strings
		// Don't forget to import the ArrayList class
		ArrayList<String> things = new ArrayList<String>();
		// 2. Add five Strings to your list
		things.add("YO");
		things.add("WHATS");
		things.add("UP");
		things.add("YOU'RE");
		things.add("CRAZY");
		// 3. Print all the Strings using a standard for-loop
		for (int i = 0; i < things.size(); i++) {
			String s = things.get(i);
			System.out.println(s);
		}

		// 4. Print all the Strings using a for-each loop
		for (String s : things) {
			System.out.println(s);
		}
		// 5. Print only the even numbered elements in the list.
		for (int i = 0; i < things.size(); i += 2) {
			String j= things.get(i);
			System.out.println(j);
		}
		// 6. Print all the Strings in reverse order.
		for (int i = things.size()-1; i > 0; i--) {
			String s = things.get(i);
			System.out.println(s);
		}
		// 7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < things.size(); i++) {
			String q = things.get(i);
			if(q.contains("e")){
			System.out.println(q);
		}
		}
	}
}
