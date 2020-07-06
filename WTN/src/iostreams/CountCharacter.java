package iostreams;
import java.io.*;
import java.util.*;
public class CountCharacter {
public static void main(String[] args) throws IOException{
	FileReader in=null;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter file name");
	String file="C:\\\\Users\\\\HP\\\\Desktop\\\\"+sc.next();
	in=new FileReader(file);
	BufferedReader br=new BufferedReader(in);
	System.out.println("enter character");
	String p=sc.next();
	int count=0;
	while(br.read()Character.toString().equals(p))
	{
		count++;
	}
}
}
