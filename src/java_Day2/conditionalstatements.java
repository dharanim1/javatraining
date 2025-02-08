package java_Day2;

public class conditionalstatements {public static void main(String[] args) {
	// TODO Auto-generated method stub
	double rating=3.5;
	double salary=50000;
	double new_salary,increment;
	if (rating>=1 && rating<=2) {
		System.out.println("same salary:"+salary);
	}
	else if (rating>=2 && rating<=3.5 ) {
		increment=0.05*salary;
		new_salary=salary+increment;
		System.out.println("increment is"+increment);
		System.out.println("new_salary"+new_salary);
	}
	else {
		System.out.println("invalidrating");
	}
		

}

}
