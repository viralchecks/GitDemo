package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {

	@Parameters({"URL"})
	@Test
	public void CarWeblogin(String urlName)
	{
		System.out.println("Weblogincar");
		System.out.println(urlName);
		}
	@BeforeMethod
	public void beforemethodt()
	{
		System.out.println("before method");
	}

	@Test(dataProvider = "getdata")
	public void mobileCarlogin(String unm , String pwd)
	{
		System.out.println("mobileCarlogin");
		System.out.println(unm+pwd);
	}
	@Test(dataProvider = "getdata")
	public void mCarlogin(String unm , String pwd)
	{
		System.out.println("mobileCarlogin");
		System.out.println(unm);
		System.out.println(pwd);
	}


	@Test(dependsOnMethods=("CarWeblogin"))
	public void CarAPIlogin()
	{
		System.out.println("APIlogincar");
	}

	@DataProvider
	public Object[][] getdata()
	{
		//first box rows means no of rotations
		//second box no of column means values
		// in below example rows r 3 and column are 2
		
		Object[][] data = new Object[3][2];
	
		data[0][0]="1st usrname";
		data[0][1]="1st pwd";
		
		data[1][0]="2st usrname";
		data[1][1]="2st pwd";

		data[2][0]="3st usrname";
		data[2][1]="3st pwd";
		return data;
	}

	
	
}
