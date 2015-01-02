package examples.multicurrency;

public class Franc extends Money{
	private int amount = 5;
	public Franc(int a){
		this.amount = a;
		this.currency="CHF";
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Franc times(int i) { 
		return new Franc(this.amount*i);
	}
//	@Override
//	public String getCurrency() {
//		return "CHF";
//	}
// 
}
