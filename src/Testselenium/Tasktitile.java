package Testselenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

//AMAZON
/*import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tasktitile {
	ChromeDriver driver;
	@Before
	public void browseropen()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
    @Test
    public void test()
    {
    	String actualtitle=driver.getTitle();
    	System.out.println(actualtitle);
    	
    	String expectedtitle="Amazon.in";
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

}*/

//FACEBOOK
public class Tasktitile {
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
    	String actualtitle=driver.getTitle();
    	System.out.println(actualtitle);
    	
    	String expectedtitle="Facebook – log in or sign up";
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
