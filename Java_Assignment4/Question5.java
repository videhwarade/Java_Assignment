//Q.5 Write a program to calculate the square value of any number given by the user.
//Add an exception handling block to check whether the user enter letters instead of numbers.

package javaassignment4;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		try {
			String num = sc.next();
			int num1 = Integer.parseInt(num);

			int square = num1 * num1;
			System.out.println("Square of the Number = " + square);
		} catch (Exception e) {
			System.out.println("Invalid Input");
			System.out.println(e.getMessage());

		} finally {
			sc.close();
		}

	}

}

//Output:- 
//		Enter the number
//		5
//		Square of the Number = 25