//Q.2 Program to check Harshad number or not using Java
//Hint: - Harshad number is a number or an integer in base 10 which is
//completely divisible by sum of its digits.
//Example :
//Suppose a number 24 . Calculate the sum of digits of the number (2 +
//4) = 6 .
//Check whether the number entered by user is completely divisible by
//sum of its digits or not.

package metassignment;

import java.util.Scanner;

public class QuestionTwo {
	private static boolean isHarshadNumber(int number) {
		int sumOfDigits = getSumOfDigits(number);
		return number % sumOfDigits == 0;
	}

	private static int getSumOfDigits(int number) {
		int sum = 0;
		while (number > 0) {
			sum += number % 10;
			number /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		if (isHarshadNumber(number)) {
			System.out.println(number + " is a Harshad number.");
		} else {
			System.out.println(number + " is not a Harshad number.");
		}
	}
}