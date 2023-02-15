package Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {

	
@Test	
public void setupTest()	{
System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Saiful Chowdhury\\\\OneDrive\\\\Desktop\\\\Automation\\\\chromedriver.exe");	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com");
	
WebElement username=driver.findElement(By.id("user-name"));
WebElement password=driver.findElement(By.id("password"));
	
	Assert.assertTrue(username.isDisplayed());
	username.sendKeys("standard_user");
	
	Assert.assertTrue(password.isDisplayed());
	password.sendKeys("secret_sauce");
	
	WebElement element=driver.findElement(By.id("login-button"));
	element.click();
	

	Assert.assertEquals("Swag Labs", driver.getTitle());
	System.out.println(driver.getTitle());
	driver.close();
}
	
	
	
	
}
