package Testselenium;

import org.openqa.selenium.chrome.ChromeDriver;

class Contentverfication {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String content=driver.getPageSource();
		if(content.contains("Images"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}

	}

}
