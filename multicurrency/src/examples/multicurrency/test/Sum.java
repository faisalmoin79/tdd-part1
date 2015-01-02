package examples.multicurrency.test;

import examples.multicurrency.Expression;
import examples.multicurrency.Money;

public class Sum implements Expression {
	Money augend;
	Money addend;

	public Sum(Money augend,Money addend){

	}
	public Money convert(String to) {
		int amount= augend.getAmount() + addend.getAmount();
		return new Money(amount, to);
	}
}
