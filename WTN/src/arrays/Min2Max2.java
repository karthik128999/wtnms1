package arrays;
import java.util.Arrays;
public class Min2Max2 {
public static void main(String[] args) {
	int []a=new int[] {34,75,23,10,11,46,93};
	Arrays.sort(a);
	int k=a.length;
	System.out.println("maximum 1:-"+a[k-1]);
	System.out.println("maximum 2:-"+a[k-2]);
	System.out.println("minimum 1:-"+a[0]);
	System.out.println("minimum 2:-"+a[1]);
}
}
