package arrays;

public class Tens {
public static void main(String[] args) {
	int a[]=new int[] {10,2,10};
	int k=a.length;
	int temp,j=0;
	for(int i=0;i<k;i++)
	{
		if(a[i]==10)
			a[i]=0;
		if(a[i]!=0)
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
