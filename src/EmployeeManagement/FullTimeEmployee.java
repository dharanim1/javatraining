package EmployeeManagement;

public abstract class FullTimeEmployee extends Employee implements Taxable,WorkHours{
	public FullTimeEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FullTimeEmployee(String empname, int empId, String empDept, double basicSalary, int leaveDays,double bonus) {
		super(empname, empId, empDept, basicSalary, leaveDays);
		// TODO Auto-generated constructor stub
		this.bonus=bonus;
		this.basicSalary=basicSalary;
		this.empname=empname;
		this.empId=empId;
		this.leaveDays=leaveDays;
		this.empDept=empDept;
	}
    private double bonus;
 

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return empname;
	}
	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return empId;
	}
	@Override
	public int getWorkhours() {
		// TODO Auto-generated method stub
		return standard_WorkHours;
	}
	@Override
	public double CalculateTax(double salary) {
		// TODO Auto-generated method stub
		return salary*0.20;
	}
	@Override
	double calculateSalary() {
		// TODO Auto-generated method stub
		return basicSalary*bonus;
	}
	@Override
	String employeeType() {
		// TODO Auto-generated method stub
		return "Full Time Employee";
	}
	@Override
	void provideBenefits() {
		// TODO Auto-generated method stub
		System.out.println("Health insurance,Provident Fund");
	}
}
 