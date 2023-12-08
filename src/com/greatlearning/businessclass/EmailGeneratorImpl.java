package com.greatlearning.businessclass;

import java.util.Random;
import com.greatlearning.interfaces.ICredentialManager;

public class EmailGeneratorImpl implements ICredentialManager
{
	private String firstName;
	private String lastName;
	private int departmentCode;
	private String emailId ;
	private String password; 
	/*EmailGeneratorImpl(String fName, String lName , int dep )
	{
		this.firstName = fName;
		this.lastName = lName;
		this.departmentCode = dep;
	}*/
	@Override
	public void generateEmailAddress(String firstName, String lastName, int departmentCode) {
		// TODO Auto-generated method stub
		StringBuilder email = new StringBuilder();
		this.firstName = firstName.toLowerCase();
		email.append(firstName.toLowerCase());
		email.append(".");
		email.append(lastName.toLowerCase());
		email.append("@");
		switch(departmentCode)
		{
		case 1:{email.append("Technical");break;}
		case 2:{email.append("Admin");break;}
		case 3:{email.append("HumanResource");break;}
		case 4:{email.append("Legal");break;}
		default :{email.append("Technical");break;}
		}
		email.append(".gl.com");
		this.emailId = email.toString();
		
		
	}

	@Override
	public void generatePassword() 
	{
		int len= 10;
		StringBuilder pass =  new StringBuilder();
		Random ran = new Random();
		String small  ="qwertyuiopasdfghjklzxcvbnm";
		String cap = "AQWSEDRFTGYHUJIKOLPXZCVBNM";
		String number = "0123456789";
		String spl_char = "~!@#$%^&*_-";
		for(int i=0;i<len;i++)
		{
			int random  = Math.abs(ran.nextInt() % 100);
			if(i<=2)
			{
				pass.append(cap.charAt( random % cap.length()));
				//System.out.print(cap.charAt( random % cap.length()));
			}
			if(i>=3 && i<=5)
			{
				pass.append(number.charAt(random % number.length()));
				//System.out.print(number.charAt(random % number.length()));
			}
			if(i>=6 && i<=7)
			{
				pass.append(spl_char.charAt(random % spl_char.length()));
				//System.out.print(spl_char.charAt(random % spl_char.length()));
			}
			if(i>=8 && i<=10)
			{
				pass.append(small.charAt(random % small.length()));
				//System.out.print(small.charAt(random % small.length()));
			}
			
		}
		this.password = pass.toString();
	}

	@Override
	public void displayGeneratedCredentials() {
		System.out.println("Dear "+ this.firstName + " your generated credentails are as follows" );
		System.out.println("Email    --->" + this.emailId);
		System.out.println("Password --->" + this.password);
		// TODO Auto-generated method stub
		
	}

}


