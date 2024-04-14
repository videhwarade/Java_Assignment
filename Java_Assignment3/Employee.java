//3. Write a program by creating an &#39;Employee&#39; class having the following methods
//and print the final salary.
//a. &#39;getInfo()&#39; which takes the salary, number of hours of work per day of
//employee as parameter
//b. &#39;AddSal()&#39; which adds $10 to salary of the employee if it is less
//than $500.
//c. &#39;AddWork()&#39; which adds $5 to salary of employee if the number of hours of
//work per day is more than 6 hours.

package javaassignment3;

import java.util.Scanner;

public class Employee {
	private double salary;
	private int numOfHourOfWork;

	Scanner sc = new Scanner(System.in);

	public void getInfo() {
		System.out.println("Enter the salary of Employee");
		salary = sc.nextDouble();
		System.out.println("Enter the number of hour of work");
		numOfHourOfWork = sc.nextInt();
	}

	public void addSal() {
		if (salary < 500) {
			salary = salary + 10;
			System.out.println("Salary Updated");
		}

	}

	public void addWork() {
		if (numOfHourOfWork > 6) {
			salary = salary + 5;
			System.out.println("Salary Updated");
		}
	}

	public void display() {
		System.out.println("Employee Salary : " + salary);
		System.out.println("Employee Number of hour of work  :  " + numOfHourOfWork);
	}

}
