package examples.multicurrency.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import examples.multicurrency.Dollar;

public class DollarTest {

	@Test
	public void testMultiply() {
//		fail("Not yet implemented");
		Dollar five = new Dollar(5);
		five.multiply(2);
		assertEquals(10, five.getAmount());
	}

}
