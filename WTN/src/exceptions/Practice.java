package exceptions;

public class Practice {
public static void main(String[] args) {
	int [] a=new int[]{1,2,3,4,5};
	try
	{
	System.out.println(a[4]);	
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}
