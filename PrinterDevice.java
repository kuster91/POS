package PointOfSale;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class PrinterDevice {
	public void print(ArrayList<Product> list) {
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
