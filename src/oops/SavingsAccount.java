package oops;

public class SavingsAccount extends BankAccount {

	private double intersetRate;

	public SavingsAccount() {

		super();

	}

	public SavingsAccount(String AccountHolder, String AccountNo, double balance, double intersetRate) {

		super(AccountHolder, AccountNo, balance);

		this.intersetRate = intersetRate;

	}

	public double getIntersetRate() {

		return intersetRate;

	}

	public void setIntersetRate(int intersetRate) {

		if (intersetRate >= 0) {

			this.intersetRate = intersetRate;

		} else {

			System.out.println("interset should not be negative");

		}

	}

	@Override

	public void  deposit(double amount) {

//       super.deposit(amount);

		double interset = amount * (getIntersetRate() / 100);

		amount+= interset;

		System.out.println("The Total amount with interset:"+amount);

		super.deposit(amount);

	}

	@Override

	public void display() {

		super.display();

		System.out.println("Interrate is :"+intersetRate);

		System.out.println("----------------------");

	}

	@Override

	public void deposit(double... amounts) {

		double totaldeposit = 0.0;

		for(double amount:amounts) {

			if(amount>0) {

				totaldeposit += amount;

			}else {

				System.out.println("Negative number is not permissiable" + amount);

			}

		}

		double interset=totaldeposit*(getIntersetRate()/100);

		double bal=super.getbalance();

		bal+=totaldeposit+interset;

		System.out.println("Total Desposit :"+ totaldeposit);

		System.out.println("Total interset Earned:"+ interset);

		System.out.println("Updated balance after adding interset:"+ bal);

	}


}
