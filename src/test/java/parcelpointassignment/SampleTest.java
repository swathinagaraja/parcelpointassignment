package parcelpointassignment;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest
{

	private static final Logger logger = LogManager.getLogger(SampleTest.class);

	@Test
	public void testSample()
	{
		logger.info("Sample Test");
		Assert.assertEquals("Sample Test".length(), 11);
	}

	//	@Test
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
