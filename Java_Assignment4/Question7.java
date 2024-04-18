//Q.7 Write a program to split a string containing two words using StringTokenizer without using hasMoreTokens() 
//method and call nextToken() method three times.Add an exception handling block if necessary.

package javaassignment4;

import java.util.StringTokenizer;

public class Question7 {

	public static void main(String[] args) {
		StringTokenizer stringtokenizer = new StringTokenizer("Hello Students");
		try {
			String token1 = stringtokenizer.nextToken();
			System.out.println(token1);
			String token2 = stringtokenizer.nextToken();
			System.out.println(token2);
			String token3 = stringtokenizer.nextToken();
			System.out.println(token3);

		} catch (Exception e) {
			System.out.println("No additional tokens to show ...");
		}
	}
}

//Output:- 
//		Hello
//		Students
//		No additional tokens to show ...