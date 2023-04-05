package Test;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {

	@Test(groups= {"Smoke"})
	public void test_01()
	{
		System.out.println("Test1");
		Assert.assertTrue(false);
	}
	
	@Test(enabled =true )
	public void test_02(){
		System.out.println("Test2");
	}
	
	

}
