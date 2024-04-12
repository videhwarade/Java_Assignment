//1. Write a program to print the area and perimeter of a triangle having sides of
//3, 4 and 5 units by creating a class named "Triangle" with parameter in its
//constructor.

package javaassignment3;

public class Triangle {
	private int s1, s2, s3;

	public Triangle(int s1, int s2, int s3) {
		super();
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}

	public double perimeter() {
		double perimeter = s1 + s2 + s3;
		return perimeter;
	}

	public double area() {
		double S = s1 + s2 + s3;
		double area = (Math.sqrt(S * (S - s1) * (S - s2) * (S - s3)));
		return area;
	}

	public void display() {
		System.out.println("Perimeter of Triangle is " + perimeter());
		System.out.println("Area of Triangle is " + area());
	}

	public static void main(String args[]) {
		Triangle triangle = new Triangle(3, 4, 5);
		triangle.display();
	}
}

//Output:-
//		Perimeter of Triangle is 12.0
//		Area of Triangle is 77.76888838089432