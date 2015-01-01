package examples.multicurrency;

public class Dollar {
	private int amount = 5;
	public Dollar(int a){
		this.amount = a;
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
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return this.amount==((Dollar)obj).getAmount();
	}
}
