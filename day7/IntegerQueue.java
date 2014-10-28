public class IntegerQueue {
	private IntegerSingleNode head;
    private IntegerSingleNode tail;
    private int count;

	public boolean empty(){
		return head == null;
	}

	public void insert(int n){
		IntegerSingleNode newElem = new IntegerSingleNode(n);
        if (empty()){
            tail = newElem;
            head = newElem;
        } else {
	        tail.setNext(newElem);
		    tail = newElem;
        }
        count++;
	}

	public int retrieve(){
		if (this.empty()) {
			return 0;
		}
		IntegerSingleNode oldHead = head;
		head = head.getNext();
        if (head == null) {
            tail = null;
        }
		oldHead.setNext(null);
        count--;
		return oldHead.getNumber();
	}

    public int size(){
        return count;
    }

	public void prettyPrint() {
		IntegerSingleNode current = head;
        System.out.print("" + this.size() + " elements: ");
		while (current != null) {
			System.out.print(" " + current.getNumber());
			current = current.getNext();
	  	}
	 	System.out.println();
    }

	public static void main(String[] args) {
		IntegerQueue queue = new IntegerQueue();
		queue.insert(2);
    	queue.prettyPrint();
    	queue.insert(3);
    	queue.prettyPrint();
    	queue.insert(4);
    	queue.insert(5);
    	queue.prettyPrint();
    	System.out.println("retrieved: " + queue.retrieve());
    	queue.insert(7);
    	queue.prettyPrint();
    	queue.insert(7);
    	System.out.println("retrieved: " + queue.retrieve());
    	System.out.println("retrieved: " + queue.retrieve());
    	queue.insert(3);
    	queue.insert(4);
    	queue.prettyPrint();
    	queue.insert(9);
    	System.out.println("retrieved: " + queue.retrieve());
    	queue.prettyPrint();
    	System.out.println("retrieved: " + queue.retrieve());
    	System.out.println("retrieved: " + queue.retrieve());
    	System.out.println("retrieved: " + queue.retrieve());
    	System.out.println("retrieved: " + queue.retrieve());
    	System.out.println("retrieved: " + queue.retrieve());
    	System.out.println("retrieved: " + queue.retrieve());
    	System.out.println("retrieved: " + queue.retrieve());
    	System.out.println("retrieved: " + queue.retrieve());
    	System.out.println("retrieved: " + queue.retrieve());
    	System.out.println("retrieved: " + queue.retrieve());
    	System.out.println("retrieved: " + queue.retrieve());
    	System.out.println("retrieved: " + queue.retrieve());
    	System.out.println("retrieved: " + queue.retrieve());
    	System.out.println("retrieved: " + queue.retrieve());
    	System.out.println("retrieved: " + queue.retrieve());
    	System.out.println("retrieved: " + queue.retrieve());
	} 
}	


