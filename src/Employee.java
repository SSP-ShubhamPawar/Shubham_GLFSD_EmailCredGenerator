
public class Employee extends EmailGeneratorImpl{
	
	String firstName;
	String lastName ;
	int department;
	
	Employee(String fName, String lName , int dep )
	{
		generateEmailAddress(fName,  lName ,  dep);
		generatePassword();
	}
	
	
	
}
