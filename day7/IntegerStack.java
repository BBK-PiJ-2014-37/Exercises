public class IntegerStack {
	private IntegerSingleNode head;

	public boolean empty(){
		return head == null;
	}

	public void push(int n){
		IntegerSingleNode newElem = new IntegerSingleNode(n);
		newElem.setNext(head);
		head = newElem;
	}

	public int pop(){
		if (this.empty()) {
			return 0;
		}
		IntegerSingleNode oldHead = head;
		head = head.getNext();
		oldHead.setNext(null);
		return oldHead.getNumber();
	}

	public void prettyPrint() {
		IntegerSingleNode current = head;
		while (current != null) {
			System.out.print(" " + current.getNumber());
			current = current.getNext();
	  	}
	 	System.out.println();
    }

	public static void main(String[] args) {
		IntegerStack stack = new IntegerStack();
		stack.push(2);
    	stack.prettyPrint();
    	stack.push(3);
    	stack.prettyPrint();
    	stack.push(4);
    	stack.push(5);
    	stack.prettyPrint();
    	System.out.println("popped: " + stack.pop());
    	stack.push(7);
    	stack.prettyPrint();
    	stack.push(7);
    	System.out.println("popped: " + stack.pop());
    	System.out.println("popped: " + stack.pop());
    	stack.push(3);
    	stack.push(4);
    	stack.prettyPrint();
    	stack.push(9);
    	System.out.println("popped: " + stack.pop());
    	stack.prettyPrint();
    	System.out.println("popped: " + stack.pop());
    	System.out.println("popped: " + stack.pop());
    	System.out.println("popped: " + stack.pop());
    	System.out.println("popped: " + stack.pop());
    	System.out.println("popped: " + stack.pop());
    	System.out.println("popped: " + stack.pop());
    	System.out.println("popped: " + stack.pop());
    	System.out.println("popped: " + stack.pop());
    	System.out.println("popped: " + stack.pop());
    	System.out.println("popped: " + stack.pop());
    	System.out.println("popped: " + stack.pop());
    	System.out.println("popped: " + stack.pop());
    	System.out.println("popped: " + stack.pop());
    	System.out.println("popped: " + stack.pop());
    	System.out.println("popped: " + stack.pop());
    	System.out.println("popped: " + stack.pop());
	} 
}	


