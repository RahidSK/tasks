package StringPrograms;

import java.util.Scanner;

public class DuplicateCharactersInString {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter String to check duplicate characters: ");
		String string = scan.nextLine();
		System.out.println("Duplicate characters in string are: "+checkDuplicate(string));
		scan.close();
		
	}
	
	private static String checkDuplicate(String string) {
		String repeatedCharacters=""; 
		while(string.length()!=0) {
			char c = string.charAt(0);
			int count = 0;
			for(int i=0;i<string.length();i++) {
				if(c == string.charAt(i)&& c!=' ') {
					count++;
				}
			}
			if(count>1) {
				repeatedCharacters+=c+"="+count+" ";
			}
				
			string = string.replaceAll(c+"", "");
				
		}
		return repeatedCharacters.trim();
	}
}
