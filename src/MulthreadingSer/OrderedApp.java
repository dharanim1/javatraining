package MulthreadingSer;

public class OrderedApp {
	public static void main(String[] args) {
		TakeOrder takeOrder= new TakeOrder();
		ProcessPayment processPayment = new ProcessPayment();
		AssignDelivery assignDelivery = new AssignDelivery();
		takeOrder.start();
		processPayment.start();
		assignDelivery.start();
		try {
			takeOrder.join();
			processPayment.join();
			assignDelivery.join();
			}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}

}
