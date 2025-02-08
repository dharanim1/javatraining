package java_Day2;
import java.util.Scanner;

public class switchstatements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter current Salary:");
		double currSalary = sc.nextDouble();
		System.out.println("enter rating:");
		int rating=sc.nextInt();
		double hikepercentage=0.0;
		switch(rating) {
		case 5:
			hikepercentage=0.20;
			break;
		case 4:
			hikepercentage=0.15;
			break;
		case 3:
			hikepercentage=0.10;
			break;
		case 2:
			hikepercentage=0.05;
			break;
		case 1:
			hikepercentage=0.02;
			break;
		default :
			System.out.println("Invalid rating");	
		}
		double newsalary= currSalary+(hikepercentage*currSalary);
		System.out.println(newsalary);
		sc.close();
		

	}

}
