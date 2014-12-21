package day11;
public class GenericDoubleListTest {

	public static void main (String[] args) {

		GenericDoubleList<Integer> employeesNin = new GenericDoubleList<Integer>();
		employeesNin.add(new Integer(37));
		employeesNin.add(new Integer(38));
		employeesNin.add(new Integer(35));
		employeesNin.delete(35);
		employeesNin.prettyPrint();
		employeesNin.add(new Integer(40));
		employeesNin.prettyPrint();

		GenericDoubleList<String> employeesName = new GenericDoubleList<String>();
		employeesName.add(new String("Paul"));
		employeesName.add(new String("John"));
		employeesName.add(new String("Ringo"));
		employeesName.prettyPrint();
		employeesName.delete("Ringo");
		employeesName.add(new String("George"));
		employeesName.prettyPrint();
	}
}
