package StringPrograms;
import java.util.Scanner;

public class ReverseWordsUsingRecursion {
	
	public static String reverse(String str) {
		if(str.length()==1 || str.isEmpty()) {
			return str; 
		}else {
			return str = reverse(str.substring(1))+str.charAt(0);
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter String: ");
		String str = scan.nextLine();
		System.out.println("string is= "+str);
		System.out.println("reversed = "+reverse(str));
		
		scan.close();
	}
}
