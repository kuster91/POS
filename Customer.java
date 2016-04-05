package PointOfSale;

import java.util.ArrayList;

public class Customer {
	private static double totalCost;
	private static ArrayList<Product> shoppingList;

	public Customer() {
		shoppingList = new ArrayList<Product>();
		setTotalCost();
	}

	public ArrayList<Product> getShoppingList() {
		return shoppingList;
	}

	public static double getTotalCost() {
		setTotalCost();
		return totalCost;
	}

	public static void setTotalCost() {
		double tmp = 0;
		for (Product p : Customer.shoppingList)
			tmp = tmp + p.getPrice();
		Customer.totalCost = tmp;
	}
}