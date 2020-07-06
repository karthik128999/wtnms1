package exceptions;

public class NegativeValueException extends Throwable
{
	 NegativeValueException(String s) 
	{
		 super();
		 System.out.println("Negative Values Exception");
	}
}