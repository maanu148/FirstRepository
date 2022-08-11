package task;

import org.testng.annotations.Test;

import genaric.base_Test;

public class TC_01_Test extends base_Test
{
	@Test
	public void test()
	{
	driver.get("https://www.airtel.com");
	}
}
