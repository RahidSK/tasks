package StringPrograms;

import java.util.Scanner;

public class ReverseWordsInString {

	public static String reverseWord(String str) {
		char[] charArray = str.toCharArray();

		String str1 = "";
		for (int i = charArray.length - 1; i >= 0; i--)
			str1 += charArray[i];
		return str1;
	}
	
	
	public static String reverseWordsInString(String str) {

		// converting given statement into string array.
		char[] arr = str.toCharArray();
		int length = 1;

		for (char c : arr) {
			if (c == ' ')
				length++;
		}

		String[] stringArray = new String[length];
		String temp = "";
		int index = 0;

		for (char c : arr) {
			if (c != ' ') {
				temp += c;
			} else {
				stringArray[index++] = temp;
				temp="";
			}
		}
		stringArray[index] = temp;
		// given statement is converted to string array.s
		
		for (int stringIndex = 0; stringIndex < stringArray.length; stringIndex++) {
			stringArray[stringIndex] = reverseWord(stringArray[stringIndex]);
		}
		
		str = "";

		for (int i = 0; i < stringArray.length; i++) {
			str +=" "+stringArray[i];
		}

		return str;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter String: ");
		String string1 = scan.nextLine();

		System.out.println("before reversing words in string are: " + string1);
		System.out.println("Reversed words in string are: " + reverseWord(string1));
		System.out.println("reversed: "+reverseWordsInString(string1));
		
		scan.close();
	}
}
