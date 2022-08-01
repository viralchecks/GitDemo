package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day4 {
	@BeforeSuite
	public void beforesuit()
	{
		System.out.println("before suit");
	}

	@AfterMethod
	public void aftermethod()
	{
		System.out.println("after method");
	}

	@Test
	public void WebloginHomeLoan()
	{
		System.out.println("WebloginHome");
	}
	@Test
	public void CarloginHomeLoan()
	{
		System.out.println("CarloginHome");
	}

	@Test
	public void APIloginHomeLoan()
	{
		System.out.println("APIloginHome");
	}
	@AfterSuite
	public void Aftersuit()
	{
		System.out.println("after suit");
	}


}
