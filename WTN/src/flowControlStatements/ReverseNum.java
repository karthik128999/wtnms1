package flowControlStatements;

public class ReverseNum {
public static void main(String[] args) {
	int n=1004;
	int r,result=0;
	while(n>0)
	{
		r=n%10;
		result=result*10+r;
		n=n/10;
	}
	System.out.println(result);
}
}
