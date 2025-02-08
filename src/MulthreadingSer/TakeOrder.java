package MulthreadingSer;

public class TakeOrder extends Thread {
	public void run()
	{
		System.out.println("taking order");
		try {
			Thread.sleep(3000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Order has been taken");
	}

}
