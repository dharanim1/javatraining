package EmployeeManagement;

public abstract class ManagerEmployee extends FullTimeEmployee implements Bonus {
	public ManagerEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ManagerEmployee(String empname, int empId, String empDept, double basicSalary, int leaveDays, double bonus) {
		super(empname, empId, empDept, basicSalary, leaveDays, bonus);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double calculateBonus(double Bonus) {
		// TODO Auto-generated method stub
		return Bonus *Bonus_Percentage;
	}
}


