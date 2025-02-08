package oops;

public class DematAccount extends BankAccount {
	private int stockHoldings;
	public DematAccount() {
		super();
	}
	public DematAccount(String AccountHolder, String AccountNo, double amount, int stockholdings, double balance) {
		super(AccountHolder,AccountNo,amount);
		this.stockHoldings = stockHoldings;
	}
	public void buystocks(int quantity, double pricePerStack) {
		double totalCost =quantity*pricePerStack;
		if (totalCost<= balance) {
			balance -= totalCost;
			stockHoldings += quantity;
			System.out.println("Bought"+ quantity +" stocks.Remaing Balance:" +balance);
		} else {
			
			setbalance(getbalance().totalcost);
			stockHoldings += quantity;
	}
		else {
			System.out.println("Insufficient balance to buy stocks:");
		}
		

}
}