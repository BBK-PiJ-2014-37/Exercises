public class Patient {
	private String name;
	private int age;

	public Patient(String name, int age) {
		if (age < 0 || age > 130) {
			throw new IllegalArgumentException("The age should be between 0 and 130");
		}
		this.name = name;
		this.age = age;
	}
}