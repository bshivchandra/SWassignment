package TestCases;

import org.testng.annotations.Test;

import PageObject.LoginActivity;
import PageObject.ProductSelection;

public class ProductSelectionTC extends BaseClass {
	
	@Test 
	public void productMethod() throws Exception
	{
		driver.get("https://pinktest@test.com:Rahul@123@stage.burstoralcare.com/login"); 
		LoginActivity log=new LoginActivity(driver);
		log.loginMethod("pinktest@test.com","Rahul@123");
		ProductSelection ps=new ProductSelection(driver);
		ps.product();
		//String error=driver.findElement(By.id("login-error")).getText();		
	}

}
