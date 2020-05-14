package companydetails;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Employee {
	private static Scanner input = new Scanner(System.in);
	private String name;
	private int employeeId;
	private String dateOfJoining;
	private String post;
	private String qualifications;
	private int age;
	private float salary;
	
	
	void setName()
	{
		System.out.println("Enter your name : ");
		name = input();
	}
	
	void setEmployeeId() throws IOException
	{
		File idFile = new File("id.txt");
		BufferedReader idis = new BufferedReader(new FileReader(idFile));
		employeeId = Integer.parseInt(idis.readLine()) + 1;
		idis.close();
		PrintWriter fileOfId = new PrintWriter(idFile);
		fileOfId.println(employeeId);
		fileOfId.flush();
		fileOfId.close();
	}
	
	void setDateOfJoining()
	{
		System.out.println("Enter Date of Joining : ");
		dateOfJoining =input(); 
	}
	
	void setPost()
	{
		System.out.println("Enter your post : ");
		post = input();
	}
	
	void setQualifications()
	{
		System.out.println("Enter Your Qualifications : ");
		qualifications = input();
	}
	
	void setAge()
	{
		System.out.println("Enter your age : ");
		age = Integer.parseInt(input());
		
	}
	
	void setSalary()
	{
		System.out.println("Enter your salary : ");
		salary = Float.parseFloat(input());
	}
	
	String getName()
	{
		return name;
	}
	
	private String input()
	{
		return( input.nextLine());
	}
	
	int getEmployeeId()
	{
		return employeeId;
	}
	
	void createFile() throws IOException
	{
		String fileName = Integer.toString(employeeId);
		File f1 = new File(fileName + ".txt");
		f1.createNewFile();
		PrintWriter pw = new PrintWriter(new FileWriter(f1));
		pw.println("Name : " + name);
		pw.println("Id : " + employeeId);
		pw.println("Age : " + age);
		pw.println("Qualifications : " +qualifications);
		pw.println("Date of Joining : " +dateOfJoining);
		pw.println("Post : " + post);
		pw.println("Salary : " + salary);
		pw.flush();
		pw.close();
	}
}
