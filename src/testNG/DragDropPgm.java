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

public class DragDropPgm {
	WebDriver driver;
	@BeforeTest
	public void browseropen()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlopen()
	{
		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
	}
	@Test
	public void test1()
	{
		WebElement Dragme=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement Drophere=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Actions act=new Actions(driver);
		act.dragAndDrop(Dragme, Drophere);
		act.perform();
		
		String actualtext=Drophere.getText();
		if(actualtext.equals("Dropped!"))
		{
			System.out.println("Dropped");
		}
		else
		{
			System.out.println("not dropped");	
		}

	}

}
