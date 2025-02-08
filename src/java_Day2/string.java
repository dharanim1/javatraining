package java_Day2;
import java.util.Scanner;
public class string {

	public static void main(String[] args) {
		//strings and methods:
		String correctPassword = "Admin1234";
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the password:");
		String userInput = scanner.nextLine();
		if (correctPassword.equalsIgnoreCase(userInput)) {
			System.out.println("accepted!");
		}else {
			System.out.println("not accepted!");
		}
		scanner.close();

	}

}
