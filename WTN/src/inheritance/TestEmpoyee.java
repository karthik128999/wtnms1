package inheritance;

public class TestEmpoyee {
	public static void main(String[] args) {
		Person p=new Person("karthik");
		p.setName("sai");
		p.getName();
		Employee e=new Employee(150000,2020,"poi123");
		System.out.println(e.getName());
		System.out.println(e.getAnnualsalary());
		System.out.println(e.getYear());
		e.getInsu_num();
		
	}
}
