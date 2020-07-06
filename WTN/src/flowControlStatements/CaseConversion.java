package flowControlStatements;

public class CaseConversion {
public static void main(String[] args) {
	String s=args[0];
	char c=s.charAt(0);
	if(Character.isLowerCase(c))
	{
		System.out.println(Character.toUpperCase(c));
	}
	else
		System.out.println(Character.toLowerCase(c));
}
}
