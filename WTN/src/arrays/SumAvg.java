package arrays;

public class SumAvg {
public static void main(String[] args) {
	int []a=new int[] {1,2,3,4,5};
	int k=a.length;
	int sum=0;
	for(int i=0;i<k;i++)
	{
		sum=sum+a[i];
	}
	System.out.println("sum	"+sum);
	System.out.println("average	"+sum/k);
}
}
