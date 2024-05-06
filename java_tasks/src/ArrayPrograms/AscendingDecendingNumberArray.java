package ArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class AscendingDecendingNumberArray {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter size of th number array: ");
		int size = scan.nextInt();
		
		int[] array = new int[size];
		System.out.print("Enter numbers of an array:");
		for(int index=0; index<size; index++) {
			array[index] = scan.nextInt();
		}
		scan.close();
//		ascendingOrder(array);
		MergeSort.divide(array, 0, size-1);
		System.out.println("Ascending order of array is: "+Arrays.toString(array));
		decendingOrder(array);
		System.out.println("Decending order of array is: "+Arrays.toString(array));
	}

	private static void ascendingOrder(int[] array) {
		for(int i=0; i<array.length-1; i++) {
			for(int j=0; j<array.length-i-1; j++) {
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
	
	private static void decendingOrder(int[] array) {
		for(int i=0; i<array.length-1; i++) {
			for(int j=0; j<array.length-i-1; j++) {
				if(array[j] < array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
}
