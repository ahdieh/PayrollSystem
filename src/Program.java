
public class Program {

	public static void main(String[] args) {
		SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
		hourlyEmployee hourlyEmployee = new hourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40.00);
		commissionEmployee commissionEmployee = new commissionEmployee("Sue", "Jones", "333-33-3333", 10000, .06);
		basePlusCommissionEmployee basePlusCommissionEmployee = new basePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000, .04, 300);
	
		
		
	Employee[] employee = new Employee[4];
	employee[0] = salariedEmployee;
	employee[1] = hourlyEmployee;
	employee[2] = commissionEmployee;
	employee[3] = basePlusCommissionEmployee;
	
	for(Employee currentEmployee : employee){
		//System.out.println(currentEmployee);
		if (currentEmployee instanceof basePlusCommissionEmployee)
		{
			basePlusCommissionEmployee Employee = (basePlusCommissionEmployee) currentEmployee;
			Employee.setBaseSalary(1.10 * Employee.getBaseSalary());
			
			System.out.printf("%n%s%n%s: $%,.2f%n%n",salariedEmployee, "earned", salariedEmployee.earnings());
			System.out.printf("%n%s%n%s: $%,.2f%n%n",hourlyEmployee, "earned", hourlyEmployee.earnings());
			System.out.printf("%n%s%n%s: $%,.2f%n%n",commissionEmployee, "earned", commissionEmployee.earnings());
			System.out.printf("%n%s%n%s: $%,.2f%n",basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.earnings());
			
			System.out.printf("new base salary with 10%% increase is: $%,.2f\nearned $%,.2f%n%n",Employee.getBaseSalary(), currentEmployee.earnings() );
		}
		//System.out.printf("earned $%,.2f%n%n", currentEmployee.earnings());
		
		for(int i=0;i<employee.length;i++){
			System.out.printf("Employee[%d] = %s %s%n", i, employee[i].getFirstName(), employee[i].getLastName());
		}
	}
		
	
	
	}

}
