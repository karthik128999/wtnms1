package flowControlStatements;

public class SumOfDigits {
public static void main(String[] args) {
	int a=12345;
	int sum=0;
	while(a>0)
	{
		int p=a%10;
		sum+=p;
		a=a/10;
	}
	System.out.println(sum);
}
}
