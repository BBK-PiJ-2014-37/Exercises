package day7;
public class IntegerList {

    private IntegerNode first;

    public IntegerList() {
	  first = null;
    }

    public IntegerNode getFirst() {
	   return this.first;
    }
    
    public void add(int n) {
	  IntegerNode newNumber = new IntegerNode(n);
	  if (first == null) {
		first = newNumber;
		return;
	  }
	  IntegerNode aux = first; 
	  while (aux.getNext() != null) {
		aux = aux.getNext();
	  }
	  aux.setNext(newNumber);
	  newNumber.setPrev(aux);
    }

    public void prettyPrint() {
	  IntegerNode current = first;
	  while (current != null) {
		System.out.print(" " + current.getNumber());
		current = current.getNext();
	  }
	  System.out.println();
    }
}
