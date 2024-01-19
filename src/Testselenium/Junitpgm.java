package Testselenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Junitpgm {
	@Before
	public void browseropen()
	{
		System.out.println("Browser Open");
	}
	@Test
	public void test()
	{
		System.out.println("Test");
	}
	@After
	public void browserclose()
	{
		System.out.println("Browser Close");
	}
}
