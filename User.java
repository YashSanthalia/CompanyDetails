package companydetails;

import java.io.IOException;
import java.util.Scanner;

public class User{
	private static Scanner input = new Scanner(System.in);
	public static void main( String args[]) throws IOException
	{
		while(true) {
		System.out.println("1. New Employee");
		System.out.println("2. View Profile");
		System.out.println("3. Edit Profile");
		System.out.println("0. Exit");
		int choice = inputChoice();		
		if(choice == 0)
			break;
		switch(choice) {
		case 1 : NewEmployee.newEmployee();
				 break;
				 
		case 2 : ViewProfile.viewProfile();
				 break;
				 
		case 3 : EditProfile.editProfile();
				 break;
		default : System.out.println("Please Enter a valid choice : ");
		}
		}
	}
	
	public static int inputChoice()
	{
		System.out.println("Enter your choice ( press 1, 2 or 3 ) : ");
		int choice = input.nextInt();
		return choice;
	}
}
