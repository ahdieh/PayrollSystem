
public abstract class Employee {

	//PRIVATE VARIABLES +++++++++++++++++
	private String _firstName;
	private String _lastName;
	private String _SSN;
	
	// CONSTRUCTOR ++++++++++++++++++++++
	
	public Employee(){
		_initialize("","","");
	}
	
	//PRIVATE METHODS ++++++++++++++++++
	
	private void _initialize(String firstName, String lastName, String SSN){
		this._firstName = firstName;
		this._lastName = lastName;
		this._SSN = SSN;
	}
	
	//PROPERTIES +++++++++++++++++++++
	
	public String getFirstName(){
		return this._firstName;
	}
	
	public String getLastName(){
		return this._lastName;
	}
	
	public String getSSN(){
		return this._SSN;
	}
	
	// PUBLIC METHODS
	
	public String toString(){
		return String.format("%s %s with the social security number: %s", getFirstName(),getLastName(),getSSN());
	}
	
	public abstract double earnings();
	
}
