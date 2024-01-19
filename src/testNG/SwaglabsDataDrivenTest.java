package testNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SwaglabsDataDrivenTest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.saucedemo.com/");
	}
	@Test
	public void test1() throws IOException
	{
		File a=new File("D:\\Swaglabs.xlsx");
		FileInputStream b=new FileInputStream(a);
		XSSFWorkbook c=new XSSFWorkbook(b);
		XSSFSheet d=c.getSheet("Sheet1");
		System.out.println(d.getLastRowNum());
		
		for(int i=1;i<=d.getLastRowNum();i++)
		{
			String Username=d.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Username="+Username);
			String Password=d.getRow(i).getCell(1).getStringCellValue();
			System.out.println("Password="+Password);
			
			driver.findElement(By.xpath("//*[@id=\"user-name\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(Username);
			driver.findElement(By.xpath("//*[@id=\"password\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(Password);
			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
			
			
			String Actualurl=driver.getCurrentUrl();
			System.out.println(Actualurl);
			String expectedurl="https://www.saucedemo.com/inventory.html";
			if(expectedurl.equals(Actualurl))
			{
				System.out.println("Login Successfull");
			}
			else
			{
				System.out.println("Login Failed");
			}
		}
	}
}
