package day7;

public class ListUtilities {

	public static IntegerList arrayToList(int[] ar) {
		int i = 0;
		IntegerList list = new IntegerList();
		do {
			list.add(ar[i]);
			i++;
		} while (i < ar.length);
		return list;
	}

	public static void swap(IntegerNode i, IntegerNode j) {
		int temp = i.getNumber();
		i.setNumber(j.getNumber());
		j.setNumber(temp);
	}
	
	public static void bubbleSort(IntegerList list) {
		IntegerNode node = list.getFirst();
		int c = 0;
		if (node == null) {
			return;
		}
		while (node.getNext() != null) {
			if (node.getNumber() > node.getNext().getNumber()) {
				swap(node, node.getNext());
			}
			node = node.getNext();
			c++;
		}
		
		while (c > 1) {
			node = list.getFirst();
			for (int i = 0; i < c; i++) {
				if (node.getNumber() > node.getNext().getNumber()) {
					swap(node, node.getNext());
				}
				node = node.getNext();
			}
			c--;
		}
	}

	public static void cocktailSort(IntegerList list) {
		IntegerNode node = list.getFirst();
		int c = 0;
		if (node == null) {
			return;
		}
		
		boolean swaps = true;
		while (node.getNext() != null) {
			if (node.getNumber() > node.getNext().getNumber()) {
				swap(node, node.getNext());
				swaps = false;
			}
			node = node.getNext();
			c++;
		}
		
		while (!swaps) {
			swaps = true;
			node = node.getPrev();
			c--;
			for (int i = c; i > 0; i--) {
				if (node.getNumber() < node.getPrev().getNumber()) {
					swap(node, node.getPrev());
					swaps = false;
				}
				node = node.getPrev();				
			}
			node = node.getNext();
			c--;
			for (int i = 0; i < c; i++) {
				if (node.getNumber() > node.getNext().getNumber()) {
					swap(node, node.getNext());
					swaps = false;
				}
				node = node.getNext();
			}
		}
	}

	
	public static void main(String[] args) {
		int[] ls = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		IntegerList list = arrayToList(ls);
		list.prettyPrint();
		ListUtilities.bubbleSort(list);
		System.out.print("sorted: ");
		list.prettyPrint();
		int[] ls1 = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		IntegerList list1 = arrayToList(ls1);
		list1.prettyPrint();
		ListUtilities.cocktailSort(list1);
		System.out.print("sorted: ");
		list.prettyPrint();
	}

}
