package jUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStr {

	@Test
	public void test() {
		testClass jstr = new testClass();
		String result = jstr.addStr("abc", "def");
		assertEquals("abcdef",result);
	}
}
