package Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Demo1 {

	@Parameters({"URL"})
	@Test
	public void test_03(String url){
		System.out.println("Test3");
		System.out.println(url);
	}
	
	@BeforeSuite
	public void beforesuit_tc()
	{
		System.out.println("I will execute before suit");
	}
	
	@AfterSuite
	public void afterSuit_tc()
	{
		System.out.println("I will execute after suit");
	}
	
	
}
