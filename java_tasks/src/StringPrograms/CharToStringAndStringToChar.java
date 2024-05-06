package StringPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class CharToStringAndStringToChar {
	
	public static char[] characterArray(Scanner scan) {
		System.out.print("Enter size of character array: ");
		int arraySize = scan.nextInt();
		char[] charArray = new char[arraySize];
		System.out.print("Enter elements of character array: ");
		
		for(int charindex=0; charindex<arraySize; charindex++) {
			charArray[charindex] = scan.next().charAt(0);
		}
		return charArray;
	}
	
	private static String characterToString(Scanner scan) {
		char[] characterArray = characterArray(scan);
		String str = "";
		
		for(char c:characterArray) {
			str+=c;
		}
		return str;	
	}
	
	private static char[] StringTocharacter(Scanner scan) {
		
		System.out.print("Enter String to Convert into character array: ");
		String string = scan.nextLine();
		
		char[] charArray = string.toCharArray();
		
//		char[] charArray = new char[string.length()];
//		for(int i=0; i<string.length(); i++) {
//			charArray[i] = string.charAt(i);
//		}
		
		return charArray;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("1: Character to String\n2: String to Character\nselect which function you like to perform: ");
		int function = scan.nextInt();
		scan.nextLine();
		switch(function) {
		case 1:
			String str = characterToString(scan);
			System.out.println("character array which is converted to string is: "+str);
			break;
		case 2:
			char[] charArray = StringTocharacter(scan);
			System.out.println("String which is convered to character array is: "+Arrays.toString(charArray));
			break;
		}
	}

	

	
}
