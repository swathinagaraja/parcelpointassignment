package parcelpointassignment.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocationSelectionPage
{
	private WebDriver driver;

	public LocationSelectionPage(WebDriver driver)
	{
		this.driver = driver;
	}

	public void enterLocation(String location)
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("ppIframeWidget-parcelpoint-stores-widget"));
		WebElement element = driver.findElement(By.id("ppSearchInput"));
		element.sendKeys(location);
		element.sendKeys(Keys.ENTER);
	}

	public void selectFirstLocation()
	{
		WebElement element = driver.findElement(By.className("select"));//By defalut this selects the first option
		element.click();
	}

	public void clickNextButton()
	{
		driver.switchTo().defaultContent();
		WebElement element = driver.findElement(By.xpath("//button[@id='parcelPointSubmitButton']"));
		element.click();
	}
}
