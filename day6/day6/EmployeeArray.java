package day6;

import java.util.Arrays;

/**
 * This class holds an Array of employees, 
 * with methods to read names and IDs from user and print the list of employees 
 * following different conditions.
 * It uses a growing Array.
 * Instead of using parallel Arrays (one for names and another for IDs), 
 * it uses an Array of Objects(Employees).
 */

/**
 * @author joel
 *
 */

class Employee {
	private String name;
	private int id;
	
	public Employee (String name, int Id) {
		this.name = name;
		this.id = Id;
	}
	
	public int getId() {
		return id;		
	}
	
	public String getName() {
		return name;		
	}
	
	public boolean shouldPrint() {
		return (id%2 == 0 || name.charAt(0) == 'S');
	}
}

public class EmployeeArray {
	private Employee[] employees = new Employee[2];
	private int emplSize;

	public void addEmployee(Employee newEmployee) {
		if (emplSize == employees.length) {
			employees = Arrays.copyOf(employees, 2 * employees.length);
		}
		employees[emplSize] = newEmployee;
		emplSize++;
	}
	
	public void printEmployees() {
		for (int i = 0; i < emplSize; i++) {
			Employee employee = employees[i];
			if (employee.shouldPrint()) {
				System.out.println("Employee name: " + employee.getName());
				System.out.println("Employee Id: " + employee.getId());
			}	
		}
	}

	/**
	 * This method takes input from user
	 */
	private static Employee inputEmployee() {
		System.out.println("Employee name: ");
		String name = System.console().readLine();
		if (name.equals("")) {
			return null;
		}
		while(true) {
			System.out.println("Employee Id: ");
			String input = System.console().readLine();
			try {
				return new Employee(name,Integer.parseInt(input));
			} catch (NumberFormatException e){
				System.out.println(input + " is not a number");				
			}
		} 
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EmployeeArray myEmployees = new EmployeeArray();
		while (true) {
			Employee newEmployee = inputEmployee();
			if (newEmployee == null) {
				break;
			}
			myEmployees.addEmployee(newEmployee);
		}
		myEmployees.printEmployees();
	}

}
