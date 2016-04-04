package PointOfSale;

public class Product {
	private String name;
	private double price;
	private String barCode;

	public Product(String name, double price, String barCode) {
		this.name = name;
		this.price = price;
		this.barCode = barCode;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public String getBarCode() {
		return barCode;
	}

	public String toString() {
		return "kod: " + barCode + ", nazwa: " + name + ", cena: " + price + "\n";
	}

}
