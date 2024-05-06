package ArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class CopyNumberArrayToEmptyArray {
	
	public static int[] copyArray(int[] array, int[] emptyArray) {
		for(int i=0;i<array.length;i++) {
			emptyArray[i] = array[i];
		}
		return emptyArray;
	}
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter size of the array: ");
		int size = scan.nextInt();

		// Declaring a integer array.
		int[] intArray = new int[size];
		
		// initializing the array
		System.out.print("Enter elements of an array: ");
		for (int i = 0; i < size; i++) {
			intArray[i] = scan.nextInt();
		}
		
		System.out.println("Elements of an array are: "+Arrays.toString(intArray));
		
		// declaring an empty array.
		int[] emptyArray = new int[size];
		System.out.println("Elements of an empty array are: "+Arrays.toString(emptyArray));
		
		emptyArray = copyArray(intArray, emptyArray);
		System.out.println("Elements of an empty array after copying are: "+Arrays.toString(emptyArray));
		
		scan.close();
	}
}
