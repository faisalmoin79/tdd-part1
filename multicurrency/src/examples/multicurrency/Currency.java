package examples.multicurrency;

public class Currency {
	private int amount = 5;
	public Currency(int a){
		this.amount = a;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Currency times(int i) { 
		return new Currency(this.amount*i);
	}
}
