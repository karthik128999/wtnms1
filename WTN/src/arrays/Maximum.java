package arrays;

public class Maximum {
public static void main(String[] args) {
	int [][]a=new int[3][3];
	int max=0,k=0;
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			a[i][j]=Integer.parseInt(args[k++]);
			if(max<=a[i][j])
				max=a[i][j];
		}
	}
	System.out.println(max);
}
}
