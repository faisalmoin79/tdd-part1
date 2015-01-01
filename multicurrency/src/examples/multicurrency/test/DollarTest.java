package examples.multicurrency.test;

import junit.framework.Assert;


import org.junit.Test;

import examples.multicurrency.Currency;
import examples.multicurrency.Dollar;
//problem:
//$5 + 10 CHF = $10 if rate is 2:1
//need to make a common currency class

//rule: 
//1. write test
//2. compile test
//3. run to see if it fails
//4. make it run
//5. make it right
//6. remove duplication
public class DollarTest {

	@Test
	public void testMultiply() {
//		fail("Not yet implemented");
//		Dollar five = Currency
//		Dollar five = new Dollar(5); 
		Dollar five = Currency.dollar(5);
		Assert.assertEquals(new Dollar(10), five.times(2));
		
	}

	public void testEquality(){
		Assert.assertTrue(new Dollar(5).equals(new Dollar(5)));
	}
}
