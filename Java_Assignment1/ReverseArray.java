//Q.3 Reverse a given Array and print.


package pattern;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr = new int[] { 11, 22, 33, 44, 55 };
		System.out.println("Original array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Array in reverse order: ");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
}


//Output:-
//		Original array: 
//		11 22 33 44 55 
//		Array in reverse order: 
//		55 44 33 22 11 
