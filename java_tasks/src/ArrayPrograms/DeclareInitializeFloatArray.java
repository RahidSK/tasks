package ArrayPrograms;

import java.util.Scanner;

public class DeclareInitializeFloatArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter size of the float array: ");
		int size = scan.nextInt();
		// declaring a float array.
		float[] floatArray = new float[size];
		
		System.out.print("Enter elements of float array: ");
		for(int i=0;i<size;i++) {
			floatArray[i] = scan.nextFloat();
		}
		
		System.out.print("Elements of an array are: ");
		for(float f: floatArray) {
			System.out.print(f+" ");
		}
		
		scan.close();
	}
}
