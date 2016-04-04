package PointOfSale;

import java.util.ArrayList;

public class ProductsDatabase {
	private static ArrayList<Product> productList;

	public ProductsDatabase() {
		productList = new ArrayList<>();
	}

	public ArrayList<Product> getProductList() {
		return productList;
	}

	public int foundProduct(String barCode) {
		for (int i = 0; i < ProductsDatabase.productList.size(); ++i) {
			if (ProductsDatabase.productList.get(i).getBarCode() == barCode)
				return i;
		}
		return -1;
	}
}
