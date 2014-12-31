package examples.multicurrency.test;

import junit.framework.Assert;


import org.junit.Test;

import examples.multicurrency.Dollar;

public class DollarTest {

	@Test
	public void testMultiply() {
//		fail("Not yet implemented");
		Dollar five = new Dollar(5); 
		Dollar product = five.times(2);
		Assert.assertEquals(new Dollar(10), five.getAmount());
	}

	public void testEquality(){
		Assert.assertTrue(new Dollar(5).equals(new Dollar(5)));
	}
}
