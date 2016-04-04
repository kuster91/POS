package PointOfSale;

public class ScannerDevice {
	private String code;

	public void scanProduct(InputData d) {
		this.setCode(d.getData());
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
