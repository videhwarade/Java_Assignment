//1. Find the Fibonacci Series up to Nth Term in Java Language
//c. Method 3: Using Formula a[i]=a[i-1]+a[i-2] (Using Array)

package metassignment;

import java.util.Scanner;

public class QuestionOneC {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Terms: ");
		n = sc.nextInt();
		int[] fibonacci = new int[n];
		fibonacci[0] = 0;
		fibonacci[1] = 1;

		for (int i = 2; i < n; i++) {
			fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
		}

		System.out.println("Fibonacci Series up to " + n + " terms:");
		for (int f : fibonacci) {
			System.out.print(f + " ");
		}

	}

}
