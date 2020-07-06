package flowControlStatements;

public class PrimeOrNot {
public static void main(String[] args) {
	int k=3;
	int f=0;
	for(int i=2;i<k;i++)
	{
		if(k%i==0)
		{
			f=1;
			break;
		}
	}
	if(f==0)
		System.out.println("prime");
	else
		System.out.println("Composite");
}
}
