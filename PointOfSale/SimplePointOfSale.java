package PointOfSale;

import java.util.ArrayList;

import devices.MonitorDevice;
import devices.PrinterDevice;
import devices.ScannerDevice;
import model.Barcode;
import model.Customer;
import model.Product;


public class SimplePointOfSale {
	public static final String EXIT_MESSAGE = "exit";
	Customer customer;
	ScannerDevice scanner;

	public SimplePointOfSale(Customer customer, ScannerDevice scanner) {
		this.customer = customer;
		this.scanner = scanner;
	}

	public void scan(String input) {

		if (input == EXIT_MESSAGE) {
			for (Product p : customer.getShoppingList()) {
				MonitorDevice.showProduct(p);;
			}
			PrinterDevice.print(customer.getShoppingList());
			MonitorDevice.showTotalCost(customer.getTotalCost());
		}
		scanner.scanProduct(new Barcode(input));
	}
}
