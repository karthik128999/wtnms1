package arrays;

public class OneorFour {
public static void main(String[] args) {
	int[] a=new int[] {1,4,4,1};
	int k=a.length;
	int flag=0;
	for(int i=0;i<k;i++)
	{
		if(a[i]==1||a[i]==4)
			continue;
		flag=1;
	}
	if(flag==0)
		System.out.println("true");
	else
		System.out.println("false");
}
}
