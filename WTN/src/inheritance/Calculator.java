package inheritance;

public class Calculator {
static double powerInt(int num1,int num2)
{
	return Math.pow(num1,num2);
}
static double powerDouble(double num1,int num2)
{
	return Math.pow(num1,num2);
}
public static void main(String[] args) {
	System.out.println(powerDouble(2.0,3));
}
}
