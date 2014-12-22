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
		IntegerNode temp = i;
		i.setNumber(j.getNumber());
		j.setNumber(temp.getNumber());
	}
	
	public static void bubbleSort(IntegerList list) {
		IntegerNode node = list.getFirst();
		int c = 0;
		while (node.getNext() != null) {
			if (node.getNumber() > node.getNext().getNumber()) {
				swap(node, node.getNext());
			}
			c++;
		}
		
		while (c > 1) {
			for (int i = 0; i < c; i++) {
				if (node.getNumber() > node.getNext().getNumber()) {
					swap(node, node.getNext());
				}
			}
			c--;
		}
	}

	public static void main(String[] args) {
		int[] ls = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		IntegerList list = arrayToList(ls);
		list.prettyPrint();
		ListUtilities.bubbleSort(list);
		list.prettyPrint();
	}

}
