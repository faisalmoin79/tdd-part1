package examples.multicurrency;

public class Dollar extends Money{
	private int amount = 5;

	public Dollar(int a){
		this.amount = a;
		this.currency="$";
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Dollar times(int i) { 
		return new Dollar(this.amount*i);
	}
//	@Override
//	public String getCurrency() {
//		return "$";
//	}
//	 
}
