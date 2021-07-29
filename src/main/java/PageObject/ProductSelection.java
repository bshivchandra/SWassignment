package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ProductSelection {
WebDriver driver;
	
	public ProductSelection(WebDriver driver)
	{
		this.driver=driver;
	}
	public void product() throws Exception
	{
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(1000);

		Actions builder=new Actions(driver);
        WebElement a=driver.findElement(By.xpath("(//i[@class='headerSlotHeroDesktop_more_arrow__sYqcy'])[2]"));
        builder.click(a).build().perform();
        WebElement b=driver.findElement(By.xpath("//a[@aria-label='Redirect to waterflosser page']"));
        builder.click(b).build().perform();
        Thread.sleep(3000);
		driver.navigate().refresh();
        Thread.sleep(2000);
        JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
        WebElement c=driver.findElement(By.xpath("(//button[@class='button_primary_button__2bPwB'])[2]"));
        builder.moveToElement(c).click().build().perform();
        WebElement d=driver.findElement(By.xpath("//div[@class='cartSideBarMain_wrapper__3R75s']"));
        builder.moveToElement(d).build().perform();
        
        WebElement e=driver.findElement(By.xpath("//button[@class='sideCartFooter_btn__2jKA3']"));
        builder.moveToElement(e).click().build().perform();
        Thread.sleep(1000);
        driver.navigate().refresh();
        
	}

}
