package parcelpointassignment.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import parcelpointassignment.SampleTest;

public class ReturnBookingSummaryPage
{
	private WebDriver driver;
	private static final Logger logger = LogManager.getLogger(SampleTest.class);

	public ReturnBookingSummaryPage(WebDriver driver)
	{
		this.driver = driver;
	}

	public void returnMsg()
	{
		WebElement element = driver.findElement(By.xpath("//p[@class='lead']"));
		String message = element.getText();
		logger.info(message);

	}

}
