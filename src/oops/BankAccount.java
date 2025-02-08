package oops;


public class BankAccount {

	private String AccountHolder;

	private String AccountNo;

	private double balance;

	public BankAccount(String AccountHolder,String AccountNo,double balance) {

		this.AccountHolder=AccountHolder;

		this.AccountNo=AccountNo;

		this.balance=balance;

	}

	public BankAccount() {

	}

	public String getAccountHolder() {

		return AccountHolder;

	}

	public void setAccountHolder( String AccountHolder) {

	this.AccountHolder = AccountHolder;

	}

	public String getAccountNo() {

		return AccountNo;

	}

	public void setAccountNo(String AccountNo) {

	this.AccountNo= AccountNo;

	}

	public Double getbalance() {

		return balance;

	}

	public void setbalance(Double balance) {

	if(balance >=0) {

		this.balance= balance;

	}else {

		System.out.println("Balance cannot be negative");

	}

	}

	public void Displaydetails() {

		System.out.println("The Holder name is:"+AccountHolder);

		System.out.println("The account no is:"+AccountNo);

		System.out.println("The balance is:"+balance);

	}

	public void deposit(double amount)

	{

		if(amount>0) 

		{

			balance += amount;

			System.out.println("deposite money: "+ amount +" balace now:"+balance);

		}

		else

		{

			System.out.println("amount muste be positive");
 
		}

	}

	public void deposit(double...amounts) {

		double totaldeposit = 0.0;

		for(double amount:amounts) {

			if(amount>0) {

				totaldeposit += amount;

			}else {

				System.out.println("Negative name is not permissiable");

			}

		}

		balance+=totaldeposit;

		System.out.println(balance);

	}	



//overload-------------------------------

//	public void deposit(double amount) {

//		if(amount >0)

//		{

//		balance+=amount;

//		System.out.println("the deposited money "+ amount+" The balance right now"+ balance);

//	}

//		else {

//			System.out.println("amount muste be positive");

//

//		}

//	}


	//overload withdraw method amount in int

	public void withdraw(int amount)

	{

		if(amount>0 && amount<=balance) {

			balance-=amount;

			System.out.println("Rs " +amount+ " withdrwan ,The remaining balance:" +balance);

		}else {

			System.out.println("Insufficient Balance");

		}

	}

	//overload withdraw method amount in double
 
	public void withdraw(double amount)

	{

		if(amount>0 && amount<=balance) {

			balance-=amount;

			System.out.println("Rs " +amount+ " withdrwan ,The remaining balance:" +balance);

		}else {

			System.out.println("Insufficient Balance");

		}

	}

	/* public void withdraw(int amount) {

		if(amount>0 && amount<=balance) {

		balance-=amount;

		System.out.println("Rs " +amount+ " withdrwan ,The remaining balance:" +balance);

	}else {

		System.out.println("Insufficient Balance");

	}

		}

*/

	public void display() {

		System.out.println("The account No is :"+AccountNo);

		System.out.println("The overall balance:"+balance);

	}

	public void transfer(double amount,BankAccount targetAccount)

	{

		if(amount<=0)

		{

			System.out.println("tranfer amount must positive");

		}

		else if (amount>balance)

		{

			System.out.println("insuff  balance for tranfer");

		}

		else 

		{

			balance-=amount;

			targetAccount.deposit(amount);

			System.out.println("transfer amount: " +amount+"to" +targetAccount.getAccountNo());
 
			

		}}

}
 
 
 
 


