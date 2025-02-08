package MulthreadingSer;

public class AssignDelivery extends Thread {
	public void run()
	{
		System.out.println("Assigning delivery agent");
		try {
			Thread.sleep(3000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Delivery agnt assigned");
	}

}
