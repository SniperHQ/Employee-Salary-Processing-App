//////////////////////////////////////////////////////////////////////////////////////////////////
//222084308																						//
//MH Ntshangase																				   //
//February 2024																			      //
///////////////////////////////////////////////////////////////////////////////////////////////

package vut;

public class Employee 
{
	private String empName;
	private String cellNumber;
	private String empType;
	private double annualSalary;
	private double weeklyBonus;
	private double hourlyWage;

	public Employee() 
	{
		this("None","None","None",00.00,00.00,00.00);
	}

	public Employee(String empName, String cellNumber, String empType, double annualSalary, double weeklyBonus,
		
			double hourlyWage) 
	{
		this.empName = empName;
		this.cellNumber = cellNumber;
		this.empType = empType;
		this.annualSalary = annualSalary;
		this.weeklyBonus = weeklyBonus;
		this.hourlyWage = hourlyWage;
	}

	public String getEmpName() 
	{
		if(empName.length()<3)
			throw new IllegalArgumentException("Name invalid. name too Short."+"\ninvalid Data: "+empName);
		return empName;
	}

	public final void setEmpName(String empName) 
	{
		if(empName.length()<3)
			throw new IllegalArgumentException("Name invalid. name too Short."+"\ninvalid Data: "+empName);
	
		this.empName = empName;
	}

	public String getCellNumber() 
	{
		if(cellNumber.startsWith("0") && cellNumber.length()==10) 
		{
			return cellNumber;
		}else 
		{
			throw new IllegalArgumentException("Cell Number invalid. A Cellphone number must start with 0 And MUST be 10 Charecters Long"+"\ninvalid Data: "+cellNumber);
			
		}
		
	}

	public void setCellNumber(String cellNumber)
	{
		if(cellNumber.length()==10 && cellNumber.startsWith("0")) 
		{
			this.cellNumber = cellNumber;
		}else 
		{
			throw new IllegalArgumentException("Cell Number invalid. A Cellphone number must start with 0."+"\ninvalid Data: "+cellNumber);
			
		}
		
	}
	
	public String getEmpType() 
	{
		return empType;
	}

	public void setEmpType(String empType)
	{
		
		this.empType = empType;
	}

	public double getAnnualsalary()
	{
		if(annualSalary<0) 
			throw new IllegalArgumentException("Annual Salary invalid."+"\nAnnual Salary is negative."+"\nInvalid Data: "+annualSalary);
		
		return annualSalary;
	}

	public void setAnnualsalary(double annualsalary)
	{
		if(annualSalary<0) 
			throw new IllegalArgumentException("Annual Salary invalid."+"\nAnnual Salary is negative."+"\nInvalid Data: "+annualsalary);
		
		this.annualSalary = annualsalary;
	}

	public double getWeeklyBonus()
	{
		if(weeklyBonus<0) 
			throw new IllegalArgumentException("Weekly Bonus invalid. Weekly Bonus is negative."+"\nInvalid Data: "+weeklyBonus);
		
		return weeklyBonus;
	}

	public void setWeeklyBonus(double weeklyBonus) 
	{
		if(weeklyBonus<0) 
			throw new IllegalArgumentException("Weekly Bonus invalid. Weekly Bonus is negative."+"\nInvalid Data: "+weeklyBonus);
		
		this.weeklyBonus = weeklyBonus;
	}

	public double getHourlyWage() 
	{
		if(hourlyWage<0) 
			throw new IllegalArgumentException("Hourly Wage invalid. Hourly Wage is negative."+"\nInvalid Data: "+hourlyWage);
		
		return hourlyWage;
	}

	public void setHourlyWage(double hourlyWage)
	{
		if(hourlyWage<0) 
			throw new IllegalArgumentException("Hourly Wage invalid. Hourly Wage is negative."+"\nInvalid Data: "+hourlyWage);
		
		this.hourlyWage = hourlyWage;
	}

public double calculatePay(int hoursWorked)
{
	
	switch (empType)
	{
	case "Hourly":
	return getRegularPayForHourlyEmployees(hoursWorked);
	case "Salaried":
	return annualSalary / 52;
	case "Manager":
		return weeklyBonus+(annualSalary / 52) ;
	
	default:
	throw new IllegalArgumentException("Invalid Employee Type");
	}
}

private double getRegularPayForHourlyEmployees(int hoursWorked)
{
	if(hoursWorked<0)
		throw new IllegalArgumentException("Invalid Hours Worked by Employee"+"\nHours cannot be negative!"+"\nInvalid data: "+hoursWorked);
	
	
		if (hoursWorked >=0 && hoursWorked <= 40)
		{
			return hourlyWage * hoursWorked;
		} else 
		{
			double regularPay = hourlyWage * hoursWorked;
			double overtimeHours = hoursWorked - 40;
			double timeAndHalfOvertime = overtimeHours * (hourlyWage * 1.5);
		return regularPay + timeAndHalfOvertime;
		}
		
}

@Override
public String toString() 
{
	return getClass().getName()+ " [empName=" + empName + ", cellNumber=" + cellNumber + ", empType=" + empType + ", annualsalary="
			+ annualSalary + ", hourlyWage=" + hourlyWage + "]";
}

}
