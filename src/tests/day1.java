package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class day1 {

	@BeforeClass
	public void beforclass()
	{
		System.out.println("before class");
	}

	
	@Test(enabled=false)
	public void demo()
	{
		System.out.println("hello");
	}
	
	@Test (groups = {"smoke"})
	public void SeconTest()
	{
		System.out.println("Second test");
	}

	@AfterTest
	public void CarAPIlogin()
	{
		System.out.println("After test");
	}

	@AfterClass
	public void afterclass()
	{
		System.out.println("after class");
	}
}