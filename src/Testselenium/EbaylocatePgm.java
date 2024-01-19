package Testselenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbaylocatePgm {
	ChromeDriver driver;
	@Before
	public void browseropen()
	{
		driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
	}
    @Test
    public void test()
    {
    	String actualtitle=driver.getTitle();
    	System.out.println(actualtitle);
    	
    	String expectedtitle="ebay.com";
    	if(actualtitle.equals(expectedtitle))
    	{
    		System.out.println("Pass");
    	}
    	else
    	{
    		System.out.println("Fail");
    	}
    	driver.findElement(By.xpath("//button[@id='gh-shop-a']")).click();
    	driver.findElement(By.xpath("//table[@id=\"gh-sbc\"]/tbody/tr/td[1]/ul[1]/li[4]/a")).click();
    	String content=driver.getPageSource();
		if(content.contains("Shop by Category"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		driver.findElement(By.xpath("//div[@id=\"mainContent\"]/section[1]/div[2]/span[1]/a/div[2]")).click();
		driver.findElement(By.xpath("//li[@id=\"gh-minicart-hover\"]/div/a[1]")).click();
		driver.findElement(By.xpath("//div[@id=\"mainContent\"]/div/div[2]/div/div/div/div[3]/a[2]")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("books",Keys.ENTER);
		}	
}

