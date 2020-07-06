package flowControlStatements;

public class Palindrome {
public static void main(String[] args) {
	int k=Integer.parseInt(args[0]);
	int p=k;
	int r,result=0;
	while(k>0)
	{
		r=k%10;
		result=result*10+r;
		k=k/10;
	}
	if(result==p)
	{
		System.out.println("palindrome");
	}
	else
	{
		System.out.println("not a palindrome");
	}
}
}
