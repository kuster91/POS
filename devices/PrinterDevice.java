package devices;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.Product;

public class PrinterDevice {
	public static void print(ArrayList<Product> list) {
		String str="";
		double sum = 0;
		for (Product p : list) {
			str=str+p.getName() + " " + p.getPrice()+"\n";
			sum = sum + p.getPrice();
		}
		str=str+"Total: "+ sum;
		JOptionPane.showMessageDialog(null, str, "Paragon", JOptionPane.INFORMATION_MESSAGE);
	}
}
