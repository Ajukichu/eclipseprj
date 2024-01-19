package Testselenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitpgm1 {
	ChromeDriver driver;
	@Before
	public void browseropen()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	@Test
	public void test()
	{
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		
		String expectedtitle="Google";
		if(actualtitle.equals(expectedtitle))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	@After
	public void browserclose()
	{
		driver.close();
	}


}
