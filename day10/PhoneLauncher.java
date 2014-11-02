public class PhoneLauncher{

	public static void main (String[] args) {
		SmartPhone myphone = new SmartPhone("Nexus");
		myphone.getBrand();
		myphone.call("0913198246");
		myphone.ringAlarm("8:45");
		myphone.playGame("World of Goo");
		myphone.printLastNumbers();
		myphone.browseWeb("www.gmail.com");
		myphone.findPosition();	
		myphone.call("0013198246");
		myphone.call("0213198246");
		myphone.call("0513198246");
		myphone.call("0513198246");
		myphone.call("0013198246");
		myphone.call("0013198246");	
		myphone.printLastNumbers();
	}


}