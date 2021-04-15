package jUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNum {
	
	@Test
	public void test() {
		testClass junit = new testClass();
		int result = junit.addNumbers(20, 20);
		assertEquals(40, result);
	}

}
