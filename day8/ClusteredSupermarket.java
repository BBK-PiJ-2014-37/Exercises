public class ClusteredSupermarket {
	private ClusteredQueue till;


	public ClusteredSupermarket() {
		this.till = new ClusteredQueue();
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
		ClusteredSupermarket tesco = new ClusteredSupermarket();
		tesco.addPerson(new Person("John", 34));
		tesco.addPerson(new Person("Paul", 13));
		tesco.addPerson(new Person("Ringo", 65));
		tesco.servePerson();
		tesco.addPerson(new Person("George", 40));
		tesco.servePerson();
		tesco.servePerson();
		tesco.servePerson();
		tesco.servePerson();
	}
}