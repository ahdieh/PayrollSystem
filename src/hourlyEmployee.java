
public class hourlyEmployee extends Employee {

    //PRIVATE VARIABELS +++++++++++++++++++++++

	private double _wage;
	private double _hours;
	
	 // CONSTRUCTOR ++++++++++++++++++++++
	public hourlyEmployee(String firstName, String lastName, String SSN, double wage, double hours){
		super(firstName, lastName,SSN);
		if (wage<0){
			throw new IllegalArgumentException("The wage must be greater than 0");
		}
		if (hours<0){
			throw new IllegalArgumentException("The number of hours must be greater than 0");
		}
		this._wage = wage;
		this._hours = hours;
		
	}

	
	// PROPERTIES ++++++++++++++++++

	public double getWage() {
		return this._wage;
	}

	public void setWage(double wage) {
		this._wage = wage;
	}

	public double getHours() {
		return this._hours;
	}

	public void setHours(double hours) {
		this._hours = hours;
	}
	
	// PUBLIC METHODS +++++++++++++++++
	
			public double earnings(){
				if (getHours()<40){
				return getWage()* getHours();
				}
				else{
					return (40 *getWage()) + ((getHours() - 40)*getWage()*1.5);
				}
			}
			
			public String toString(){
				return String.format("%s%nis a hourly employee.%nwith the hourly wage: $%,.2f worked .2f hours", super.toString(),getWage(), getHours());
			}
}
