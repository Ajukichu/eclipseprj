package Testselenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class idelocatorpgm {
	ChromeDriver driver;
	@Before
	public void browseropen()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void test()
	{
		driver.findElement(By.id("email")).sendKeys("9061930136");
		driver.findElement(By.id("pass")).sendKeys("Ajukichu1");
		driver.findElement(By.name("login")).click();;
	}
	@After
	public void browserclose()
	{
		driver.close();
	}

}
