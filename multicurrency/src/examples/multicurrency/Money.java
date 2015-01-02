package examples.multicurrency;

public   class Money implements Expression {
	protected int amount = 5;
	
	public Money(int amount, String currency){
		this.amount = amount;
		this.currency = currency;
	}
	public static Money dollar(int amount){
		return new Money(amount,"$");
	} 
	
	public static Money franc(int amount){
		return new Money(amount,"CHF");
	} 	
 
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
 
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Money money = ((Money)obj);
		return this.amount==money.getAmount()  && this.getClass()==money.getClass();
	}

	protected String currency;
	public String getCurrency(){
		return this.currency;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.amount+" "+this.currency;
	}
	public Money times(int i) { 
			return new Money(this.amount*i,currency);
		}
	//	@Override
	//	public String getCurrency() {
	//		return "$";
	//	}
	//	 
	public Expression plus(Money amountToAdd) {
		// TODO Auto-generated method stub
		return new Money(this.amount+amountToAdd.getAmount(),currency);
	}
}
