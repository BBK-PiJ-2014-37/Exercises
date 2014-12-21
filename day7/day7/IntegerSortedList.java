package day7;
public class IntegerSortedList {

    private IntegerNode head;

    public IntegerSortedList() {
	  head = null;
    }

   
  

    public void add(int n) {
		IntegerNode newNumber = new IntegerNode(n);
		if (head == null) {
			head = newNumber;
			return;
		}

		IntegerNode aux = head; 
		while (newNumber.getNumber() > aux.getNumber() && (aux.getNext() != null)) {
            aux = aux.getNext();
        } 
        if (newNumber.getNumber() > aux.getNumber()) {
            newNumber.setPrev(aux);
            aux.setNext(newNumber);
            return;
        }
        if (aux.getPrev() == null) {
            newNumber.setNext(aux);
            aux.setPrev(newNumber);
            head = newNumber;
            return;
        }
        newNumber.setNext(aux);
        newNumber.setPrev(aux.getPrev());
        aux.getPrev().setNext(newNumber);
        aux.setPrev(newNumber);
                     
    }
	

    public void prettyPrint() {
	  IntegerNode current = head;
	  while (current != null) {
		System.out.print(" " + current.getNumber());
		current = current.getNext();
	  }
	  System.out.println();
    }


    	
    	public static void main (String[] args){
    		IntegerSortedList list = new IntegerSortedList();
    		list.add(3);
    		list.add(4);
    		list.prettyPrint();
    		list.add(5);
    		list.prettyPrint();
    		list.add(2);
    		list.prettyPrint();
    		list.add(1);
    		list.prettyPrint();
    		list.add(30);
    		list.prettyPrint();
    		list.add(0);
    		list.prettyPrint();
    		list.add(-4);
    		list.prettyPrint();
    		list.add(18);
    		list.prettyPrint();
    		list.add(-3);
    		list.prettyPrint();
    		list.add(19);
    		list.prettyPrint();
    	}

}
