package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginActivity {
	WebDriver driver;
	
	public LoginActivity(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);

	}
	
	@FindBy(partialLinkText="Login")
	WebElement login;
	
	@FindBy(id="email")      
	WebElement username;
	
	@FindBy(id="password")      
	WebElement password;
	
	@FindBy(id="login-submit")
	WebElement loginbutton;
	
	public void loginMethod(String username2,String password2) throws Exception
	{
		//driver.switchTo().alert().dismiss();   
		//login.click();
		//WebElement uid=driver.findElement(By.xpath("//label[@for='email']"));
		//WebElement pid=driver.findElement(By.xpath("//label[@for='password']"));
		//WebElement button=driver.findElement(By.xpath("//button[@id='login-submit']"));
	   // builder.moveToElement(uid).build().perform();
		 
		  Actions builder=new Actions(driver);
		  builder.sendKeys(username,username2).build().perform(); 
		  builder.sendKeys(password,password2).build().perform(); 
		  builder.click(loginbutton).build().perform();

		//username.sendKeys(username2);
		//password.sendKeys(password2);
		//loginbutton.click();				
	}	    	
}
