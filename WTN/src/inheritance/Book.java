package inheritance;
public class Book extends Author{
Book(String n, String e, char g) {
		super(n, e, g);
	}
String name;
double price=100.0;
int qtyInStock=250;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getQtyInStock() {
	return qtyInStock;
}
public void setQtyInStock(int qtyInStock) {
	this.qtyInStock = qtyInStock;
}
public static void main(String[] args) {
	Book b=new Book(" ","abc@gmail.com",'M');
	System.out.println(b.getPrice());
	System.out.println(b.getQtyInStock());
	System.out.println(b.email);
	System.out.println(b.gender);
	System.out.println(b.name);
}
}
