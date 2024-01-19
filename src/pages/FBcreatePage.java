package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FBcreatePage {
	WebDriver driver;
	By fbcreate=By.xpath("//*[@id=\"reg_pages_msg\"]/a");
	By fbgetstarted=By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/table/tbody/tr/td[1]/div/div[1]/div[2]/button/div/div");
	By fbemail=By.id("email");
	By fbpassword=By.id("pass");
	By fblogin=By.name("login");
	
	public FBcreatePage (WebDriver driver)
	{
		this.driver=driver;
	}
	public void click()
	{
		driver.findElement(fbcreate).click();
		driver.findElement(fbgetstarted).click();
	}
	public void setvalues(String email,String password)
	{
		driver.findElement(fbemail).sendKeys(email);
		driver.findElement(fbpassword).sendKeys(password);
	}
	public void login()
	{
		driver.findElement(fblogin).click();
	}

}
