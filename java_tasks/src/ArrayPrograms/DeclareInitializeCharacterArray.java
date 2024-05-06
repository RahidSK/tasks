package ArrayPrograms;

import java.util.Scanner;

public class DeclareInitializeCharacterArray {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter size of the character array: ");
		int size = scan.nextInt();
		// declaring a character array.
		char[] charArray = new char[size];
		
		System.out.print("Enter elements of character array: ");
		for(int i=0;i<size;i++) {
			charArray[i] = scan.next().charAt(0);
		}
		
		System.out.print("Elements of an array are: ");
		for(char c: charArray) {
			System.out.print(c+" ");
		}
		
		scan.close();
	}
}
