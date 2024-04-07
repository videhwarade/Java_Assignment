//Q.1 Find the Fibonacci Series up to Nth Term in Java Language
//a. Method 1: Using Iteration (Using Three variables)

package metassignment;

import java.util.Scanner;

public class QuestionOneA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t1 = 0, t2 = 1, i, sum, n;
		System.out.print("Enter the number of terms: ");
		n = sc.nextInt();
		System.out.println("First " + n + " terms of fibonnaci series: ");
		for (i = 1; i <= n; ++i) {
			System.out.print(t1 + " ");
			sum = t1 + t2;
			t1 = t2;
			t2 = sum;
		}
	}

}
