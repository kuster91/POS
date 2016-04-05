package model;

import java.util.ArrayList;

public class ProductsDatabase {
	private static ArrayList<Product> productList;

	public ProductsDatabase() {
		productList = new ArrayList<>();
	}

	public static ArrayList<Product> getProductList() {
		return productList;
	}

	public static int foundProduct(Barcode barcode) {
		for (int i = 0; i < ProductsDatabase.productList.size(); ++i) {
			if (ProductsDatabase.productList.get(i).getBarCode() == barcode)
				return i;
		}
		return -1;
	}
}
