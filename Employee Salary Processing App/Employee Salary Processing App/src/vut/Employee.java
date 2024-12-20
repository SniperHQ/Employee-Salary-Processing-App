//////////////////////////////////////////////////////////////////////////////////////////////////
//222084308																						//
//MH Ntshangase																				   //
//February 2024																			      //
///////////////////////////////////////////////////////////////////////////////////////////////



package vut;

public class Employee {
	
	private String empName;
	private String cellNumber;
	private String empType;
	private double annualsalary;
	private double weeklyBonus;
	private double hourlyWage;

	
	
	public Employee() {
		this("None","None","None",00.00,00.00,00.00);
	}



	public Employee(String empName, String cellNumber, String empType, double annualsalary, double weeklyBonus,
			double hourlyWage) {
		this.empName = empName;
		this.cellNumber = cellNumber;
		this.empType = empType;
		this.annualsalary = annualsalary;
		this.weeklyBonus = weeklyBonus;
		this.hourlyWage = hourlyWage;
	}



	public String getEmpName() {
		return empName;
	}



	public void setEmpName(String empName) {
		this.empName = empName;
	}



	public String getCellNumber() {
		return cellNumber;
	}



	public void setCellNumber(String cellNumber) {
		this.cellNumber = cellNumber;
	}



	public String getEmpType() {
		return empType;
	}



	public void setEmpType(String empType) {
		
		
		
		this.empType = empType;
	}



	public double getAnnualsalary() {
		return annualsalary;
	}



	public void setAnnualsalary(double annualsalary) {
		this.annualsalary = annualsalary;
	}



	public double getWeeklyBonus() {
		return weeklyBonus;
	}



	public void setWeeklyBonus(double weeklyBonus) {
		this.weeklyBonus = weeklyBonus;
	}



	public double getHourlyWage() {
		return hourlyWage;
	}



	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}


public void calculatePay(int hoursWorked) {
	final double OVERTIME_RATE=1.5;
	final int WEEKS_IN_YEAR=52;
	double weeklyPayHourly,weeklyPaySalaried,weeklyBonusManager;
	if(hoursWorked>40) {
		weeklyPayHourly = hoursWorked*hourlyWage *OVERTIME_RATE;
	}else {
		weeklyPayHourly = hoursWorked*hourlyWage;
	}
	
	weeklyPaySalaried=annualsalary/WEEKS_IN_YEAR;
	weeklyBonusManager=weeklyPaySalaried+weeklyBonus;
}



@Override
public String toString() {
	return "Employee [empName=" + empName + ", cellNumber=" + cellNumber + ", empType=" + empType + ", annualsalary="
			+ annualsalary + ", hourlyWage=" + hourlyWage + "]";
}

	

}
