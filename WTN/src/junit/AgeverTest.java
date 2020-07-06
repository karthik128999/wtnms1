package junit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
//@RunWith(Parameterized.class)
	public class AgeverTest {
	private int input;
	private String output;
	public AgeverTest(int input,String output)
	{
		this.input=input;
		this.output=output;
	}
	@Parameters
	public static Collection init()
	{
		return Arrays.asList(new Object[][] {
			{15,"true"},{22,"false"},{9,"true"}
		});
	}
		@Test
		public void test() {
			Agever age=new Agever();
			assertEquals(output,age.Agev(input));
		}

	}
