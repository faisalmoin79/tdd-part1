package examples.multicurrency.test;

import examples.multicurrency.Expression;
import examples.multicurrency.Money;

public class Bank {

	public static Money convert(Expression source, String currency) {
		Sum sum= (Sum) source;
		return sum.convert(currency);
	}

}
