public class PersonFairQueue implements PersonQueue {
    private PersonNode head = null;
    private PersonNode tail = null;
    private int count;
	    
  	public void insert(Person person){
		PersonNode newElem = new PersonNode(person);
        if (empty()){
            tail = newElem;
            head = newElem;
        } else {
	        tail.setNext(newElem);
		    tail = newElem;
        }
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
        if (head == null) {
            tail = null;
        }
		oldHead.setNext(null);
        count--;
        return oldHead.getPerson();
	}


	public int getSize(){
        return count;
    }
}