package StringPrograms;

import java.util.Scanner;

public class SortStringAlphabitically{

	public static String sortAlphabitically(String string) {
		String[] stringArray = string.split(" ");
		
//		Arrays.sort(stringArray);
		
		for(int i=0;i<stringArray.length-1;i++) {
			for(int j=i+1;j<stringArray.length;j++) {
				if(stringArray[i].compareTo(stringArray[j])>0) {
					String temp = stringArray[i];
					stringArray[i] = stringArray[j];
					stringArray[j] = temp;
				}
			}
		}
		
		string = "";
		for(String s:stringArray) {
			string+=s+" ";
		}
		
		return string.trim();
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter String to sort: ");
		String string = scan.nextLine();
		System.out.println("before soring string is: "+string);
		
		string = sortAlphabitically(string);
		
		System.out.println("after sorting string is: "+string);
		scan.close();	}
	
}
