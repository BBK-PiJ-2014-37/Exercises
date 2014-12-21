package day7;
public class Spy {
	private static int spyCount = 0;
	int spyID; 


	public Spy(int id) {
		this.spyID = id;
		spyCount++;
		System.out.println("ID: " + id + ". Total number: " + getNumberOfSpies());
	}
	public void die(int id) {
		this.spyID = id;
		spyCount--;
		System.out.println("Spy " + id + " has been detected and eliminated");
		System.out.println("Total number of spies: " + getNumberOfSpies());
	}
	public static int getNumberOfSpies() {
		return spyCount;
	}
	public static void main(String[] args) {
		Spy spy1 = new Spy(007);
		new Spy(99);
		new Spy(86);
		spy1.die(007);
		
	}
}

