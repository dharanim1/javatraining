package MulthreadingSer;


public class TestThread implements Runnable{
	 
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is running:"+Thread.currentThread().getName());
	}
 
}
