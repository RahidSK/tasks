package StringPrograms;
import java.util.Scanner;

public class ReverseStringWordsUsingInbuilt {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter String: ");
		StringBuilder sb =new StringBuilder(scan.nextLine()) ;
		
		System.out.println("Before reversing string: "+sb);
		System.out.println("After reversing string: "+sb.reverse());
		
		scan.close();
	}
}
