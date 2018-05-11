package parcelpointassignment;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import parcelpointassignment.common.ParcelPointChromeDriver;
import parcelpointassignment.pages.LocationSelectionPage;
import parcelpointassignment.pages.ReturnBookingSummaryPage;
import parcelpointassignment.pages.ReturnDetailsPage;

public class ReturnParcelTest
{
	int randomNo = (int) (Math.random() * 5000 + 1);
	private static final Logger logger = LogManager.getLogger(SampleTest.class);
	private String parcelPointUrl = "https://staging.parcelpoint.com.au/adidas";
	private WebDriver driver;

	@BeforeClass
	public void setUp() throws InterruptedException
	{
		driver = new ParcelPointChromeDriver();
	}

	@Test
	public void locationPage()
	{
		driver.get(parcelPointUrl);
		LocationSelectionPage ls = new LocationSelectionPage(driver);
		ls.enterLocation("11 O'Reilly Street, Mays Hill NSW 2150, Australia");
		ls.selectFirstLocation();
		ls.clickNextButton();

		ReturnDetailsPage rd = new ReturnDetailsPage(driver);
		rd.enterOrderNo("AAU" + randomNo + "6188");
		rd.enterReason();
		rd.enterUserName("Test" + randomNo);
		rd.enterEmailId("Test" + randomNo + "@gmail.com");
		rd.enterContactNo("047958" + randomNo);
		rd.clickSubmitButton();

		ReturnBookingSummaryPage rb = new ReturnBookingSummaryPage(driver);
		rb.returnMsg();
		logger.info("The return is placed successfully");
	}

	@AfterClass
	public void afterClass()
	{
		System.out.println("Closing driver");
		driver.quit();
	}

}
