package examples.multicurrency;

public class Currency {
	private int amount = 5;
	
	public static Dollar dollar(int amount){
		return new Dollar(amount);
	} 
	
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
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return this.amount==((Currency)obj).getAmount() && this.getClass()==obj.getClass();
	}
}
