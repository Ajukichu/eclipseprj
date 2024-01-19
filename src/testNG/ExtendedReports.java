package testNG;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendedReports {
	WebDriver driver;
	ExtentHtmlReporter reporter;
	ExtentTest test;
	ExtentReports extent;
	
	@BeforeTest
	public void beftest()
	{
		//reporter=new ExtentHtmlReporter(System.getProperty("user.dir"))+"/reports/myreport.html";
		reporter=new ExtentHtmlReporter("./Reporter/myreport1.html");
		reporter.config().setDocumentTitle("Automation Report");
		reporter.config().setReportName("Functional Test");
		reporter.config().setTheme(Theme.DARK);
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Hostname", "Localhost");
		extent.setSystemInfo("OS", "Windows11");
		extent.setSystemInfo("Tester name", "Edward");
		extent.setSystemInfo("Browser name", "Chrome");
		
		/*ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(options);*/
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void setup()
	{
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void fbtitleverification() throws IOException
	{
		test=extent.createTest("FbTitleVerification");
		String Exp="facebook";
		String actual=driver.getTitle();
		Assert.assertEquals(Exp, actual);
	}
	@Test
	public void fbbuttontest() throws IOException
	{
		test=extent.createTest("FbButtonTest");
		String buttontext=driver.findElement(By.xpath("//*[@name=\\\"login\\\"]")).getText();
		Assert.assertEquals(buttontext, "register");
	}
	@Test
	public void fblogotest() throws IOException
	{
		test=extent.createTest("FbLogoTest");
		boolean b=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img")).isDisplayed();
		Assert.assertTrue(b);
	}
	@AfterTest
	public void teardown()
	{
		extent.flush();
	}
	@AfterMethod
	public void browserclose(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, "test case failed is"+result.getName());
			test.log(Status.FAIL, "test case failed is"+result.getThrowable());
			String screenshotpath=ExtendedReports.screenshotMethod(driver,result.getName());
			test.addScreenCaptureFromPath(screenshotpath);
		}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.SKIP, "test case skipped is"+result.getName());
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, "test case passed is"+result.getName());
		}
	}
	
	public static String screenshotMethod(WebDriver driver, String screenshotname) throws IOException
	{
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destination="./ScreenShot/"+screenshotname+".png";
		FileHandler.copy(src, new File(destination));
		
		return destination;
	}
	
	

}
