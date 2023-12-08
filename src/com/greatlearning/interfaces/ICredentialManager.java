package com.greatlearning.interfaces;

public interface ICredentialManager 
{
	void generateEmailAddress(String firstName ,String lastName,int departmentCode);
	void  generatePassword();
	void displayGeneratedCredentials();
}
