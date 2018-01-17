package mavenPro;

import static org.junit.Assert.*;

import org.junit.Test;

public class Testing {

	public void show()
	{
	//System.out.println("Git done");
	}
	@Test
	public void pass()
	{
		int a,b;
		a=1;b=2;
		assertTrue(1+2 == 3);
		
	}
	
	@Test
	public void fail()
	{
		int a,b;
		a=3;b=1;
		assertTrue(a + b == 4);
		
	}

	
}
