public class ClusteredQueue implements PersonQueue{
	private PersonFairQueue seniors;
	private PersonFairQueue adults;
	private PersonFairQueue youngsters;

	public ClusteredQueue() {
		this.seniors = new PersonFairQueue();
		this.adults = new PersonFairQueue();
		this.youngsters = new PersonFairQueue();
	}

	public void insert(Person person){
		if (person.getAge() > 64) {
			seniors.insert(person);
		} else if (person.getAge() > 17) {
			adults.insert(person);
		} else {
			youngsters.insert(person);
		}
	}

	public Person retrieve() {
		if (seniors.getSize() > 0) {
			return seniors.retrieve();
		} else if (adults.getSize() > 0) {
			return adults.retrieve();
		} else {
			return youngsters.retrieve();
		}
	}

	public int getSize() {
		return seniors.getSize() + adults.getSize() + youngsters.getSize();
	}
}