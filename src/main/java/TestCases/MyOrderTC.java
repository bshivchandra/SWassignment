package TestCases;

import org.testng.annotations.Test;

import PageObject.LoginActivity;
import PageObject.MyOrder;

public class MyOrderTC extends BaseClass {
	@Test 
	public void productMethod() throws Exception
	{
		driver.get("https://pinktest@test.com:Rahul@123@stage.burstoralcare.com/login"); 
		LoginActivity log=new LoginActivity(driver);
		log.loginMethod("pinktest@test.com","Rahul@123");
		MyOrder my=new MyOrder(driver);
		my.myOrder();
	}

}
