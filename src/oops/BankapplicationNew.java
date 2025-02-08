package oops;
public class BankapplicationNew {
	private static BankAccount[] accounts;
	private static int totalAccounts=0;
	private static int maxAccounts =5;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		accounts = new BankAccount[5];
		while (true) {
			System.out.println("bankApplication Menu");
			System.out.println("Press 1: To create an account");
			System.out.println("press 2: Display All account");
			System.out.println("press 3: Deposit Money");
			System.out.println("press 4:Withdraw money");
			System.out.println("press 5:Transfer money");
			System.out.prinln("press 6: buystocks");
			System.out.println("press 7: sales account");
			System.out.println("press 8: Exit");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				createAccount(scanner);
				break;
			case 2:
				displayAllAccounts();
				break;
			case 3:
				depositMoney(scanner);
				break;
			case 4:
				withdrawMoney(Scanner);
				break;
			case 5:
				transferMoney(Scanner);
				break;
			case 6:
				buystocks(Scanner);
			case 7:
				salesaccount(Scanner);
			case 8:
				System.out.println("Thankyou, Exciting from system");
				scanner.close();
				return;
				default:
					System.out.println("Invalid Choise.Enter from 1-6");
			}
		}
		
	}
private static void createAccount(Scanner sc) {
	if(totalAccounts>=maxAccounts)	{
		System.out.println("cannot create more accounts");
		return;
	}
	System.out.println("Enter the account holder name:");
	String accountName=sc.next();
	System.out.println("Enter the account No :");
	String accountNumber=sc.next();
	System.out.println("Enter the initial balance:");
	double accountBalance=sc.nextDouble();	
	System.out.println("Is this saving account or current account?");
	String isSaving=sc.next();

	if(isSaving.equalsIgnoreCase("yes")){
		System.out.println("Enter interset rate: ");
		double intersetRate=sc.nextDouble();
		//to store savings accounts if yes
		accounts[totalAccounts]=new SavingsAccount(accountName,accountNumber,accountBalance,intersetRate);
	}else {
		accounts[totalAccounts]=new BankAccount(accountName,accountNumber,accountBalance);
	}
	totalAccounts++;
		}

      private static void depositMoney(Scanner sc) {
	System.out.println("Enter the account No :");
	String accNum = sc.next();
	BankAccount account = findAccount(accNum);
	if(account==null) {
		System.out.println("account not found");
	}
	System.out.println("Enter the choice (1.single deposit /2.multiple deposits) ,  choose it :");
	int choose = sc.nextInt();
	if (choose==1) {
		System.out.println("Enter the amount to deposit");
		double amount = sc.nextDouble();
		account.deposit(amount);


}else if(choose==2) {
	System.out.println("Enter the number of deposits:");
	int numDeposits = sc.nextInt();
	double[] amounts =new double[numDeposits];
	for(int i=0;i<numDeposits;i++) {
		System.out.println("Enter deposit amount" + (i+1) +":");
		amounts[i]=sc.nextDouble();
	}
	account.deposit(amounts);
	System.out.println("deposited successfully!");
}else {
	System.out.println("Invalid choice ! Please enter 1 or 2");
}
}
private static BankAccount findAccount(String accNum) {
	for (int i = 0; i < totalAccounts; i++) {
		if (accounts[i].getAccountNo().equals(accNum)) {
			return accounts[i];
		}
	}
	return null;
}
private static void withdrawMoney(Scanner sc) {
	System.out.println("Enter the account No :");
	String accNum = sc.next();
	System.out.println("Enter the amount to withdraw");
	double amount = sc.nextDouble();
	BankAccount account = findAccount(accNum);
	if(account ==null) {
		System.out.println("account not found!");
		return;
	}
	if(amount>0 && amount <= account.getbalance()) {
		account.withdraw(amount);
		System.out.println("successfully withdrawn");
}else {
	System.out.println("Invalid withdrawal amount");
}



}
private static void transferMoney(Scanner sc) {
    System.out.println("Enter your account no");		
    String senderAccNum=sc.next();
    BankAccount senderAccount =findAccount(senderAccNum);
    if(senderAccount==null) {
 	   System.out.println("sender account not found!");
 	   return;
    }
    System.out.print("Enter reciepient's account no :");
    String recieveraccNum=sc.next();
    BankAccount recieverAccount =findAccount(recieveraccNum);
    if(recieverAccount==null) {
 	   System.out.println("recipient account not found");
 	   return;
    }
    System.out.println("Enter the amount to transfer");
    double amount=sc.nextDouble();
    if(amount>0 && amount<=senderAccount.getbalance()) {
 	   senderAccount.transfer(amount, recieverAccount);
 	   System.out.println("transfered Successfully...");
    }else {
 	   System.out.println("Invalid transfer amount or insufficient amount to transfer");
    }
}
}

