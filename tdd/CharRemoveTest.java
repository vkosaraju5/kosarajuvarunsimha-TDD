package JUNIT.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CharRemoveTest {
	
	/*1.ABCD - BCD
	 * 2.AACD - CD
	 * 3.BACD - BCD
	 * 4.BBAA - BBAA
	 * 5.AABAA - BAA
	 * 6.B - B
	 * 7.A - ""
	 * 8.AA - ""
	 * 9."" - ""
	 */
	
	Removal rem;
	@BeforeEach
	void setup() {
		 rem = new Removal();
	}
	
	@Test
	
	void testNChars() {
		assertEquals("BCD",rem.remove("ABCD"));
		assertEquals("CD",rem.remove("AACD"));
		assertEquals("BCD",rem.remove("BACD"));
		assertEquals("BBAA",rem.remove("BBAA"));
		assertEquals("BAA",rem.remove("AABAA"));
	}
	
	void test1Char() {
		assertEquals("",rem.remove("A"));
		assertEquals("B",rem.remove("B"));
		
	}
	
	void testNoChar() {
		assertEquals("",rem.remove(""));
	}
	
	
}
