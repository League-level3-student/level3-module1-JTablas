package _03_IntroToStacks;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Test;

public class _03_TestMatchingBrackets {

	@Test
	public void testMatchingBrackets() {
		assertTrue(doBracketsMatch("{}"));
		assertTrue(doBracketsMatch("{{}}"));
		assertTrue(doBracketsMatch("{}{}{{}}"));
		assertFalse(doBracketsMatch("{{}"));
		assertFalse(doBracketsMatch("}{"));
	}

	// USE A STACK TO COMPLETE THE METHOD FOR CHECKING IF EVERY OPENING BRACKET
	// HAS A MATCHING CLOSING BRACKET
	private boolean doBracketsMatch(String b) {
		System.out.println(b);
		System.out.println("yeet");
		Stack<String> test = new Stack<String>();
		for (int i = 0; i < b.length(); i++) {
			if (b.charAt(i) == '{') {
				test.push("{");
				System.out.println(test);
				System.out.println("yo");
			}
			if (b.charAt(i) == '}'&& test.isEmpty()== false) {
				test.pop();
				System.out.println(test);
				System.out.println("Wo");
			}
		}
		if (test.empty()) {
			System.out.println("True");
			return true;
		} else {
			System.out.println("false");
			return false;
		}
	}

}