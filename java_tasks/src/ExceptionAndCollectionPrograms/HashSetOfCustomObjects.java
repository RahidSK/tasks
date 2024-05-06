package ExceptionAndCollectionPrograms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

class Customers{
	private int customerId;
	private String customerName;
	private String contact;
	public Customers(int customerId, String customerName, String contact) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.contact = contact;
	}
	public int getCustomerId() {
		return customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public String getContact() {
		return contact;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	
}

public class HashSetOfCustomObjects {
	
	public static void main(String[] args) {
		
		HashSet<Customers> set = new HashSet<Customers>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number of customers: ");
		int numberOfCustomers = scan.nextInt();
		
		for(int i=1;i<=numberOfCustomers;i++) {
			
			System.out.print("Enter customer Id: ");
			int id = scan.nextInt();
			
			System.out.print("Enter Customer name: ");
			String name = scan.next();
			
			System.out.print("Enter Customer contact: ");
			String contact = scan.next();
			
			Customers customers = new Customers(id, name, contact);
			
			set.add(customers);
		}
		
		Iterator<Customers> customerIterator = set.iterator();
		System.out.println("Set iterated through the list...");
		int i=1;
		while(customerIterator.hasNext()) {
			Customers customers = customerIterator.next();
			
			System.out.println("Customer"+(i++)+"-[ID: "+customers.getCustomerId()+", Name: "+customers.getCustomerName()+", Contact: "+customers.getContact()+"]");
		}
		
		
	}
}
