package PointOfSale;

public class MonitorDevice {
	public void showProduct(Product p) {
		System.out.println(p.getName() + " " + p.getPrice());
	}

	public void showTotalCost(double sum) {
		System.out.println("Total : " + sum);
	}

	public void showInfo(String message) {
		System.out.println(message);
	}

}
