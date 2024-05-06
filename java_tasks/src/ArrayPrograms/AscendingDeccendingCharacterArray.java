package ArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class AscendingDeccendingCharacterArray {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter size of th number array: ");
		int size = scan.nextInt();
		
		char[] charArray = new char[size];
		System.out.print("Enter characters of array: ");
		for(int index=0; index<size; index++) {
			charArray[index] = scan.next().charAt(0);
		}
		
		ascendingOrder(charArray);
		System.out.println("Asceneding order of the character array are: "+Arrays.toString(charArray));
		decendingOrder(charArray);
		System.out.println("Decending order of the character array are: "+Arrays.toString(charArray));
		
		scan.close();
	}

	private static void ascendingOrder(char[] array) {
			for(int i=0; i<array.length-1; i++) {
				for(int j=0; j<array.length-i-1; j++) {
					if(array[j] > array[j+1]) {
						char temp = array[j];
						array[j] = array[j+1];
						array[j+1] = temp;
					}
				}
			}
	}	
	private static void decendingOrder(char[] array) {
		for(int i=0; i<array.length-1; i++) {
			for(int j=0; j<array.length-i-1; j++) {
				if(array[j] < array[j+1]) {
					char temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
}
