package StringPrograms;

import java.util.Scanner;

public class ReverseNumber {
	
	// Reverse by using For Loop
	public static int reverseUsingForLoop(int number) {

		int temp = 0;
		for (; number != 0; number /= 10)
			temp = (temp *= 10) + number % 10;

		return temp;
	}

	// Reverse by using While Loop
	private static int reverseUsingWhileLoop(int number) {

		int temp = 0;
		while (number != 0) {
			temp = (temp * 10) + number % 10;
			number /= 10;
		}

		return temp;
	}

	// Reverse by using Recursion
	private static int reverseUsingRecursion(int number, int reverseNumber) {

		if (number == 0) {
			return reverseNumber;
		} else {
			reverseNumber = reverseNumber * 10 + (number % 10);

			return reverseUsingRecursion(number / 10, reverseNumber);
		}

	}
	
	// main method
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number = scan.nextInt();
		int reverseNumber = 0;

		System.out.println("Reverse number using for loop= " + reverseUsingForLoop(number));
		System.out.println("Reverse number using while loop= " + reverseUsingWhileLoop(number));
		System.out.println("Reverse number using recursion= " + reverseUsingRecursion(number, reverseNumber));

		scan.close();
	}

}
