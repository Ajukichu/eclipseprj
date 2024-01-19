package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FBcreatePage;

public class FBcreateTest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void testlogin() throws Exception
	{
		FBcreatePage b=new FBcreatePage(driver);
		b.click();
		b.setvalues("abmxy@gmail.com", "agde1234@");
		b.login();
		
	}

}
