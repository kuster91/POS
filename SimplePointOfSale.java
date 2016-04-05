package PointOfSale;

import java.util.ArrayList;

public class SimplePointOfSale {

	public static void SingleSaleTest(Customer customer, ArrayList<String> codes, ProductsDatabase database,
			PrinterDevice printer, ScannerDevice scanner, MonitorDevice monitor) {
		for (String str : codes) {
			if (str == "")
				monitor.showInfo("Invalid bar-code");
			else if (database.foundProduct(str) == -1)
				monitor.showInfo("Product not found:" + str);
			else {
				monitor.showProduct(database.getProductList().get(database.foundProduct(str)));
				customer.getShoppingList().add(database.getProductList().get(database.foundProduct(str)));
			}
		}
		monitor.showTotalCost(Customer.getTotalCost());
		printer.print(customer.getShoppingList());
	}
}
