package inheritance;

class Animal {
void eat()
{
	System.out.println("Animal eats");
}
void sleep()
{
	System.out.println("Animal sleeps");
}
}
class Bird extends Animal
{
	void eat()
	{
		System.out.println("Birds eat");
	}
	void sleep()
	{
		System.out.println("Birds sleep");
	}
	void fly()
	{
		System.out.println("Birds fly");
	}
}
public class AnimalBird
{
	public static void main(String[] args) {
		Animal a=new Animal();
		a.eat();
		a.sleep();
		Bird b=new Bird();
		b.eat();
		b.sleep();
		b.fly();
	}
}