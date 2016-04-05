package devices;

import javax.swing.JOptionPane;

import model.Product;

public class MonitorDevice {
	public static void showProduct(Product p) {
		System.out.println(p.getName() + " " + p.getPrice());
	}

	public static void showTotalCost(double sum) {
		System.out.println("Total : " + sum);
	}

	public static void showInfo(String message) {
		JOptionPane.showMessageDialog(null, message, "UWAGA:", JOptionPane.INFORMATION_MESSAGE);
	}

}
