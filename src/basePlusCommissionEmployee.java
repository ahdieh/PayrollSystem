
public class basePlusCommissionEmployee extends commissionEmployee {

	//PRIVATE VARIABELS +++++++++++++++++++++++

	private double _baseSalary;
	
	// CONSTRUCTOR ++++++++++++++++++++++
	public basePlusCommissionEmployee(String firstName, String lastName, String SSN, double grossSales, double commissionRate, double baseSalary){
	super(firstName, lastName,SSN, grossSales, commissionRate);
	if (baseSalary<0){
		throw new IllegalArgumentException("The base salary must be greater than 0");
	}
	
	this._baseSalary = baseSalary;

	}

	
	//PROPERTIES ++++++++++++++++++
	
	public double getBaseSalary() {
		return this._baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		if (baseSalary<0){
			throw new IllegalArgumentException("The base salary must be greater than 0");
		}
		this._baseSalary = baseSalary;
	}
	
	//PUBLIC METHODS +++++++++++++++++

	public double earnings(){
		
			return super.earnings() + getBaseSalary();
		
	}
	
	public String toString(){
		return String.format("%s %s%nwith the base salary: $%,.2f ", "based salary", super.toString(),getBaseSalary());
	}

}
