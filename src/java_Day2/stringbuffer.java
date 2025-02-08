package java_Day2;

public class stringbuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		sb.append("World");
		System.out.println("After append:" + sb);
		sb.insert(5, "java");
		System.out.println("After insert:" +sb);
		sb.delete(5, 10);
		System.out.println("After delete:" +sb);
		sb.reverse();
		System.out.println("After Reverse:" +sb);

	}

}
