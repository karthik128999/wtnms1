package flowControlStatements;

public class FloydsPattern {
public static void main(String[] args) {
	int k=args.length;
	if(k==0)
	{
		System.out.println("please enter an integer");
	}
	else
	{
		int v=Integer.parseInt(args[0]);
		for(int i=0;i<v;i++)
		{
			int j=0;
			while(j<=i)
			{
				System.out.print("*");
				j++;
			}
			System.out.println();
		}
	}
}
}
