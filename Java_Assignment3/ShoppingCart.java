//9. Design classes ShoppingCart and Product. ShoppingCart class that contains an
//Array of Product objects. Implement methods to add products to the cart,
//calculate the total cost, and display the contents of the cart. (Decide the data
//members and methods of the classes effectively)

package javaassignment3;

import java.util.Scanner;

public class ShoppingCart {
	private Product[] products;
	private int productCount;

	public ShoppingCart() {
		products = new Product[10]; // Assuming a maximum of 10 products for simplicity
		productCount = 0;
	}

	public void addProduct(Product product) {
		if (productCount < products.length) {
			products[productCount] = product;
			productCount++;
		} else {
			System.out.println("Cart is full. Cannot add more products.");
		}
	}

	public double calculateTotalCost() {
		double totalCost = 0;
		for (int i = 0; i < productCount; i++) {
			totalCost += products[i].getPrice();
		}
		return totalCost;
	}

	public void displayCartContents() {
		System.out.println("Shopping Cart Contents:");
		for (int i = 0; i < productCount; i++) {
			System.out.println(products[i].getName() + " - $" + products[i].getPrice());
		}
	}
}
