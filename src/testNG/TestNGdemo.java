package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGdemo {
	@BeforeTest
	public void browseropen()
	{
		System.out.println("Browseropen");
	}
	@BeforeMethod
	public void urlopen()
	{
		System.out.println("URLopen");
	}
	@Test(priority=3,enabled=false)
	public void test1()
	{
		System.out.println("Test1");
	}
	@Test(priority=1,dependsOnMethods={"test3"})
	public void test2()
	{
		System.out.println("Test2");
	}
	@Test(priority=2,invocationCount=2)
	public void test3()
	{
		System.out.println("Test3");
	}
	@AfterMethod
	public void report()
	{
		System.out.println("Report");
	}
	@AfterTest
	public void browserclose()
	{
		System.out.println("Browserclose");
	}
	

}
