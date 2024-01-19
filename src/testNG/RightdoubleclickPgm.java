package testNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RightdoubleclickPgm {
	WebDriver driver;
	@BeforeTest
	public void browseropen()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlopen()
	{
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
	}
	@Test
	public void test1()
	{
		Actions act=new Actions(driver);
		
		WebElement Rightclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		act.contextClick(Rightclick).perform();
		
		
		driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]")).click();
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		
		
		WebElement Doubleclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		act.doubleClick(Doubleclick).perform();
		Alert b=driver.switchTo().alert();
		System.out.println(b.getText());
		b.accept();
		
	}

}
