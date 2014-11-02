public class UnfairSupermarket {
	private PersonUnfairQueue till;


	public UnfairSupermarket() {
		this.till = new PersonUnfairQueue();
	}

	public void addPerson(Person person) {
		till.insert(person);
		System.out.println("Added person: " + person);
	}

	public void servePerson () {
		if (till.getSize() == 0) {
			System.out.println("The queue is empty");
			return;
		} 
		Person person = till.retrieve();
		System.out.println("Served person: " + person + " remaining: " + till.getSize());
	}

	public static void main (String[] args) {
		UnfairSupermarket tesco = new UnfairSupermarket();
		tesco.addPerson(new Person("John", 37));
		tesco.addPerson(new Person("Paul", 38));
		tesco.addPerson(new Person("Ringo", 35));
		tesco.servePerson();
		tesco.addPerson(new Person("George", 40));
		tesco.servePerson();
		tesco.servePerson();
		tesco.servePerson();
		tesco.servePerson();
	}
}