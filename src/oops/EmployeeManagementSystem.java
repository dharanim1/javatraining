package oops;

public class EmployeeManagementSystem {

	public static void main(String[] args) {
		//  Employee em=new Employee();
				FullTimeEmployeeI f1=new FullTimeEmployeeI("rahul",7203,"IT",50000,3000);
				f1.organnisze();
				Employeeinterface.companyTagLine();
//				System.out.println("leave for full time is:"+f1.calSalary());
//				PartTimeEmp p1=new PartTimeEmp("rahul",7203,"IT",20,6,0);
//				System.out.println("leave for part time is:"+p1.applyLeave(0));
//				Intern i1=new Intern("rahul",7203,"IT",50000,3);
//				System.out.println("leave for intern  is:"+i1.applyLeave(3));
				PartTimeEmployeeI p1=new PartTimeEmployeeI("rahul",7203,"IT",20,6);
				p1.organnisze();
				internsi i1=new internsi("rahul",7203,"IT",50000);
				i1.organnisze();
			}
		

	}


