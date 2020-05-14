package companydetails;

import java.io.IOException;

public class NewEmployee {

	public static void newEmployee() throws IOException
	{
		System.out.println("WELCOME TO OUR COMPANY");
		Employee e = new Employee();
		e.setEmployeeId();
		e.setName();
		e.setAge();
		e.setQualifications();
		e.setDateOfJoining();
		e.setPost();
		e.setSalary();
		e.createFile();
	}
}
