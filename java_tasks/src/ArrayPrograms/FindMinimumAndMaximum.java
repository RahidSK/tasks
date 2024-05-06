package ArrayPrograms;

import java.util.Scanner;

public class FindMinimumAndMaximum {
	
	public static int maxElement(int[] array) {
		
		int maxElement = array[0];
		
		for(int elements: array) {
			if(maxElement<elements)
				maxElement = elements;
		}
		
		return maxElement;
	}
	
	public static int minElement(int[] array) {
		
		int minElement = array[0];
		
		for(int elements: array) {
			if(minElement>elements)
				minElement = elements;
		}
		
		return minElement;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter size of the integer array: ");
		int size = scan.nextInt();
		
		//declare an integer array.
		int[] intArray = new int[size];
		
		//initializing the array.
		System.out.print("Enter elements of an array: ");
		for(int i=0;i<size;i++) {
			intArray[i] = scan.nextInt();
		}
		
		System.out.println("Maximum element of array is: "+maxElement(intArray));
		System.out.println("Minimum element of array is: "+minElement(intArray));
		
		scan.close();
	}
}
