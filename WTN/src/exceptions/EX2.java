package exceptions;

public class EX2 {
	public static void main(String[] args) throws Exception{
		int a[]=new int[args.length];
		for(int i=0;i<args.length;i++)
		{
			a[i]=Integer.parseInt(args[i]);
		}
		int sum=0;
		double avg=0;

			for(int i=0;i<args.length;i++)
			{
				sum=sum+a[i];
			}
			avg=sum/args.length;
			System.out.println("sum:"+sum+"\navg:"+avg);
		
	}
}
