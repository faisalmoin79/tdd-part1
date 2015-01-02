package examples.multicurrency.test;

import static org.junit.Assert.*;


import org.junit.Test;

import examples.multicurrency.Money;
//problem:
//$5 + 10 CHF = $10 if rate is 2:1
//$5 + 10 * 1 CHF
//$5 + 10 * ($0.5) = $ 10
//$5 + $5 = $10
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
		 assertEquals(Money.dollar(10), Money.dollar(10));
		 assertEquals(Money.dollar(15), five.times(3));
		
	}

	public void testFrancMultiplication() {
		Money five = Money.franc(5);
		assertEquals(Money.franc(15), five.times(2));
		assertEquals(Money.franc(15), five.times(3));
	}
	
	public void testEquality(){
		assertTrue(Money.dollar(5).equals(Money.dollar(5)));
		assertFalse(Money.dollar(5).equals(Money.dollar(6)));
		assertTrue(Money.franc(5).equals(Money.franc(5)));
		assertFalse(Money.franc(5).equals(Money.franc(6)));
		assertFalse(Money.franc(5).equals(Money.dollar(5)));
	}
	
	public void testCurrency(){
		assertEquals("$", Money.dollar(10).getCurrency());
		assertEquals("CHF", Money.franc(10).getCurrency());
	}
	
	//$5 + 10 CHF = $10 if rate is 2:1
	//$5 + 10 * 1 CHF
	//$5 + 10 * ($0.5) = $ 10
	//$5 + $5 = $10
	//how to represent multi-currency arithmatic?
	public void testMultiCurrencyAddition(){
		Money five = Money.dollar(5);
		Sum sum =  (Sum) five.plus(five);// the sum of two monies should be a sum
		Money convertedSum = Bank.convert(sum,"USD");
		 assertEquals(Money.dollar(10),sum);
	}
}
