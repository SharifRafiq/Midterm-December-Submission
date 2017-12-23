package design;

import java.util.Scanner;

public class EmployeeInfo implements Employee {
	
 /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
 * go to FortuneEmployee class to apply all the fields and attributes.
 * 
 * Important: YOU MUST USE the 
 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
 * Use all kind of keywords(super,this,static,final........)
 *
 */
	//declare few static and final fields and some non-static fields

	static String companyName;
	private String employeeName, department;
	private int employeeID,employeeAge, performance;
	private double salary;

	//multiple constructor created and this keyword has been used.
	//Must implement below constructor.
	public EmployeeInfo(int employeeId){

		this.employeeID = employeeId;
	}
	public EmployeeInfo(String name, int employeeId){
		this.employeeName = name;
		this.employeeID = employeeId;
	}
	public EmployeeInfo(String employeeName, String department, int employeeID, int employeeAge, int performance, double salary) {
		this.employeeName = employeeName;
		this.department = department;
		this.employeeID = employeeID;
		this.employeeAge = employeeAge;
		this.performance = performance;
		this.salary = salary;
	}
	//showing Encapsulation
	public static String getCompanyName() {
		return companyName;
	}
	public static void setCompanyName(String companyName) {
		EmployeeInfo.companyName = companyName;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public int getEmployeeAge() {
		return employeeAge;
	}
	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}
	public int getPerformance() {
		return performance;
	}
	public void setPerformance(int performance) {
		this.performance = performance;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	/*
	 * You must implement the logic for below 2 methods and 
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */
	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on. 
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 * 
	 */
	public static double calculateEmployeeBonus(double salary,String employeeName, int performance){
		double bonusSalary = 0;
		if(performance==5){
			bonusSalary = salary + (salary + salary*.10);
		}else if (performance == 4){
			bonusSalary = salary + (salary + salary*.08);
		}else if (performance == 3){
			bonusSalary = salary + (salary + salary*.06);
		}else if (performance == 4){
			bonusSalary = salary + (salary + salary*.04);
		}else if (performance == 4){
			bonusSalary = salary + (salary + salary*.02);
		}else {
			bonusSalary = salary;
		}
		System.out.println("Salary after bonus: " + bonusSalary);
		return bonusSalary;
	}
	
	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 * 
	 */
	public static double calculateEmployeePension(double salary){
		double pensionAmount=0;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Please enter start date in format (example: May,2015): ");
		String joiningDate = sc.nextLine();
		System.out.println("Please enter today's date in format (example: August,2017): ");
		String todaysDate = sc.nextLine();
        String convertedJoiningDate = DateConversion.convertDate(joiningDate);
        String convertedTodaysDate = DateConversion.convertDate(todaysDate);

        //implement numbers of year from above two dates
		String beginingYear = convertedJoiningDate.substring(convertedJoiningDate.length()-4, convertedJoiningDate.length());
		int begining= Integer.parseInt(beginingYear);
		String endingYear = convertedTodaysDate.substring(convertedTodaysDate.length()-4, convertedTodaysDate.length());
		int ending= Integer.parseInt(endingYear);

		//Calculating pension
		int noOfYears = ending - begining;

		if(noOfYears >=5){
			pensionAmount= salary*.25;
		}else if(noOfYears ==4){
			pensionAmount = salary*.20;
		}else if(noOfYears ==3){
			pensionAmount = salary*.15;
		}else if(noOfYears ==2){
			pensionAmount = salary*.10;
		}else if(noOfYears ==1){
			pensionAmount = salary*.05;
		}
		System.out.println("Total pension earned: " + pensionAmount);
		return pensionAmount;
	}
	public int employeeId() {
		return this.employeeID;
	}
	public String employeeName() {
		return this.employeeName;
	}
	public void assignDepartment() {
		department = "Finance";
	}
	public double calculateSalary() {

		return salary;
	}
	public void benefitLayout() {
		System.out.println("Everyone covered with Health Insurance");
	}
	private static class DateConversion {

		public DateConversion(Months months){}
		public static String convertDate(String date) {
			String [] extractMonth = date.split(",");
			String givenMonth = extractMonth[0];
			int monthDate = whichMonth(givenMonth);
			String actualDate = monthDate + "/" + extractMonth[1];
			return actualDate;
		}

		public static int whichMonth(String givenMonth) {
			Months months = Months.valueOf(givenMonth);
			int date = 0;
			switch (months) {
				case January:
					date = 1;
					break;
				case February:
					date = 2;
					break;
				case March:
					date = 3;
					break;
				case April:
					date = 4;
					break;
				case May:
					date = 5;
					break;
				case June:
					date = 6;
					break;
				case July:
					date = 1;
					break;
				case August:
					date = 1;
					break;
				case September:
					date = 1;
					break;
				case October:
					date = 1;
					break;
				case November:
					date = 1;
					break;
				case December:
					date = 1;
					break;
				default:
					date = 0;
					break;
			}
			return date;

		}
	}
}
