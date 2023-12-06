
public class EmailGeneratorImpl implements email_app
{
	String firstName;
	String lastName;
	int departmentCode;
	String emailId ;
	String password; 
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
		this.firstName = firstName;
		email.append(firstName);
		email.append(".");
		email.append(lastName);
		email.append("@");
		switch(departmentCode)
		{
		case 1:{email.append("Technical");break;}
		case 2:{email.append("Admin");break;}
		case 3:{email.append("HumanResource");break;}
		case 4:{email.append("Legal");break;}
		default :{email.append("Technical");break;}
		}
		email.append(".company.com");
		this.emailId = email.toString();
		
		
	}

	@Override
	public void generatePassword() 
	{
		// TODO Auto-generated method stub
		this.password = "12203";
	}

	@Override
	public void displayGeneratedCredentials() {
		System.out.println("Dear "+ this.firstName + " your generated credentails are as follows" );
		System.out.println("Email    --->" + this.emailId);
		System.out.println("Password --->" + this.password);
		// TODO Auto-generated method stub
		
	}

}


