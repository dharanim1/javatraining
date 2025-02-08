package java_Day2;

public class ExceptionHandling {
	public static void main(String[] args) {
		int a,b;
		a= 5;
		b = 0;
		int[] arr= {10,20,30,40};
		try {
			int result = a/b;
			System.out.println(arr[4]);
		}
		catch(ArithmeticException e) {
			System.out.println("Exception Caught:"+e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception caught:"+e.getMessage());
		}
		catch(Exception e) {
			System.out.println("Exception caught:"+e.getMessage());
		}
		finally {
			System.out.println("-----------");
		}
	}
	

}
