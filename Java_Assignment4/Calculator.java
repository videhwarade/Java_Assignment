//Q.9 Write a program that creates a Calculator class.
//The class contains two variables of integer type. Design a constructor that accepts two values as parameter and set those values.
//Design four methods named Add(),Subtract(),multiply(),Division() for performing addition,subtraction,multiplication and division of two numbers.
//For addition and subtraction,two numbers should be positive.If any negative number is entered then throw an exception in respective methods.
//So design an exceptionhandler(ArithmeticException)in Add() and Subtract() methods respectively to check whether any number is negative or not.
//For division and multiplication two numbers should not be zero.If zero is entered for any number then throw an exception in respective methods.
//So design an exceptionhandler(ArithmeticException)inmultiply()andDivision()methods respectively to check whether any number is zero or not.
//Write a main class and declare four objects of Calculator class.Perform addition(objl),subtraction(obj2),multiply(obj3) and division(obj4) operations for these objects.
//If any non integer values are provided as input; then you should throw an exception(NumberFormatException)and display a message that informs the user of the wrong input before exiting

package javaassignment4;

import java.util.*;

public class Calculator {
	int num1;
	int num2;

	public Calculator(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public int addition() {
		if (num1 < 0 || num2 < 0) {
			throw new ArithmeticException("Both nos cannot be -ve");
		}
		return num1 + num2;
	}

	public int subtract() {
		if (num1 < 0 || num2 < 0) {
			throw new ArithmeticException("Both nos should not be negative");
		}

		return num1 - num2;
	}

	public int multi() {
		if (num1 == 0 || num2 == 0) {
			throw new ArithmeticException("Both nos should not be Zero");
		}
		return num1 * num2;
	}

	public double division() {

		if (num2 == 0) {
			throw new ArithmeticException("Denominator should not be Zero");
		}
		return (double) num1 / num2;
	}

	public static void main(String[] args) {
		System.out.println("enter Two Numbers");
		Scanner sc = new Scanner(System.in);
		try {
			String num1 = sc.next();
			String num2 = sc.next();
			Calculator obj = new Calculator(Integer.parseInt(num1), Integer.parseInt(num2));
			System.out.println("Addition =" + obj.addition());
			System.out.println("Subtraction = " + obj.subtract());
			System.out.println("Multiplication = " + obj.multi());
			System.out.println("Divison =" + obj.division());
		} catch (NumberFormatException e) {
			System.out.println("Please enter Valid input ");
			System.out.println(e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
}

//Output:- 
//		enter Two Numbers
//		10
//		2
//		Addition =12
//		Subtraction = 8
//		Multiplication = 20
//		Divison =5.0