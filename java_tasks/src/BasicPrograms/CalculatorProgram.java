package BasicPrograms;

import java.util.Scanner;

public class CalculatorProgram {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Press Y/y to start the calculator:");
		char c = scan.next().charAt(0);
		System.out.println("---------------------------------");
		while (c == 'Y' || c == 'y') {
			System.out.print("Enter the values\nValue1= ");
			int num1 = scan.nextInt();
			System.out.print("Value2= ");
			int num2 = scan.nextInt();
			System.out.println("Select the operation like to perform on data:");
			System.out.println(
					"\t1.Addition(+) \n\t2.Subtraction(-) \n\t3.Multiplication(*) \n\t4.Division(/) \n\t5.Modulus(%)");
			int operation = scan.nextInt();
			System.out.println("------------------------------------------------------");
			switch (operation) {
			case 1:
				System.out.println("Addition of " + num1 + " and " + num2 + " is: " + (num1 + num2));
				break;
			case 2:
				System.out.println("Subtraction of " + num1 + " and " + num2 + " is: " + (num1 - num2));
				break;
			case 3:
				System.out.println("Multiplication of " + num1 + " and " + num2 + " is: " + (num1 * num2));
				break;
			case 4:
				if (num2 == 0) {
					System.out.println("Division of " + num1 + " and " + num2 + " is: Infinity");
					break;
				}
				System.out.println("Division of " + num1 + " and " + num2 + " is: " + (num1 / num2));
				break;
			case 5:
				if (num2 == 0) {
					System.out.println("Modulus of " + num1 + " and " + num2 + " is: NaN");
				}
				System.out.println("Modulus of " + num1 + " and " + num2 + " is: " + (num1 % num2));
				break;
			default:
				System.out.println("Please select the valid operaion to perform...");
			}

			System.out.println("------------------------------------------------------");
			System.out.print("Press N/n to exit Y/y to continue:");
			c = scan.next().charAt(0);
			System.out.println("-------------------------------------------");
			if (c == 'n' || c == 'N')
				break;
		}

		scan.close();
	}
}
