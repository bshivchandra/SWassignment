package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyOrder {
WebDriver driver;
	
	public MyOrder(WebDriver driver)
	{
		this.driver=driver;
	}
	public void myOrder() throws Exception
	{
		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.findElement(By.xpath("(//i[@class='headerSlotHeroDesktop_more_arrow__sYqcy'])[7]")).click();
		driver.findElement(By.linkText("My Account")).click();
	}
	


}
