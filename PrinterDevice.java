package PointOfSale;

import java.util.ArrayList;

public class PrinterDevice {
	public void print(ArrayList<Product> list) {
		double sum = 0;
		for (Product p : list) {
			System.out.println(p.getName() + " " + p.getPrice());
			sum = sum + p.getPrice();
		}
		System.out.println("Total : " + sum);
	}
}
