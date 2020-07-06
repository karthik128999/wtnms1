package arrays;

public class Searching {
public static void main(String[] args) {
	int []a=new int[] {3,2,76,4,9,10};
	int k=a.length;
	int key=9;
	int flag=0,index=0;
	for(int i=0;i<k;i++)
	{
		if(a[i]==key)
		{
			flag=1;
			index=i;
			break;
		}
			
	}
	if(flag==0)
		System.out.println("-1");
	else
		System.out.println(index);
}
}
