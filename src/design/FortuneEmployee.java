package design;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {
		EmployeeInfo emp1 = new EmployeeInfo(111);
		EmployeeInfo emp2 = new EmployeeInfo("Sharif", 978);
		EmployeeInfo emp3 = new EmployeeInfo("Kabir","Finance",789,42,4,40000.0);

		emp1.setPerformance(3);
		emp1.setSalary(45000.0);
		emp1.setEmployeeName("Matthew");
		emp1.setEmployeeAge(32);
		emp1.setDepartment("Accounting");

		EmployeeInfo.calculateEmployeeBonus(emp1.getSalary(), emp1.getEmployeeName(),emp1.getPerformance());
		EmployeeInfo.calculateEmployeePension(emp1.getSalary());


	}

}
