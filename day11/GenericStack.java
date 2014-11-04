public class GenericStack<Number> {
	private GenericSingleNode<Number> first;

	public boolean empty(){
		return first == null;
	}

	public void push(Number n){
		GenericSingleNode<Number> newElem = new GenericSingleNode<Number>(n);
		newElem.setNext(first);
		first = newElem;
	}

	public Number pop(){
		if (this.empty()) {
			return null;
		}
		GenericSingleNode<Number> oldFirst = first;
		first = first.getNext();
		oldFirst.setNext(null);
		return oldFirst.getValue();
	}

	public void prettyPrint() {
		GenericSingleNode<Number> current = first;
		while (current != null) {
			System.out.print(" " + current.getValue());
			current = current.getNext();
	  	}
	 	System.out.println();
    }

	public static void main(String[] args) {
		GenericStack<Integer> stack = new GenericStack<Integer>();
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
    	

        GenericStack<Double> stackDouble = new GenericStack<Double>();
        stackDouble.push(2.5);
        stackDouble.prettyPrint();
        stackDouble.push(3.09);
        stackDouble.prettyPrint();
        stackDouble.push(4.998);
        stackDouble.push(5.666);
        stackDouble.prettyPrint();
        System.out.println("popped: " + stackDouble.pop());
        stackDouble.push(7.0);
        stackDouble.prettyPrint();
        stackDouble.push(7.87);
        System.out.println("popped: " + stackDouble.pop());
        System.out.println("popped: " + stackDouble.pop());
        stackDouble.push(3.9988);
        stackDouble.push(4.8887);
        stackDouble.prettyPrint();
    } 
}	


