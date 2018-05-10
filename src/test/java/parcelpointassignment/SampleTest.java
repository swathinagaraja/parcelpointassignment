package parcelpointassignment;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest
{

	@Test
	public void testSample()
	{
		System.out.println("Sample Test");
		Assert.assertEquals("Sample Test".length(), 11);
	}

	@Test
	public void testSampleSelinium()
	{
		ChromeDriver driver = new ChromeDriver();
		String baseUrl = "http://google.com";

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get(baseUrl);

		System.out.println("Loaded " + driver.getTitle() + " in Chrome");
		Assert.assertEquals("Google", driver.getTitle());
		driver.quit();
	}
}
