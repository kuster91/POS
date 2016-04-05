package PointOfSale;

import javax.swing.JOptionPane;

public class MonitorDevice {
	public void showProduct(Product p) {
		System.out.println(p.getName() + " " + p.getPrice());
	}

	public void showTotalCost(double sum) {
		System.out.println("Total : " + sum);
	}

	public void showInfo(String message) {
		JOptionPane.showMessageDialog(null, message, "UWAGA:", JOptionPane.INFORMATION_MESSAGE);
	}

}
