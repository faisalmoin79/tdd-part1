package examples.multicurrency.test;

import junit.framework.Assert;


import org.junit.Test;

import examples.multicurrency.Franc;
import examples.multicurrency.Money;
import examples.multicurrency.Dollar;
//problem:
//$5 + 10 CHF = $10 if rate is 2:1
//$5 + 10 * 1 CHF
//$5 + 10 * ($0.5) = $ 10
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
	public void testDollarMultiplication() {
//		fail("Not yet implemented");
//		Dollar five = Currency
//		Dollar five = new Dollar(5); 
		Money five = Money.dollar(5);
		Assert.assertEquals(new Dollar(10), five.times(2));
		Assert.assertEquals(new Dollar(15), five.times(3));
	}

	public void testFrancMultiplication() {
		Money five = Money.franc(5);
		Assert.assertEquals(new Franc(10), five.times(2));
		Assert.assertEquals(new Franc(15), five.times(3));
	}
	
	public void testEquality(){
		Assert.assertTrue(Money.dollar(7).equals(Money.dollar(7)));
		Assert.assertTrue(Money.franc(5).equals(Money.franc(5)));
	}
	
	public void testMultiCurrencyAddition(){
		
	}
}
