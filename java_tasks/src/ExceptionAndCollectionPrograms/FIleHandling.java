package ExceptionAndCollectionPrograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FIleHandling {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char decision = 'Y';
		
		while(decision=='y'|| decision == 'Y') {
			System.out.print(
					"1:Create a directory\n"
					+ "2:List all the files in the directory\n"
					+ "3: Delete Directory\n"
					+ "4: Add Files to Directory\n"
					+ "5: Write Operation in file\n"
					+ "6:Read Operation in file\n"
					+ "--------------------------\n"
					+ "Slect the choise: ");
			int choice=0;
			try {
				choice = scan.nextInt();
			}catch(InputMismatchException e) {
				e.getMessage();
			}
			switch(choice) {
			case 1:
				System.out.println(createDirectory(path(scan)));
				
				break;
			case 2:
				listFilesInDirectory(path(scan));
				break;
			case 3:
				deleteFilesInDirectory(path(scan));
				break;
			case 4:
				addFilesToDirectory(path(scan),scan);
				break;
			case 5:
				writeFileOperation(scan);
				break;
			case 6:
				readFileOperation(scan);
				break;
			
			default:
				System.out.println("select from the given options.");
			}
			System.out.println("=============================================");
			System.out.println("want to continue: y/n : ");
			decision = scan.next().charAt(0);
			if(!(decision=='y'|| decision == 'Y')) {
				System.out.println("Thank you visit again..");
				return;
			}
				
		}	

	}


	public static String path(Scanner scan) {
		System.out.print("Enter the directory path: ");
		String path = scan.next();
		return path;
	}
	
	public static boolean createDirectory(String path) {
		File directory = new File(path);
		if (!directory.exists()) {
			if (directory.mkdir()) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public static void listFilesInDirectory(String directoryPath) {
		File directory = new File(directoryPath);

		if (directory.exists() && directory.isDirectory()) {
			File[] files = directory.listFiles();
			if (files.length>0) {
				System.out.println("Files in directory:");
				for (File file : files) {
					System.out.println(file.getName());
				}
			} else {
				System.out.println("Directory is empty: " + directoryPath);
			}
		} else {
			System.out.println("Directory does not exist: " + directoryPath);
		}
	}
	
	public static void deleteFilesInDirectory(String directoryPath) {
		File directory = new File(directoryPath);
		
		if(directory.exists() && directory.isDirectory()) {
			File[] files = directory.listFiles();
			if(files.length>0) {
				for(File file: files) {
					if(file.delete()) {
						System.out.println("Deleted the file: "+file.getName());
					}else {
						System.out.println("File "+file.getName()+" is not deleted.");
					}
				}
			}else {
				System.out.println("Directory is empty.");
			}
		}else {
			System.out.println("directory does not exists...");
		}
	}
	
	private static void addFilesToDirectory(String directoryPath, Scanner scan) {
		System.out.println("Enter file you want to create: ");
		String file = scan.next();
		
		File fileReference = new File(directoryPath+"\\"+file);
		
		try {
			if(fileReference.createNewFile()) {
				System.out.println("file--"+fileReference.getName()+" is created successfully.");
			}else {
				System.out.println("file "+fileReference.getName()+" already exists.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static boolean writeFileOperation(Scanner scan) {
		System.out.println("Enter file path: ");
		String file = scan.next();
		File fileReference = new File(file);
		
		try {
			FileWriter writer = new FileWriter(fileReference);
			System.out.println("Enter the data you want to write into the file: ");
			scan.nextLine();
			writer.write(scan.nextLine());
//			writer.append(scan.nextLine());
			writer.close();
		}catch(FileNotFoundException  e) {
			System.out.println("eneterd file is not present");
			
		} catch (IOException e) {
			System.out.println("IOExeption occured..");
		}
		
		return true;
	}
	
	private static void readFileOperation(Scanner scan) {
		
		System.out.println("Enter file path: ");
		String file = scan.next();
		File fileReference = new File(file);
		
		try {
			FileReader reader = new FileReader(fileReference);
			int character;
			try {
				while((character = reader.read())!=-1) {
					System.out.print((char)character);
					
				}
				reader.close();
				System.out.println();
			}catch(IOException e) {
				e.getMessage();
			}
		}catch(FileNotFoundException fe) {
			fe.getMessage();
		}
	}
	
	
}
