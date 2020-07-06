package exceptions;

import java.util.Scanner;

public class EX3 {
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<2;i++)
		{
			System.out.println("Student name: ");
			String stud1=sc.next();
			System.out.println("Student marks:");
			int s1=sc.nextInt();
			int s2=sc.nextInt();
			int s3=sc.nextInt();
			try {
			
		
		
		
		
		if(s1<0)
			throw new NegativeValueException("s1 is less than 0");
		if(s1>100)
			throw new ValueOutOfRange_Exception("s1 is > 100");
	
		if(s2<0)
			throw new NegativeValueException("s2 < 0");
		if(s2>100)
			throw new ValueOutOfRange_Exception("s2 >100");
		
		if(s3<0)
			throw new NegativeValueException("s3<0");
		if(s3>100)
			throw new ValueOutOfRange_Exception("s3>100");
			}
			catch(NegativeValueException e)
			{
				System.out.println(e);
			}
			catch(ValueOutOfRange_Exception e)
			{
				System.out.println(e);
			}
			System.out.println("student:"+stud1);
		
			System.out.println("avg:"+(s1+s2+s3)/3);
		}
		}
}
