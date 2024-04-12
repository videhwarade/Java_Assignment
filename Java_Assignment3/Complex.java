package javaassignment3;

public class Complex {
	double realNo;
	double imaginaryNo;

	public Complex(double realNo, double imaginaryNo) {
		super();
		this.realNo = realNo;
		this.imaginaryNo = imaginaryNo;
	}

	public Complex add(Complex num) {
		double realNo = this.realNo + num.realNo;
		double imaginaryNo = this.imaginaryNo + num.imaginaryNo;
		return new Complex(realNo, imaginaryNo);
	}

	public Complex sub(Complex num) {
		double realNo = this.realNo - num.realNo;
		double imaginaryNo = this.imaginaryNo - num.imaginaryNo;
		return new Complex(realNo, imaginaryNo);
	}

	public Complex multi(Complex num) {
		double realNo = this.realNo * num.realNo;
		double imaginaryNo = this.imaginaryNo * num.imaginaryNo;
		return new Complex(realNo, imaginaryNo);
	}

	public void display() {
		System.out.println(realNo + "+" + imaginaryNo + "i");
	}

	public static void main(String[] args) {
		Complex obj = new Complex(10, 20);
		Complex obj1 = new Complex(20, 30);
		Complex result = obj.add(obj1);
		Complex result1 = obj1.sub(obj);
		Complex result2 = obj.multi(obj1);
		result.display();
		result1.display();
		result2.display();

	}

}
