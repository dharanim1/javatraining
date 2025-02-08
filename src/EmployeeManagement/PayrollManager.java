package EmployeeManagement;

public class PayrollManager {
public static  void generatePayroll(Employee emp) {
	double salary=emp.calculateSalary();
	double tax=(emp instanceof Taxable)?((Taxable)emp).CalculateTax(salary):0.0;
	double netsalary=salary-tax;
	System.out.println("payroll :"+emp.getEmpname());
	System.out.println("Monthly salary"+salary);
	System.out.println("Taxdeduction: "+tax);
	System.out.println("Netsalary: "+netsalary);
}
}


