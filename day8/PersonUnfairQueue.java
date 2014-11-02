public class PersonUnfairQueue implements PersonQueue {
    private PersonNode head = null;
    private int count;
	    
  	public void insert(Person person) {
        PersonNode newElem = new PersonNode(person);
        if (head == null) {
            head = newElem;
            count++;
            return;
        }
        if (head.getPerson().getAge() < newElem.getPerson().getAge()) {
            newElem.setNext(head);
            head = newElem;
            count++;
            return;
        }

        PersonNode aux = head.getNext(); 
        PersonNode prev = head;
        while (aux != null && newElem.getPerson().getAge() < aux.getPerson().getAge()) {
            prev = aux;
            aux = aux.getNext();
        } 
        prev.setNext(newElem);
        newElem.setNext(aux);
        count++;
    }
    

	public boolean empty(){
		return head == null;
	}

		
	public Person retrieve(){
		if (empty()) {
			return null;
		}
		PersonNode oldHead = head;
		head = head.getNext();
       	oldHead.setNext(null);
        count--;
        return oldHead.getPerson();
	}


	public int getSize(){
        return count;
    }
}