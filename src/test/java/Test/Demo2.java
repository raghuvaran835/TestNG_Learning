package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo2 {
	
	@BeforeMethod
	public void beforeMethod_tc()
	{
		System.out.println("Executing before every methods in this class");
	}
	
	@AfterMethod
	public void afterMethod_tc()
	{
		System.out.println("Executing after every methods in this class");
	}
	
	@Test(groups= {"Smoke"})
	public void webLoginHomeLoan()
	{
		System.out.println("Web Login home Loan");
	}
	@Test(dataProvider = "getData")
	public void mobileLoginHomeLoan(String uname,String password)
	{
		System.out.println("Mobile Login home Loan");
		System.out.println("Username is:"+uname+"\nPassword is:"+password);
	}
	
	@Test(dependsOnMethods = {"webLoginHomeLoan"})
	public void APILoginHomeLoan()
	{
		System.out.println("API Login home Loan");
	}
	
	@AfterTest
	public void postTest()
	{
		System.out.println("I will execute after Test");
	}
	@BeforeTest
	public void preTest()
	{
		System.out.println("I will execute before Test");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[3][2];
		
//		1st set data
		data[0][0]="firstUsername";
		data[0][1]="firstPassword";
		
//		2nd set data
		data[1][0]="Second Username";
		data[1][1]="Second Password";
		
//		3rd set data
		data[2][0]="Third Username";
		data[2][1]="Third Password";
		
		return data;
	}

}
