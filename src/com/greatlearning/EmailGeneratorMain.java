package com.greatlearning;

import java.util.Scanner;

import com.greatlearning.businessclass.Employee;

public class EmailGeneratorMain {
	
	public static void main(String args[])
	{
		int department = 0;
		String firstName = null;
		String lastName = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first Name ");
		firstName = sc.next();
		System.out.println("Enter your Last Name ");
		lastName = sc.next();
		
		
		System.out.println("Please enter the department form the following ");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human resource");
		System.out.println("4. Legal");
		if(sc.hasNextInt())
		{
			department = sc.nextInt();
		}
		Employee emp = new Employee(firstName,lastName,department);
		emp.displayGeneratedCredentials();
		
	}

}
