//Q.3 Write a Java program to concatenate all elements of a string array efficiently using StringBuilder.

package javaassignment4;

public class Question3 {

	public static void main(String[] args) {
		String[] stringArray = { "This", "is", "a", "sample", "array", "!!" };
		String concatenatedString = concatenateArrayElements(stringArray);
		System.out.println("Concatenated string: " + concatenatedString);
	}

	public static String concatenateArrayElements(String[] stringArray) {
		StringBuilder stringBuilder = new StringBuilder();
		for (String str : stringArray) {
			stringBuilder.append(str);
		}
		return stringBuilder.toString();
	}
}

//Output:- 
//		Concatenated string: Thisisasamplearray!!