package oops;


public class BankApplication {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

//		Scanner sc=new Scanner(System.in);

//		System.out.println("Enter the holder name:");

//		String AccountHolder=sc.next();

//		System.out.println("Enter the account No:");

//		String AccountNo=sc.next();

//		System.out.println("Enter the amount:");

//		double balance=sc.nextDouble();

//		BankAccount  obj =new BankAccount(AccountHolder,AccountNo,balance);

//		BankAccount  obj =new BankAccount("Vinay","SBIN0234",1000);

//		obj.AccountHolder="sree";

//		obj.AccountNo="ICICN0098981";

//		obj.balance=2000.00;

//		obj.display();

//

//		obj.deposit(100);

//		obj.display();

//

//		obj.withdraw(2300);

//		obj.display();

//		obj.withdraw(1200);

//		obj.display();

//		obj.Displaydetails();

//		

//		obj.setAccountHolder("qwer");

//		obj.setAccountNo("HDF678");

//		obj.setbalance(-1000.00);

//		obj.Displaydetails();
 
//		BankAccount sa=new SavingsAccount("sree","trewq123",1000,6);

//		sa.display();

//		sa.deposit(1000);

//		System.out.println("------------------------");

//		sa.display();

//		BankAccount p1 = new BankAccount("david","123456",10000);

//

//		BankAccount p2 = new BankAccount("john","123458",20000);

//		p1.Displaydetails();

//		p2.Displaydetails();

//		p2.transfer(2000.0,p1);

//		p1.display();

//		p2.display();

		PremiumSavingsAccount sa=new PremiumSavingsAccount("sree","sbi1234",10000,8,15);

		sa.display();

		sa.deposit(1000);

		System.out.println("------------------------");

		sa.display();
 


	}

}
 


