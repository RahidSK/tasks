package BasicPrograms;

import java.util.Scanner;

public class LeapYear {
	private static void checkLeapYear(int year) {
		if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
			System.out.println(year + " is a leap year.");
		} else {
			System.out.println(year + " is not a leap year.");
		}

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a year to check leap year or not: ");
		int year = scan.nextInt();
		checkLeapYear(year);
		scan.close();
	}
}
