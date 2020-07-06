package polymorphism;
class Fruit {
String name,taste;
int size;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getTaste() {
	return taste;
}
public void setTaste(String taste) {
	this.taste = taste;
}
public int getSize() {
	return size;
}
public void setSize(int size) {
	this.size = size;
}
void eat()
{
	System.out.println("Name: "+getName()+"Taste: "+getTaste());
}
}
class Apple extends Fruit
{
	void eat()
	{
		System.out.println("Name: Apple  Taste: sweet");
		System.out.println("eat() method from apple class.");
		
	}
}
class Orange extends Fruit
{
	void eat()
	{
		System.out.println("Name: Orange  Taste: bitter");
		System.out.println("eat() from orange class");
		
	}
}
public class Fruits
{
	public static void main(String[] args)
	{
		Fruit f=new Fruit();
		f.setName("banana");
		f.setSize(10);
		f.setTaste("sweet");
		f.eat();
		Apple a=new Apple();
		a.eat();
		Orange o =new Orange();
		o.eat();
		
		
	}
}