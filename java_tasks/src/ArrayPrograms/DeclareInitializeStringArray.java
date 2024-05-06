package ArrayPrograms;

import java.util.Scanner;

public class DeclareInitializeStringArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter size of an string array: ");
		int size = scan.nextInt();
		
		String[] stringArray = new String[size];
		System.out.print("Enter elements of the array: ");
		for(int i=0;i<size;i++) {
			stringArray[i] = scan.next();
		}
		
		//to print the string array
		System.out.print("elements of an array are: ");
		for(String string: stringArray) {
			System.out.print(string+" ");
		}
		scan.close();
	}
}
