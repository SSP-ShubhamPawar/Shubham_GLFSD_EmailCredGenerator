package com.greatlearning.businessclass;

import com.greatlearning.businessclass.EmailGeneratorImpl;

public class Employee extends EmailGeneratorImpl{
	
	String firstName;
	String lastName ;
	int department;
	
	public Employee(String fName, String lName , int dep )
	{
		generateEmailAddress(fName,  lName ,  dep);
		generatePassword();
	}
	
	
	
}
