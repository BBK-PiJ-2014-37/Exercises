public class GenericDoubleList<T> implements NodeList<T> {

    private GenericNode<T> first;

    public GenericDoubleList() {
	  first = null;
    }

    public void add(T value) {
	  GenericNode<T> newElem = new GenericNode<T>(value);
	  if (first == null) {
		first = newElem;
		System.out.println("Added node: " + newElem.getValue());
		return;
	  }
	  GenericNode<T> aux = first; 
	  while (aux.getNext() != null) {
		aux = aux.getNext();
	  }
	  aux.setNext(newElem);
	  newElem.setPrev(aux);
	  System.out.println("Added node: " + newElem.getValue());
	}


    public boolean delete(T value) {
		if (first.getValue().equals(value)){
			GenericNode<T> tmp = first;
	    	first = first.getNext();
	    	tmp.setNext(null);
	    	first.setPrev(null);
	    	System.out.println("Deleted node: " + value);
	    	return true;
		}
		GenericNode<T> tmp = first.getNext();
		while (tmp != null) {
	    	if (tmp.getValue().equals(value)) {
				tmp.getPrev().setNext(tmp.getNext());
				if (tmp.getNext() != null) {
					tmp.getNext().setPrev(tmp.getPrev());
				}
				tmp.setNext(null);
				tmp.setPrev(null);
				System.out.println("Deleted node: " + value);
				return true;
	    	}
	    	tmp = tmp.getNext();
		}
		return false;
    }


    public void prettyPrint() {
		GenericNode<T> current = first;
		while (current != null) {
			System.out.print(" " + current.getValue());
			current = current.getNext();
	  	}
	  	System.out.println();
    }
}
