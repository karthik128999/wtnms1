package iostreams;
import java.io.*;
public class FileCopy {
public static void main(String[] args) throws IOException {
	FileReader in=null;
	FileWriter out=null;
	in=new FileReader("C:\\Users\\HP\\Desktop\\input.txt");
	out=new FileWriter("C:\\Users\\HP\\Desktop\\output.txt");
	BufferedReader br=new BufferedReader(in);
	BufferedWriter bw=new BufferedWriter(out);
	int k;
	while((k=br.read())!=-1)
	{
		bw.write(k);
	}
	br.close();
	bw.close();
	System.out.println("copied");
}
}

