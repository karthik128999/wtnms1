package exceptions;
class InvalidCountryException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	InvalidCountryException()
	{
		System.out.println("invalid");
	}
	InvalidCountryException(String s)
	{
		System.out.println(s);
	}
}
public class Userregistration {
void registerUser(String uname,String ucountry) throws InvalidCountryException
{
	if(!ucountry.equals("India"))
	{
		throw new InvalidCountryException("user outside india");
	}
	else
	{
		System.out.println("successfull");
	}
}
public static void main(String[] args) {
	Userregistration usr=new Userregistration();
	try
	{
		usr.registerUser("sai","america");
	}
	catch(InvalidCountryException e)
	{
		System.out.println(e);
	}
}
}
