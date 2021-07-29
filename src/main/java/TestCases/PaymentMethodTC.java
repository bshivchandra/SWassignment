package TestCases;

import org.testng.annotations.Test;

import PageObject.LoginActivity;
import PageObject.PaymentMethod;
import PageObject.ProductSelection;

public class PaymentMethodTC extends BaseClass {
	
	@Test
	public void paymentMethod() throws Exception
	{
		driver.get("https://pinktest@test.com:Rahul@123@stage.burstoralcare.com/login");
		LoginActivity log=new LoginActivity(driver);
		log.loginMethod("pinktest@test.com","Rahul@123");
		ProductSelection ps=new ProductSelection(driver);
		ps.product();
		
		PaymentMethod pm=new PaymentMethod(driver);
		pm.payment();
	}

	

}
