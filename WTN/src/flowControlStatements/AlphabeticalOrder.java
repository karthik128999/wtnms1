package flowControlStatements;

public class AlphabeticalOrder {
public static void main(String args[]) {
	String a=args[0];
	String b=args[1];
	if(a.charAt(0)>b.charAt(0))
	{
		System.out.println(b.charAt(0)+" "+a.charAt(0));
	}
	else
	{
		System.out.println(a.charAt(0)+" "+b.charAt(0));
	}
	}
}
