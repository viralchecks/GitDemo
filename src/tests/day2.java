package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {


	@Test(groups = {"smoke"})
	public void demo()
	{
		System.out.println("good");
	}
	
	@BeforeTest
	public void demo2()
	{
		System.out.println("before test");
	}
	
	}
