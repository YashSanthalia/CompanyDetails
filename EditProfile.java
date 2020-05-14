package companydetails;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class EditProfile {
	
	private static final String DELIMITTER = " : ";
	public static void editProfile() throws IOException
	{
		edit();
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
	
	private static void edit() throws IOException
	{
		while(true) {
		System.out.println("What you want to edit : ");
		System.out.println("1. Edit Name");
		System.out.println("2. Edit Age");
		System.out.println("3. Edit Qualifications");
		System.out.println("4. Edit Date of Joining");
		System.out.println("5. Edit Post");
		System.out.println("6. Edit Salary");
		System.out.println("0. Exit");
		int choice = inputChoice();
		if( choice == 0)
			break;
		nowEdit(choice);
		}
	}
	
	public static int inputChoice()
	{
		System.out.println("Enter your choice ( press 1, 2, 3, 4, 5, 6 or 0 ) : ");
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		return choice;
	}
	
	private static void nowEdit(int choice) throws IOException
	{
		switch(choice)
		{
		case 1 : editName();
				 break;
		case 2 : editAge();
				 break;
		case 3 : editQualifications();
				 break;
		case 4 : editDateOfJoining();
				 break;
		case 5 : editPost();
				 break;
		case 6 : editSalary();
				 break;
		default : System.out.println("Enter a valid choice");
		}
	}
	
	private static void editName() throws IOException {
		String id = inputEmployeeId();
		if( id == "-1" )
		{
			System.out.println("Invalid Id, Try Again");
			return;
		}
		File get = new File(id + ".txt");
		BufferedReader getFile = new BufferedReader(new FileReader(get));
		System.out.println("Enter new name : ");
		String nameRow = getFile.readLine();
		String name = Replace.replace(nameRow, DELIMITTER);
		String str2 = getFile.readLine();
		String str3 = getFile.readLine();
		String str4 = getFile.readLine();
		String str5 = getFile.readLine();
		String str6 = getFile.readLine();
		String str7 = getFile.readLine();
		getFile.close();
		PrintWriter newFile = new PrintWriter(get);
		newFile.println(name);
		newFile.println(str2);
		newFile.println(str3);
		newFile.println(str4);
		newFile.println(str5);
		newFile.println(str6);
		newFile.println(str7);
		newFile.flush();
		newFile.close();
	}
	
	private static void editAge() throws IOException {
		String id = inputEmployeeId();
		if( id == "-1" )
		{
			System.out.println("Invalid Id, Try Again");
			return;
		}
		File get = new File(id + ".txt");
		BufferedReader getFile = new BufferedReader(new FileReader(get));
		System.out.println("Enter new age : ");
		String str1 = getFile.readLine();
		String str2 = getFile.readLine();
		String ageRow = getFile.readLine();
		String age = Replace.replace(ageRow, DELIMITTER);
		String str4 = getFile.readLine();
		String str5 = getFile.readLine();
		String str6 = getFile.readLine();
		String str7 = getFile.readLine();
		getFile.close();
		PrintWriter newFile = new PrintWriter(get);
		newFile.println(str1);
		newFile.println(str2);
		newFile.println(age);
		newFile.println(str4);
		newFile.println(str5);
		newFile.println(str6);
		newFile.println(str7);
		newFile.flush();
		newFile.close();
	}
	
	private static void editQualifications() throws IOException {
		String id = inputEmployeeId();
		if( id == "-1" )
		{
			System.out.println("Invalid Id, Try Again");
			return;
		}
		File get = new File(id + ".txt");
		BufferedReader getFile = new BufferedReader(new FileReader(get));
		System.out.println("Enter new Qualifications : ");
		String str1 = getFile.readLine();
		String str2 = getFile.readLine();
		String str3 = getFile.readLine();
		String qualificationsRow = getFile.readLine();
		String qualifications = Replace.replace(qualificationsRow, DELIMITTER);
		String str5 = getFile.readLine();
		String str6 = getFile.readLine();
		String str7 = getFile.readLine();
		getFile.close();
		PrintWriter newFile = new PrintWriter(get);
		newFile.println(str1);
		newFile.println(str2);
		newFile.println(str3);
		newFile.println(qualifications);
		newFile.println(str5);
		newFile.println(str6);
		newFile.println(str7);
		newFile.flush();
		newFile.close();
	}
	
	private static void editDateOfJoining() throws IOException {
		String id = inputEmployeeId();
		if( id == "-1" )
		{
			System.out.println("Invalid Id, Try Again");
			return;
		}
		File get = new File(id + ".txt");
		BufferedReader getFile = new BufferedReader(new FileReader(get));
		System.out.println("Enter new date of joining : ");
		String str1 = getFile.readLine();
		String str2 = getFile.readLine();
		String str3 = getFile.readLine();
		String str4 = getFile.readLine();
		String dOJRow = getFile.readLine();
		String dOJ = Replace.replace(dOJRow, DELIMITTER);
		String str6 = getFile.readLine();
		String str7 = getFile.readLine();
		getFile.close();
		PrintWriter newFile = new PrintWriter(get);
		newFile.println(str1);
		newFile.println(str2);
		newFile.println(str3);
		newFile.println(str4);
		newFile.println(dOJ);
		newFile.println(str6);
		newFile.println(str7);
		newFile.flush();
		newFile.close();
	}
	
	private static void editPost() throws IOException {
		String id = inputEmployeeId();
		if( id == "-1" )
		{
			System.out.println("Invalid Id, Try Again");
			return;
		}
		File get = new File(id + ".txt");
		BufferedReader getFile = new BufferedReader(new FileReader(get));
		System.out.println("Enter new post : ");
		String str1 = getFile.readLine();
		String str2 = getFile.readLine();
		String str3 = getFile.readLine();
		String str4 = getFile.readLine();
		String str5 = getFile.readLine();
		String postRow = getFile.readLine();
		String post = Replace.replace(postRow, DELIMITTER);
		String str7 = getFile.readLine();
		getFile.close();
		PrintWriter newFile = new PrintWriter(get);
		newFile.println(str1);
		newFile.println(str2);
		newFile.println(str3);
		newFile.println(str4);
		newFile.println(str5);
		newFile.println(post);
		newFile.println(str7);
		newFile.flush();
		newFile.close();
	}
	private static void editSalary() throws IOException {
		String id = inputEmployeeId();
		if( id == "-1" )
		{
			System.out.println("Invalid Id, Try Again");
			return;
		}
		File get = new File(id + ".txt");
		BufferedReader getFile = new BufferedReader(new FileReader(get));
		System.out.println("Enter new salary : ");
		String str1 = getFile.readLine();
		String str2 = getFile.readLine();
		String str3 = getFile.readLine();
		String str4 = getFile.readLine();
		String str5 = getFile.readLine();
		String str6 = getFile.readLine();
		String salaryRow = getFile.readLine();
		String salary = Replace.replace(salaryRow, DELIMITTER);
		getFile.close();
		PrintWriter newFile = new PrintWriter(get);
		newFile.println(str1);
		newFile.println(str2);
		newFile.println(str3);
		newFile.println(str4);
		newFile.println(str5);
		newFile.println(str6);
		newFile.println(salary);
		newFile.flush();
		newFile.close();
		}
}
