package java_Day2;
import java.util.Scanner;

public class assignment1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter the students:");
		int students = scanner.nextInt();
		int [] [] marks= new int[students][3];
		double[] percentages = new double[students];
		for (int i=0; i<students; i++) {
			System.out.println("enter the marks of students"+(i+1)+":");
			int totalmarks=0;
			for(int j=0; j<3; j++) {
				System.out.print("subject"+(j+1)+":");
				marks[i][j] = scanner.nextInt();
				totalmarks +=marks[i][j];
			}
			percentages[i]=(totalmarks/3);
			
		}
		System.out.println("\nStudent Percentage Results:");
		for (int i=0; i < students; i++) {
			System.out.println("student" +(i + 1)+":"+percentages[i]+"%");
		}
		scanner.close();
	}

}
