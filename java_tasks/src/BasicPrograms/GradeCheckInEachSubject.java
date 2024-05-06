package BasicPrograms;

import java.util.Scanner;

public class GradeCheckInEachSubject {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		

		
		System.out.print("Enter the 1st language marks: ");
		int firstLanguage =scan.nextInt();
		System.out.print("Enter the 2nd language marks: ");
		int secondLanguge = scan.nextInt();
		System.out.print("Enter the mathematics language marks: ");
		int mathematics = scan.nextInt();
		System.out.print("Enter the science language marks: ");
		int science = scan.nextInt();
		System.out.print("Enter the social language marks: ");
		int social = scan.nextInt();
		System.out.println("----------------------------------------------------");
		System.out.println("Grade in firstLanguage is= "+gradeCheck(firstLanguage));
		System.out.println("Grade in secondLanguge is= "+gradeCheck(secondLanguge));
		System.out.println("Grade in mathematics is= "+gradeCheck(mathematics));
		System.out.println("Grade in science is= "+gradeCheck(science));
		System.out.println("Grade in social is= "+gradeCheck(social));
		System.out.println("----------------------------------------------------");
		scan.close();
	}
	
	public static char gradeCheck(int marks) {
		if(marks>=80) {
			return 'A';
		}else if(marks<80 && marks>=60) {
			return 'B';
		}else if(marks<60 && marks>=40) {
			return 'C';
		}else {
			return 'D';
		}
	}
}
