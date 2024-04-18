//Q.6 Create an integer array of size n and read the elements from the user .
//Add an exception handling block to print the value at nth position of the array. 

package javaassignment4;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();

		int arr[] = new int[size];
		System.out.println("Enter the elements of array");

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		try {
			System.out.println("Enter the index position from 0 to 4");
			int position = sc.nextInt();
			System.out.println("value for index " + position + "is : " + arr[position]);

		} catch (Exception e) {
			System.out.println("Invalid position ");
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}

	}

}

//Output:- 
//			Enter the size of the array
//			5
//			Enter the elements of array
//			10
//			20
//			30
//			40
//			50
//			Enter the index position from 0 to 4
//			2
//			value for index 2is : 30