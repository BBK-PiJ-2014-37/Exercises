public class ListUtilities {

    private static IntegerList list;

    public static IntegerList arrayToList(int[] ar) {
	  int i = 0;
	  list = new IntegerList();
	  do {
		list.add(ar[i]);
		i++;
		} while (i <  ar.length);
		return list;
	}
	
	public static void main (String[] args){
    	int[] ls = {1,2,3,4,5,6,7,8,9,10};
    	list = arrayToList(ls);
    	list.prettyPrint();
	}
}
 
