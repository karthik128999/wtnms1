package arrays;

public class AsciiToChar {
public static void main(String[] args) {
	int []a=new int[] {67,71,102,108,93};
	for(int i=0;i<a.length;i++)
	{
		System.out.println(Character.toString((char)a[i]));
	}
}
}
