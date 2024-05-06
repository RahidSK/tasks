package ArrayPrograms;

import java.util.Scanner;

public class DeclareInitializeDoubleArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter size of the double array: ");
		int size = scan.nextInt();
		// declaring a double array.
		double[] doubleArray = new double[size];
		
		System.out.print("Enter elements of character array: ");
		for(int i=0;i<size;i++) {
			doubleArray[i] = scan.nextDouble();
		}
		
		System.out.print("Elements of an array are: ");
		for(double d: doubleArray) {
			System.out.print(d+" ");
		}
		
		scan.close();
	}
}
