package parcelpointassignment.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class ParcelPointChromeDriver extends ChromeDriver
{

	//TODO: move to constants or a configuration class
	private static String projectLocation = System.getProperty("user.dir");

	public ParcelPointChromeDriver()
	{
		System.setProperty("webdriver.Chrome.driver", projectLocation + "chromedriver\\chromedriver.exe");

		manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		manage().window().maximize();
	}
}
