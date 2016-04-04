package PointOfSale;

import java.util.ArrayList;

public class PointOfSaleTests {
	public static void main(String args[]) {
		Customer kowalski = new Customer();
		ProductsDatabase database = new ProductsDatabase();
		ArrayList<String> codes = new ArrayList<>();
		makeDatabase(database);
		makeCodeList(codes);
		MonitorDevice monitor = new MonitorDevice();
		PrinterDevice printer = new PrinterDevice();
		ScannerDevice scanner = new ScannerDevice();

		for (String str : codes) {
			if (str == "")
				monitor.showInfo("Invalid bar-code");
			else if (database.foundProduct(str) == -1)
				monitor.showInfo("Product not found");
			else {
				monitor.showProduct(database.getProductList().get(database.foundProduct(str)));
				kowalski.getShoppingList().add(database.getProductList().get(database.foundProduct(str)));
			}

		}
		monitor.showTotalCost(kowalski.getTotalCost());
		printer.print(kowalski.getShoppingList());

	}

	public static void makeDatabase(ProductsDatabase database) {
		database.getProductList().add(new Product("Maslo", 2.50, "001"));
		database.getProductList().add(new Product("Chleb", 3.40, "222"));
		database.getProductList().add(new Product("Samochod", 26700, "201"));
		database.getProductList().add(new Product("Gazeta", 4.99, "051"));
		database.getProductList().add(new Product("Kubek", 25.90, "964"));
		database.getProductList().add(new Product("Szynka", 2.64, "548"));
		database.getProductList().add(new Product("Telefon", 999, "6549"));
		database.getProductList().add(new Product("Zeszyt", 2.67, "369"));
		database.getProductList().add(new Product("Myszka", 13.20, "258"));
	}

	public static void makeCodeList(ArrayList<String> codes) {
		codes.add("258");
		codes.add("");
		codes.add("369");
		codes.add("222");
		codes.add("0110");
		codes.add("548");

	}
}
