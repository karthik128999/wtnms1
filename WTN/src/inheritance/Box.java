package inheritance;

public class Box {
int width;
int height;
int depth;
Box(int w,int h,int d)
{
	this.width=w;
	this.height=h;
	this.depth=d;
}
int volume()
{
	return (width*depth*height);
}
public static void main(String[] args) {
	Box b=new Box(2,4,5);
	System.out.println(b.volume());
}
}
