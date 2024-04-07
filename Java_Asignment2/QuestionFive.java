//Q.5 Java program to count numbers of even and odd elements in an array

package metassignment;

import java.util.Scanner;

public class QuestionFive {
	public static void main(String args[]) {
		int n, arsize;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		n = sc.nextInt();
		System.out.println("Enter Array: ");
		arsize = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Entered Array: ");
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("Even Numbers:");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}
		}
		System.out.println("Odd Numbers:");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				System.out.println(arr[i]);
			}
		}
	}
}
