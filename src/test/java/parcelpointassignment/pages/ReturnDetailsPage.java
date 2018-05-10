package parcelpointassignment.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ReturnDetailsPage
{
	private WebDriver driver;

	public ReturnDetailsPage(WebDriver driver)
	{
		this.driver = driver;
	}

	public void enterOrderNo(String orderNo)
	{
		WebElement element = driver.findElement(By.xpath("//input[@id='order-number-returns']"));
		element.sendKeys(orderNo);
		System.out.println("Order No :" + orderNo);
	}

	public void enterReason()
	{
		WebElement reasonDropDown = driver.findElement(By.id("retailerReturnsReasonsId"));
		Select reason = new Select(reasonDropDown);
		reason.selectByIndex(1);
	}

	public void enterUserName(String userName)
	{
		WebElement element = driver.findElement(By.id("delivery-name-createAccount"));
		element.sendKeys(userName);
	}

	public void enterEmailId(String emailId)
	{
		WebElement element = driver.findElement(By.id("delivery-email-createAccount"));
		element.sendKeys(emailId);
	}

	public void enterContactNo(String contactNo)
	{
		WebElement element = driver.findElement(By.id("delivery-mobile-createAccount"));
		element.sendKeys(contactNo);
	}

	public void clickSubmitButton()
	{
		WebElement element = driver.findElement(By.id("submitReturnsForm"));
		element.click();
	}

}
