package BasicPrograms;

import java.util.Scanner;

public class DivisibleByNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int noOfValuesDivisible = 0;
		System.out.println("Enter range to check the Numbers divisible by 3: ");
		System.out.print("Lower Range: ");
		int lrange = scan.nextInt();
		System.out.print("Upper Range: ");
		int urange = scan.nextInt();
		System.out.print("Enter the value which should divide: ");
		int divider = scan.nextInt();
		scan.close();
		if (divider == 0) {
			System.out.println("It will print Infinity...");
			return;
		}
		System.out.print("Numbers which are divisible by " + divider + " are: ");
		for (int range = lrange; range <= urange; range++) {
			if (range % divider == 0) {
				noOfValuesDivisible++;
				System.out.print(range + ",");
			}
		}
		System.out.println("\nTotal Number of values divisble by " + divider + " are: " + noOfValuesDivisible);
	}
}
