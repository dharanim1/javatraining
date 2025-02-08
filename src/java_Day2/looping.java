package java_Day2;

public class looping {
	public static void main(String[] args) {
		int i,n=2,s=0;
		
		for(i=1; i<=10; i=i+1) {
			System.out.println(n);
			s=s+n;
			n=n+2;
		}
		System.out.println("sum of even numbers="+s);
	}

}
