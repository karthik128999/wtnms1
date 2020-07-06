package arrays;

import java.util.Arrays;

public class Sorting {
	public static void main(String[] args) {
		int []a=new int[] {34,75,23,10,11,46,93};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"	");
		}
	}
}
