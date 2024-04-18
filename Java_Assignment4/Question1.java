//Q.1Write a Java program that compares two wrapper objects for equality and demonstrates 
//when to use equals() instead of == (try with Integer or Float classes)

package javaassignment4;

public class Question1 {

	public static void main(String[] args) {
		Integer integer1 = new Integer(10);
		Integer integer2 = new Integer(20);
		Double double1 = new Double(101.01);
		Double double2 = new Double(102.1);

		System.out.println("Using == Operator");
		System.out.println("i1 == i2" + (integer1 == integer2));
		System.out.println("i1 == i2" + (double1 == double2));

		System.out.println("Using equals() Operator");
		System.out.println("i1 == i2" + (integer1.equals(integer2)));
		System.out.println("i1 == i2" + (double1.equals(double2)));
	}

}

// Output: 
//			Using == Operator
//			i1 == i2false
//			i1 == i2false
//			Using equals() Operator
//			i1 == i2false
//			i1 == i2false