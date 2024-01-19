package Testselenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPgm {
	ChromeDriver driver;
	@Before
	public void alert()
	{
		driver=new ChromeDriver();
		driver.get("file:///D:/Selenium/alert.html");
	}
	
	@Test
	public void buttontext()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		//driver.switchTo().alert().accept();
		Alert a=driver.switchTo().alert();
		String actualtext= a.getText();
		if(actualtext.equals("Hello!I am an alert box!!"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		a.accept();
		
		
		
		
		
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("JOSEPH");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("MORGAN");
	}
}

