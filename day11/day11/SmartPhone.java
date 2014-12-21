package day11;
public class SmartPhone <P> extends MobilePhone {

	public SmartPhone(String brand) {
		super(brand);
	}
		
	public void browseWeb(String url) {
		System.out.println("Searching: " + url);

	}
			
	public String findPosition() {
		System.out.println("Position found");
		return "You are here";
	}

	public void internetCall(String number) {
		System.out.println("Calling: " + number + " through the internet to save money");
	}

	@Override
	public void call(String number) {
		if(number.substring(0,2).equals("00")) {
			internetCall(number);
		} else {
			super.call(number);
		}
	}
}