package arrays;

public class Sum67 {
public static void main(String[] args) {
	int[] a=new int[] {1,6,4,7,9};
	int k=a.length;
	int start=0,end=0,sum=0;
	for(int i=0;i<k;i++)
	{
		if(a[i]==6)
			start=i;
		if(a[i]==7)
			end=i;
	}
	if(start<end)
	{
		for(int i=0;i<k;i++)
		{
			if(i>=start&&i<=end)
				continue;
			sum+=a[i];
		}
	}
	else
	{
		for(int i=0;i<k;i++)
		{
			sum+=a[i];
		}
	}
	System.out.println(sum);
}
}
