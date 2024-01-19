package Testselenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPgm {
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
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9061930136");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Ajukichu123@");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
	

}
