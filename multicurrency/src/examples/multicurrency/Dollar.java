package examples.multicurrency;

public class Dollar {
	private int amount = 5;
	public Dollar(int a){
		this.amount = a;
	}
	public void multiply(int x){
		this.amount*=x;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
}
