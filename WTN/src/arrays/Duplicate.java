package arrays;
public class Duplicate {
public static void main(String[] args) {
	int[] a=new int[] {12,34,12,45,67,45,89};
	int k=a.length;
	for(int i=0;i<k-1;i++)
	{
		for(int j=i+1;j<k;j++)
			if(a[i]==a[j])
				a[j]=0;
	}
	for(int i=0;i<k;i++)
	{
		if(a[i]==0)
			continue;
		System.out.print(a[i]+"	");
	}
}
}
