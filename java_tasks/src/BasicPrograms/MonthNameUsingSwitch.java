package BasicPrograms;

import java.util.Scanner;

public class MonthNameUsingSwitch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Select Month from 1-12 : ");
		int month = scan.nextInt();
		System.out.print("\nName of month " + month + " is : \"" + nameOfMonth(month) + "\"");
		scan.close();
	}

	public static String nameOfMonth(int month) {
		switch (month) {
		case 1:
			return "January";
		case 2:
			return "February";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "Auguest";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11:
			return "November";
		case 12:
			return "December";
		default:
			return "Not available in Year. Beacuse a Year consists of only 12 months...";
		}
	}
}
