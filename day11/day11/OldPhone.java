package day11;
public class OldPhone implements Phone {
	private String brand;

	public OldPhone(String brand) {
		this.brand = brand;
	}

	public void call(String number) {
		System.out.println("Calling: " + number);
	}

	public String getBrand() {
		System.out.println("Brand: " + brand);
		return brand;
	}

}