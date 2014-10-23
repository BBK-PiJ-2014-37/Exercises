public class ListUtilities {

    private static IntegerList list;

    public static void main(String[] a) {
	  int[] ls = {1,2,3,4,5,6,7,8,9,10};
	  int i = 0;
	  list = new IntegerList();
	  do {
		list.add(ls[i]);
		i++;
		} while (i <  ls.length);
	  list.prettyPrint();
    }
}
 
