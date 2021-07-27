package demoTestng;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Demo {
	@BeforeClass
	public void bc()  {
		System.out.println("Before C");
	}
	
	@Before
	public void bm()   {
		System.out.println("Before M");
	}
	
	@Test
	public void tc1()  {
		System.out.println("Hello....!  1");
	}
	
	@Test
	public void tc2()  {
		System.out.println("Hello....!  2");
	}
	
	@After
	public void am()   {
		System.out.println("After M");
	}
	
	@AfterClass
	public void ac()  {
		System.out.println("After C");
	}

}
