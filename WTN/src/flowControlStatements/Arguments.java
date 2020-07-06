package flowControlStatements;
public class Arguments {
public static void main(String[] args) {
	int k=args.length;
	if(k==0)
		System.out.println("no values");
	else
	{
		for(int i=0;i<k-1;i++)
		{
			System.out.print(args[i]+",");
		}
		System.out.print(args[k-1]);
	}
}
}
