package companydetails;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ViewProfile {
	public static void viewProfile() throws IOException
	{
		view();
	}
	
	private static String inputEmployeeId()
	{
		System.out.println("Enter Your Id : ");
		Scanner input = new Scanner(System.in);
		String id = input.nextLine();
		File employeeFile = new File( id + ".txt");
		if( !employeeFile.exists())
			return "-1";
		return id;
	}
	
	private static void view() throws IOException
	{
		while(true) {
		System.out.println("What you want to see : ");
		System.out.println("1. View Name");
		System.out.println("2. View Age");
		System.out.println("3. View Qualifications");
		System.out.println("4. View Date of Joining");
		System.out.println("5. View Post");
		System.out.println("6. View Salary");
		System.out.println("0. Exit");
		int choice = inputChoice();
		if( choice == 0)
			break;
		nowView(choice);
		}
	}
	
	public static int inputChoice()
	{
		System.out.println("Enter your choice ( press 1, 2, 3, 4, 5, 6 or 0 ) : ");
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		return choice;
	}
	
	private static void nowView(int choice) throws IOException
	{
		switch(choice)
		{
		case 1 : viewName();
				 break;
		case 2 : viewAge();
				 break;
		case 3 : viewQualifications();
				 break;
		case 4 : viewDateOfJoining();
				 break;
		case 5 : viewPost();
				 break;
		case 6 : viewSalary();
				 break;
		default : System.out.println("Enter a valid choice");
		}
	}
	
	private static void viewName() throws IOException {
		String id = inputEmployeeId();
		if( id == "-1" ) {
			System.out.println("Invalid Id, Try Again");
			return;
		}
		File get = new File(id + ".txt");
		BufferedReader getFile = new BufferedReader(new FileReader(get));
		System.out.println(getFile.readLine());
		getFile.close();
	}
	
	private static void viewAge() throws IOException {
		String id = inputEmployeeId();
		if( id == "-1" ) {
			System.out.println("Invalid Id, Try Again");
			return;
		}
		File get = new File(id + ".txt");
		BufferedReader getFile = new BufferedReader(new FileReader(get));
		int i = 1;
		while( i < 3)
		{
			getFile.readLine();
			i++;
		}
		System.out.println(getFile.readLine());
		getFile.close();
	}
	
	private static void viewQualifications() throws IOException {
		String id = inputEmployeeId();
		if( id == "-1" ) {
			System.out.println("Invalid Id, Try Again");
			return;
		}
		File get = new File(id + ".txt");
		BufferedReader getFile = new BufferedReader(new FileReader(get));
		int i = 1;
		while( i < 4)
		{
			getFile.readLine();
			i++;
		}
		System.out.println(getFile.readLine());
		getFile.close();
	}
	
	private static void viewDateOfJoining() throws IOException {
		String id = inputEmployeeId();
		if( id == "-1" ) {
			System.out.println("Invalid Id, Try Again");
			return;
		}
		File get = new File(id + ".txt");
		BufferedReader getFile = new BufferedReader(new FileReader(get));
		int i = 1;
		while( i < 5) {
			getFile.readLine();
			i++;
		}
		System.out.println(getFile.readLine());
		getFile.close();
	}
	
	private static void viewPost() throws IOException {
		String id = inputEmployeeId();
		if( id == "-1" ) {
			System.out.println("Invalid Id, Try Again");
			return;
		}
		File get = new File(id + ".txt");
		BufferedReader getFile = new BufferedReader(new FileReader(get));
		int i = 1;
		while( i < 6) {
			getFile.readLine();
			i++;
		}
		System.out.println(getFile.readLine());
		getFile.close();
	}
	
	private static void viewSalary() throws IOException {
		String id = inputEmployeeId();
		if( id == "-1" )
		{
			System.out.println("Invalid Id, Try Again");
			return;
		}
		File get = new File(id + ".txt");
		BufferedReader getFile = new BufferedReader(new FileReader(get));
		int i = 1;
		while( i < 7) {
			getFile.readLine();
			i++;
		}
		System.out.println(getFile.readLine());
		getFile.close();
	}
}
