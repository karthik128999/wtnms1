package inheritance;

public class Employee extends Person
{
	
	double annualsalary;
	int year;
	String insu_num;
	Employee(double annualsalary,int year,String insu_num)
	{
		super("fhjhf");
		this.annualsalary=annualsalary;
		this.year=year;
		this.insu_num=insu_num;
		
	}
	public double getAnnualsalary() {
		return annualsalary;
	}
	public void setAnnualsalary(double annualsalary) {
		this.annualsalary = annualsalary;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getInsu_num() {
		return insu_num;
	}
	public void setInsu_num(String insu_num) {
		this.insu_num = insu_num;
	}

}