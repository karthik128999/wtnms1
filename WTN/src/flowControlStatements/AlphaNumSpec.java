package flowControlStatements;

public class AlphaNumSpec {
public static void main(String[] args) {
	String s=args[0];
	char c=s.charAt(0);
	if((c>='a'&&c<='z')||(c>='A'&&c<='Z'))
		System.out.println("alphabet");
	else if(c>='0'&&c<='9')
		System.out.println("number");
	else
		System.out.println("Special Character");
}
}
