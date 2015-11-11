
public class commissionEmployee extends Employee {

	//PRIVATE VARIABELS +++++++++++++++++++++++

private double _grossSales;
private double _commissionRate;

// CONSTRUCTOR ++++++++++++++++++++++
public commissionEmployee(String firstName, String lastName, String SSN, double grossSales, double commissionRate){
super(firstName, lastName,SSN);
if (grossSales<0){
	throw new IllegalArgumentException("The gross sales must be greater than 0");
}
if (commissionRate<=0 || commissionRate>=1){
	throw new IllegalArgumentException("The commission rate must be between 0 and 1");
}

this._grossSales = grossSales;
this._commissionRate = commissionRate;

}

//PROPERTIES ++++++++++++++++++

public double getGrossSales() {
	return this._grossSales;
}

public void setGrossSales(double grossSales) {
	if (grossSales<0){
		throw new IllegalArgumentException("The gross sales must be greater than 0");
	}
	this._grossSales = grossSales;
}

public double getCommissionRate() {
	return this._commissionRate;
}

public void setCommissionRate(double commissionRate) {
	if (commissionRate<=0 || commissionRate>=1){
		throw new IllegalArgumentException("The commission rate must be between 0 and 1");
	}
	this._commissionRate = commissionRate;
}

//PUBLIC METHODS +++++++++++++++++

			public double earnings(){
				
					return getGrossSales() * getCommissionRate();
				
			}
			
			public String toString(){
				return String.format("%s%nis a comission employee.%nwith the gross sales: $%,.2f and the commission rate: .2f ", super.toString(),getGrossSales(), getCommissionRate());
			}

}




