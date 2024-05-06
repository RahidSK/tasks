package BasicPrograms;

import java.util.Scanner;

public class NumbersPrintingInRange {
	private static void rangeOfNumbersUsingWhileLoop(int lrange, int urange) {
		System.out.print("Numbers in " + lrange + " to " + urange + " range in while loop are= ");
		while (lrange <= urange) {
			System.out.print((lrange++) + " ");
		}
	}

	private static void rangeOfNumbersUsingDoWhileLoop(int lrange, int urange) {
		System.out.print("Numbers in " + lrange + " to " + urange + " range in do-while loop are= ");
		do {
			if (lrange > urange)
				return;
			System.out.print((lrange++) + " ");
		} while (lrange <= urange);

	}

	private static void rangeOfNumbersUsingForLoop(int lrange, int urange) {
		System.out.print("Numbers in " + lrange + " to " + urange + " range in do-while loop are= ");
		for (int range = lrange; range <= urange; range++) {
			System.out.print(range + " ");
		}

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Range you want to print:");
		System.out.print("Lower Range= ");
		int lrange = scan.nextInt();
		System.out.print("Upper Range: ");
		int urange = scan.nextInt();
		scan.close();
		rangeOfNumbersUsingWhileLoop(lrange, urange);
		System.out.println();
		rangeOfNumbersUsingDoWhileLoop(lrange, urange);
		System.out.println();
		rangeOfNumbersUsingForLoop(lrange, urange);
	}

}
