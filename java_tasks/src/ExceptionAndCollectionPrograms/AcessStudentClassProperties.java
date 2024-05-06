package ExceptionAndCollectionPrograms;

import java.util.Scanner;

class Adress{
	private int pincode;
	private String area;
	private String city;
	private String state;
	
	public Adress(int pincode, String area, String city, String state) {
		this.pincode = pincode;
		this.area = area;
		this.city = city;
		this.state = state;
	}
	

	@Override
	public String toString() {
		return "Adress [pincode=" + pincode + ", area=" + area + ", city=" + city + ", state=" + state + "]";
	}
	
	
}


class Student{
	private int rollNo;
	private String name;
	private String contact;
	private Adress adress;
	private String schoolName;
	
	public Student() {
		
	}
	
	public Student(int rollNo,String name, String contact, Adress adress,String schoolname) {
		this.rollNo = rollNo;
		this.name = name;
		this.contact = contact;
		this.adress = adress;
		this.schoolName = schoolname;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public String getName() {
		return name;
	}
	public String getContact() {
		return contact;
	}
	public Adress getAdress() {
		return adress;
	}
	public String getSchoolName() {
		return schoolName;
	}
	
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public void setAdress(Adress adress) {
		this.adress = adress;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	
	@Override
	public String toString() {
		return "Student[rollNo="+rollNo+" name = "+name+" contact= "+contact+" Adress=["+adress+"] schoolName = "+schoolName+"]";
	}
}

public class AcessStudentClassProperties {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		System.out.print("Enter how many students to add: ");
//		int numberOfStudents = scan.nextInt();
		
		Student student1 = new Student();
		//accessing student properties.
		
		System.out.print("Enter Student rollNo: ");
		student1.setRollNo(scan.nextInt());
		System.out.println("After Setting rollNo: "+student1.getRollNo());
		scan.nextLine();
		
		System.out.print("Enter name of student: ");
		student1.setName(scan.nextLine());
		System.out.println("After Setting Name: "+student1.getName());
		
		System.out.print("Enter contact of student: ");
		student1.setContact(scan.nextLine());
		System.out.println("After Setting Contact: "+student1.getContact());
		
		Adress adress = new Adress(524305, "Buchi", "Nellore", "Andhra" );
		student1.setAdress(adress);
		System.out.println("After Setting Adress: "+student1.getAdress());
		
		System.out.print("Enter school name of student: ");
		student1.setSchoolName(scan.nextLine());
		System.out.println("After Setting SchoolName: "+student1.getSchoolName());
		
		//by passing parameters
		Student student2 = new Student(102, "Alan", "9481546142", adress, "SMTB");
		
		System.out.println(student2);
	}
}
