package ArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class PrintArrayInRange {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter size of the array: ");
		int size = scan.nextInt();
		
		int[] intArray = new int[size];
		System.out.print("Enter elements of an array: ");
		for(int index=0; index<size; index++) {
			intArray[index] = scan.nextInt();
		}
		System.out.print("Enter range to print the values: ");
		int lowerRange = scan.nextInt();
		if(lowerRange>=size) {
			System.out.println("Please enter the range from "+0+" to "+(size-1));
			lowerRange = scan.nextInt();
		}
		int highRange = scan.nextInt();
		if(highRange<lowerRange) {
			System.out.println("Please enter the range from "+lowerRange+" to "+(size-1));
			highRange = scan.nextInt();
		}
		int[] newArray = new int[highRange-lowerRange+1];
		newArray = printRangeValues(intArray, lowerRange, highRange);
		System.out.println("Elements in range are: "+Arrays.toString(newArray));
		
		scan.close();
	}
	
	public static int[] printRangeValues(int[] array, int lowerRange, int highRange) {
		
		int[] newArray = new int[highRange-lowerRange+1];
		
		for(int index=lowerRange,i=0; index<=highRange; index++,i++) {
				newArray[i] = array[index];
		}
		return newArray;
	}
}
