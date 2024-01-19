package Testselenium;
//title verification
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromesel {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		
		String expectedtitle="google";
		if(actualtitle.equals(expectedtitle))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		driver.close();

	}

}
