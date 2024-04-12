//9. Design classes ShoppingCart and Product. ShoppingCart class that contains an
//Array of Product objects. Implement methods to add products to the cart,
//calculate the total cost, and display the contents of the cart. (Decide the data
//members and methods of the classes effectively)

package javaassignment3;


import java.util.Scanner;

public class ShoppingCart {
	class Prod {
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			float rate, amount, dis, disamount;
			int n;
			String name;
			System.out.println("Enter Product Name,Rate and Quantity");
			name = sc.next();
			rate = sc.nextFloat();
			n = sc.nextInt();
			amount = rate * n;
			dis = (amount * 10) / 100;
			disamount = amount - dis;
			System.out.println("Amount= " + amount);
			System.out.println("Discount= " + dis);
			System.out.println("Final Amount= " + disamount);
		}
	}

}
