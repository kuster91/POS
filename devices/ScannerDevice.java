package devices;

import model.Barcode;
import model.Product;
import model.ProductsDatabase;

public class ScannerDevice {
	private String code;

	public Product scanProduct(Barcode barcode) {
		if (ProductsDatabase.foundProduct(barcode) == -1) {
			MonitorDevice.showInfo("Product not found:" + barcode);
			return null;
		} else if (barcode == null || barcode.getBarcode() == "" || barcode.getBarcode() == " ") {
			MonitorDevice.showInfo("Invalid bar-code");
			return null;
		}
		return ProductsDatabase.getProductList().get((ProductsDatabase.foundProduct(barcode)));
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public ScannerDevice(ProductsDatabase database) {
		if (database == null)
			throw new NullPointerException();
	}
}
