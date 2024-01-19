package Testselenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLocate {
	ChromeDriver driver;
	@Before
	public void browseropen()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("mobiles",Keys.ENTER);
		
		driver.findElement(By.xpath("//div[@id=\"nav-cart-text-container\"]/span[2]")).click()	;
		driver.findElement(By.xpath("//a[@id=\"nav-link-accountList\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"ap_email\"]")).sendKeys("abcd1234@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"continue\"]")).click();
		driver.navigate().back();
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id=\"nav-xshop\"]/a[2]")).click();
		driver.findElement(By.xpath("//a[@id=\"nav-hamburger-menu\"]")).click();
	}
}		


