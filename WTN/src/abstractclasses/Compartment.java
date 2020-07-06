package abstractclasses;

abstract public class Compartment {
	abstract void notice();
	}
	class FirstClass extends Compartment
	{
		void notice()
		{
			System.out.println("notice() from first class");
		}
		
	}
	class Ladies extends Compartment
	{
		void notice()
		{
			System.out.println("notice() from Ladies");
		}
	}
	class General extends Compartment
	{
		void notice()
		{
			System.out.println("notice() from General");
		}
		
	}
	class Luggage extends Compartment
	{
		void notice()
		{
			System.out.println("notice() from luggage");
		}
}
