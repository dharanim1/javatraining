package java_Day2;

public class add {
	public static boolean isEvenOrOdd(int number) {

        return number % 2 == 0;

    }

	public static int cube(int number) {

        return number * number * number;

    }

	public static void greet() {

		System.out.println("hello varshitha");

	}

	public static int fact(int number) {

		if (number == 0) {

            return 1;

        } else {

            return number * fact(number - 1);

        }

	}

    public static void main(String[] args) {

        int number = 4; 

        greet();

        if (isEvenOrOdd(number)) {

            System.out.println(number + " is an even number.");

        } else {

            System.out.println(number + " is an odd number.");

	   }

        int result1 = cube(number);

        System.out.println("The cube of " + number + " is: " + result1);   

        int result2 = fact(number);

        System.out.println("The factorial of " + number + " is: " + result2);   

    }

}

 

