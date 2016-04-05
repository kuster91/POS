package model;

public class Product {
	private String name;
	private double price;
	private Barcode barCode;

	public Product(String name, double price, Barcode barCode) {
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

	public Barcode getBarCode() {
		return barCode;
	}

	public String toString() {
		return "kod: " + barCode + ", nazwa: " + name + ", cena: " + price + "\n";
	}

}
