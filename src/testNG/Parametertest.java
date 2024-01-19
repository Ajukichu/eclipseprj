package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametertest {
	@Parameters("x")
	@Test
	public void main(String v)
	{
		System.out.println("value is:"+v);
	}

}
