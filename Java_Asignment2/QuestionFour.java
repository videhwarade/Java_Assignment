package metassignment;

import java.util.Arrays;

public class QuestionFour {

	static void printOrder(int[] arr, int n) {
		Arrays.sort(arr);
		for (int i = 0; i < n / 2; i++)
			System.out.print(arr[i] + " ");
		for (int j = n - 1; j >= n / 2; j--)
			System.out.print(arr[j] + " ");

	}

	public static void main(String[] args) {
		int n;
		int[] arr = { 1, 90, 34, 89, 7, 9 };
		n = arr.length;
		printOrder(arr, n);
	}
}