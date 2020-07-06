package exceptions;

class AgeverException extends Exception
{
	AgeverException()
	{
		super();
		System.out.println("Age must be >=18 and <60");
	}
}
public class EX5 {
public static void main(String[] args) throws Exception {
	String name=args[0];
	int age=Integer.parseInt(args[1]);
	if(age>=18 && age<60)
	{
		System.out.println("name "+name+"\nAge: "+age);
	}
	else
	{
		throw new AgeverException();
	}
}
}
