package Testselenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RediffselectPgm {
	ChromeDriver driver;
	@Before
	public void browseropen()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@Test
	public void test()
	
	{
		
		WebElement logo = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img"));
		boolean b=logo.isDisplayed();
		if(b)
		{
			System.out.println("logo is displayed");
		}
		else
		{
			System.out.println("log is not displayed");
		}
		
		WebElement checkbox= driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input"));
		boolean b1=checkbox.isSelected();
		if(b1)
		{
			System.out.println("checkbox is selected");
		}
		else
		{
			System.out.println("checkbox is not selected");
		}
		
		WebElement radiobutton= driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]"));
		boolean b2=radiobutton.isSelected();
		if(b2)
		{
			System.out.println("radiobutton is selected");
		}
		else
		{
			System.out.println("radiobutton is not selected");
		}
	
		
		
		
	
	}

}
