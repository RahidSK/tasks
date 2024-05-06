package ExceptionAndCollectionPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

//pojo class of employee
class Employee {
	private int eid;
	private String ename;
	private String edesignation;
	private int esalary;
	private long econtact;

	public Employee(int eid, String ename, String edesignation, int esalary, long econtact) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.edesignation = edesignation;
		this.esalary = esalary;
		this.econtact = econtact;
	}

	public int getEid() {
		return eid;
	}

	public String getEname() {
		return ename;
	}

	public String getEdesignation() {
		return edesignation;
	}

	public int getEsalary() {
		return esalary;
	}

	public long getEcontact() {
		return econtact;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public void setEdesignation(String edesignation) {
		this.edesignation = edesignation;
	}

	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}

	public void setEcontact(long econtact) {
		this.econtact = econtact;
	}

}




public class ListOfCustomObjects {
	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();
		Scanner scan = new Scanner(System.in);
		System.out.print("How many employees you like to add: ");
		int numberOfEmployees = scan.nextInt();
		for (int i = 1; i <= numberOfEmployees; i++) {
			System.out.print("Enter Employee-" + i + " ID: ");
			int eid = scan.nextInt();

			System.out.print("Enter Employee-" + i + " Name: ");
			String ename = scan.next();

			System.out.print("Enter Employee-" + i + " Designation: ");
			String edesignation = scan.next();

			System.out.print("Enter Employee-" + i + " Salary: ");
			int esalary = scan.nextInt();

			System.out.print("Enter Employee-" + i + " Contact: ");
			long econtact = scan.nextLong();

			// Create a new instance of the Employee class using the constructor
			Employee employee = new Employee(eid, ename, edesignation, esalary, econtact);

			// Add the employee to the list
			list.add(employee);
			System.out.println("----------------------------------------------------------");
		}

		// Print the details of the employees in the list
		for (Employee employee : list) {
			System.out.println("ID: " + employee.getEid() + " Name: " + employee.getEname() + " Designation: "
					+ employee.getEdesignation() + " Salary: " + employee.getEsalary() + " Contact: "
					+ employee.getEcontact());
		}
		System.out.println("----------------------------------------------------------");
		
		// Iteration of list elements using the iterator.
		
		Iterator<Employee> iterator = list.iterator();
		System.out.println("list iteration using iteration():");
		while(iterator.hasNext()) {
			Employee e = iterator.next();
			System.out.println("ID: "+e.getEid()+" Name: "+e.getEname()+" Designation: "+e.getEdesignation()+" Salary: "+e.getEsalary()+" Contact: "+e.getEcontact());
		}
		
		System.out.print("like to print any specific employee Y/N: ");
		char decision = scan.next().charAt(0);
		if(decision == 'y'|| decision == 'Y') {
			System.out.print("Enter employee-id to print details: ");
			int specificId = scan.nextInt();
			Employee specificEmployee=null;
				for(Employee e:list) {
					if(e.getEid()==specificId) {
						specificEmployee =e;
					}
				}
//			Employee specificEmployee = list.get(specificEmployeeDetails);
			System.out.println("Deatils of id"+specificId+" employee is: ");
			System.out.print("ID= " + specificEmployee.getEid() + " Name= " + specificEmployee.getEname() + " Designation= "
					+ specificEmployee.getEdesignation() + " Salary= " + specificEmployee.getEsalary() + " Contact= "
					+ specificEmployee.getEcontact());
		}
	}
	

}
