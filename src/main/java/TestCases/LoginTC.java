package TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.LoginActivity;

public class LoginTC extends BaseClass  {	
	
	@Test 
	public void loginTest() throws Exception
	{
		driver.get("https://pinktest@test.com:Rahul@123@stage.burstoralcare.com/login"); 
		LoginActivity log=new LoginActivity(driver);
		log.loginMethod("pinktest@test.com","Rahul@123");
		//String title=driver.getTitle();
		//System.out.println(title);
		String error=driver.findElement(By.id("login-error")).getText();		
		//Assert.assertTrue(title.contains("BURST Oral Care"));
		
	      if(error.contains("Invalid Email or Password"))
	      {	
	    	  
	    	  System.out.println(error);
	    	  Assert.assertTrue(false);
	      }
	      else
	    	  Assert.assertTrue(true);
	}
			
}


	
