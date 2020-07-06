package abstractclasses;
import java.util.Random;
public class TestCompartment {
	public static void main(String[] args) 
	{
		Compartment c[]=new Compartment[10];
		Random r = new Random();
		for(int i=0;i<10;i++)
		{
		int ran=r.nextInt(4)+1;
		if (ran==1)
    	c[i]= new FirstClass();
    	else if (ran==2)
    		c[i]= new Ladies();
    	else if (ran==3)
    		c[i]= new General();
    	else if (ran==4)
    		c[i]=new Luggage();
    	
    	c[i].notice();
		}
		
		
	}
}
