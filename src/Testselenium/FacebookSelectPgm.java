package Testselenium;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSelectPgm {
	ChromeDriver driver;
	@Before
	public void browseropen()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
	}
	@Test
	public void test()
	
	{
		WebElement dayelement=driver.findElement(By.xpath("//*[@id=\"day\"]"));
		Select day=new Select(dayelement);
		day.selectByValue("20");
		List<WebElement> li = day.getOptions();
		System.out.println(li.size());
		
		WebElement monthelement=driver.findElement(By.xpath("//*[@id=\"month\"]"));
		Select month=new Select(monthelement);
		month.selectByIndex(2);
		List<WebElement> li1 = month.getOptions();
		System.out.println(li1.size());
		
		WebElement yearelement=driver.findElement(By.xpath("//*[@id=\"year\"]"));
		Select year=new Select(yearelement);
		year.selectByVisibleText("2001");
		List<WebElement> li2 = year.getOptions();
		System.out.println(li2.size());
	}	

}
