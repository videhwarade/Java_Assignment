//Q.5 Count the number of occurrence of each element of an array.


package pattern;

public class OccurrenceArray {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 8, 3, 2, 2, 2, 5, 1, 5 };
		int[] fr = new int[arr.length];
		int visited = -1;
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					fr[j] = visited;
				}
			}
			if (fr[i] != visited)
				fr[i] = count;
		}
		System.out.println("---------------------------------------");
		System.out.println(" Element | Frequency");
		System.out.println("---------------------------------------");
		for (int i = 0; i < fr.length; i++) {
			if (fr[i] != visited)
				System.out.println("    " + arr[i] + "    |    " + fr[i]);
		}
		System.out.println("----------------------------------------");
	}
}

//Output:-
//			---------------------------------------
//			 Element | Frequency
//			---------------------------------------
//			    1    |    2
//			    2    |    4
//			    8    |    1
//			    3    |    1
//			    5    |    2
//			----------------------------------------