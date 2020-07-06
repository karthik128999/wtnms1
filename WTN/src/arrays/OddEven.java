package arrays;

public class OddEven {
	public static void main(String[] args) {
		int a[]=new int[] {3,3,2};
		int k=a.length;
		int temp,j=0;
		for(int i=0;i<k;i++)
		{
			if(a[i]%2==0)
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				j++;
			}
		}
		for(int i=0;i<k;i++)
			System.out.print(a[i]);
	}
}
