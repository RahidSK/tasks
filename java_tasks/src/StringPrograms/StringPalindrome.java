package StringPrograms;
import java.util.Scanner;

public class StringPalindrome {

	public static boolean isPalindrome(String str) {

		String reverseString = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reverseString += str.charAt(i);
		}

		return reverseString.equals(str);
	}
	
	public static boolean checkPalindromeUsingRecursion(String str) {
		boolean flag = true;
		if(str.length()<=1) 
			return true;
			checkPalindromeUsingRecursion(str.substring(1,str.length()-1));
			if(str.charAt(0)!=str.charAt(str.length()-1))
				flag = false;
		return flag;
		
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter string: ");
		String str = scan.next();
		System.out.print("1. By using normal logic.\n2. By using recursion.\nSelect the logic you want to check palindrome on string:");
		int function = scan.nextInt();
		if(function==1) {
			if (isPalindrome(str)) {
				System.out.println("Given String " + str + " is palindrome....");
			} else {
				System.out.println("Given String " + str + " is not a palindrome....");
			}
		}else if(function == 2) {
			if(checkPalindromeUsingRecursion(str)) {
				System.out.println("Given String "+str+" is palindrome....");
			}else {
				System.out.println("Given String " + str + " is not a palindrome....");
			}
		}
		scan.close();
	}
}
