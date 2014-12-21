package day9;
public class IntegerTreeNodeTest {
    public static void main(String[] args) {
    	IntegerTreeNode test1 = new IntegerTreeNode(6);
    	test1.add(8);
    	test1.add(3);
    	test1.add(11);
    	test1.add(9);
    	test1.add(12);
    	test1.add(5);
    	System.out.println(test1.toString());
    	System.out.println(test1.toSimpleString());
    	System.out.println("The depth of this tree is " + test1.depth());

    }
}