package flowControlStatements;

public class PrimeRange {
public static void main(String[] args) {
	for(int i=10;i<=99;i++)
	{
		int f=0;
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			{
				f=1;
				break;
			}
		}
		if(f==0)
			System.out.println(i);
	}
}
}
