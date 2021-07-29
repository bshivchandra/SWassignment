package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class PaymentMethod {
	WebDriver driver;
	public PaymentMethod(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public void payment() throws Exception
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		driver.findElement(By.xpath("//button[@class='button_primary_button__2bPwB']")).click();
		Thread.sleep(1500);
		driver.navigate().refresh();
	}

}
