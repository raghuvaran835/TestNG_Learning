package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Demo3 {
	
	@BeforeClass
	public void beforeClassTest()
	{
		System.out.println("I will execute beforeClass ");
	}
	
	@Test(timeOut = 3000)
	public void webLoginCarLoan()
	{
		System.out.println("web Login Car Loan");
	}
	
	@Test(groups = {"Smoke"})
	public void mobileLoginCarLoan()
	{
		System.out.println("Mobile Login Car Loan");
	}
	
	@Test
	public void mobileSigninCarLoan()
	{
		System.out.println("web Login Car Loan");
	}
	@Test
	public void mobilesignoutCarLoan()
	{
		System.out.println("Mobile Login Car Loan");
	}
	
	@Test  //(dependsOnGroups = {"Smoke"})
	public void APILoginCarLoan()
	{
		System.out.println("API Login Car Loan");
	}
	@AfterClass
	public void afterClassTest()
	{
		System.out.println("I will execute afterClass ");
	}

}
