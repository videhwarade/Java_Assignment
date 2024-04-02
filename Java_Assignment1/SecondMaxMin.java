//Q.4 Find the second maximum and second minimum Elements of an array.

package pattern;

import java.util.Scanner;

public class SecondMaxMin {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the array");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Second Maximum element is " + arr[1]);
		System.out.println("Second Minimum element is " + arr[n - 2]);
	}
}