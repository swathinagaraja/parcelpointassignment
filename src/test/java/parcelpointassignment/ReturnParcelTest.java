package parcelpointassignment;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import parcelpointassignment.common.ParcelPointChromeDriver;
import parcelpointassignment.pages.LocationSelectionPage;
import parcelpointassignment.pages.ReturnDetailsPage;

public class ReturnParcelTest
{

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
		rd.enterOrderNo("AAU12345647");
		rd.enterReason();
		rd.enterUserName("Test7");
		rd.enterEmailId("test457@gmail.com");
		rd.enterContactNo("0456258957");
		rd.clickSubmitButton();
	}

	@AfterClass
	public void afterClass()
	{
		System.out.println("Closing driver");
		driver.quit();
	}

}
