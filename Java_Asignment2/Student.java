//Q.8 Create a student class with the following data members:- rollNo, Name,
//Course, Mark, grade, result. Develop function members to
//a. assign values for rollNo, name, course and mark.
//b. Find out the grade for the student(if mark &gt;90, then grade is A, if
//mark is between 80 and 90, then grade is B, if mark is between 70
//and 80, then grade is C, if mark is between 60 and 70, then grade
//is D, otherwise, grade is F.
//c. Find the result of the student. If mark&gt;60, then the result is Pass,
//otherwise Fail
//d. Print out the details of the student

package metassignment;

public class Student {
	private int rollNo, marks;
	private String name, course;

	public void display(int rollNo, String name, String course, int marks) {
		System.out.println("Roll No : " + rollNo);
		this.rollNo = rollNo;
		System.out.println("Name : " + name);
		this.name = name;
		System.out.println("Course : " + course);
		this.course = course;
		System.out.println("Marks : " + marks);
		this.marks = marks;
	}

	public void calResult() {
		if (marks > 90) {
			System.out.println("Grade: A");
		} else if (marks >= 80 && marks < 90) {
			System.out.println("Grade : B");
		} else if (marks >= 70 && marks < 80) {
			System.out.println("Grade : C");
		} else if (marks >= 60 && marks < 70) {
			System.out.println("Grade : D");
		} else {
			System.out.println("Grade : F");
		}
	}

	public void findResult() {
		if (marks > 60)
			System.out.println("Result  = PASS");
		else
			System.out.println("Result = Fail");
	}

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.display(48, "Sarthak", "PG-DAC", 80);
		student1.calResult();
		student1.findResult();
		System.out.println("=============================");
		Student student2 = new Student();
		student1.display(125, "Mr.X", "Engineering", 40);
		student1.calResult();
		student1.findResult();
	}
}