package arrays;

public class MinMax {
public static void main(String[] args) {
	int []a=new int[] {3,7,2,9,1,8,21,34,53};
	int k=a.length;
	int max=a[0];
	int min=a[0];
	for(int i=0;i<k;i++)
	{
		if(a[i]<min)
			min=a[i];
		if(a[i]>max)
			max=a[i];
	}
	System.out.println("minimum	"+min);
	System.out.println("maximum	"+max);
}
}
