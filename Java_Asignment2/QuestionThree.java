//Q.3 Factorial of a Number using Recursion in Java

package metassignment;

import java.util.Scanner;

public class QuestionThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		int factorial = calculateFactorial(number);
		System.out.println("The factorial of " + number + " is " + factorial + ".");
	}

	private static int calculateFactorial(int number) {
		if (number == 0) {
			return 1;
		} else {
			return number * calculateFactorial(number - 1);
		}
	}

}
