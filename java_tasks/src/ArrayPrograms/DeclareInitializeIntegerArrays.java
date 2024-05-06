package ArrayPrograms;

import java.util.Scanner;

public class DeclareInitializeIntegerArrays {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter size of the array: ");
		int size = scan.nextInt();//dynamically declaring the size of an array.
		
		// integer array.
		int[] arr = new int[size];
		System.out.print("Enter elements of an array:");
		for(int i=0;i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}

		System.out.print("Elements of an array are: ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		
		scan.close();
	}
}
