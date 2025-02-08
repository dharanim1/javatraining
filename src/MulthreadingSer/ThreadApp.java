package MulthreadingSer;

public class ThreadApp {

	public static void main(String[] args) {
		Counter objc = new Counter();
		TestThread2 t1 = new TestThread2();
		TestThread runnable = new TestThread();
		Thread t2 = new Thread(runnable);
		Thread t3 = new Thread (() -> {
		                   for(int i=0; i<5; i++) {
		                	   objc.incrementCount();
		                   }
		}
		);
		Thread t4 = new Thread (() -> {
            for(int i=0; i<4; i++) {
         	   objc.incrementCount();
            }
}
);
		
		//t1.start();
		//t2.start();
		t3.start();
		t4.start();
		try {
		t3.join();
		t4.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(objc.getCount());
		System.out.println("Process completed");
		// TODO Auto-generated method stub

	}

}
// synchronization
//shared BankAccount --. users2
//user 1--> t1 --> withdraw-100
//user 2--> parallel another thread --> t2--> deposit --> 200--->1200
//inconsistent balance
//method synchronisation-->keyword -->all threads