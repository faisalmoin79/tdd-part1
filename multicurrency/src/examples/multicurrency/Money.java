package examples.multicurrency;

public abstract class Money {
	private int amount = 5;
	
	public static Money dollar(int amount){
		return new Dollar(amount);
	} 
	
	public static Money franc(int amount){
		return new Franc(amount);
	} 	
 
 
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public abstract Money times(int i);
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return this.amount==((Money)obj).getAmount() && this.getClass()==obj.getClass();
	}
}