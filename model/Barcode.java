package model;

public class Barcode {
	private String barCode;

	public String getBarcode() {
		return barCode;
	}

	public void setBarcode(String barCode) {
		this.barCode = barCode;
	}

	public Barcode(String str)
	{
		if(str == null)
            throw new NullPointerException();
		this.barCode = str;
	}

	public String toString()
	{
		return this.barCode;
	}
}
