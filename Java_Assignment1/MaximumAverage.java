//Q.2 Find the Maximum Element and Average of Elements in an Array.

package pattern;

public class MaximumAverage {

	public static void main(String[] args) {
		int arr[] = { 12, 13, 1, 10, 34, 10 };
		int max = arr[0];
		int sum = 0;
		float avg;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("Maximun element is:" + max);
		System.out.println("Sum is:" + sum);
		avg = sum / arr.length;
		System.out.println("Average value of the array elements is : " + avg);
	}
}

//Output:- 
//		Maximun element is:34
//		Sum is:80
//		Average value of the array elements is : 13.0