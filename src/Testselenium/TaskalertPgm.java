package Testselenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskalertPgm {
	ChromeDriver driver;
	@Before
	public void alert()
	{
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//*[@id=\"alertButton\"]")).click();
		Alert c=driver.switchTo().alert();
		String actualtext=c.getText();
		if(actualtext.equals("You clicked a button"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");	
		}
		c.accept();
		
		
	}

	@Test
	public void test1()
	{
		driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
		Alert d=driver.switchTo().alert();
		String actualtext=d.getText();
		if(actualtext.equals("Do you confirm action?"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		d.accept();
	}
}
