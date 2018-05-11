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
		WebElement orderNoField = driver.findElement(By.xpath("//input[@id='order-number-returns']"));
		orderNoField.sendKeys(orderNo);
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
		WebElement giveName = driver.findElement(By.id("delivery-name-createAccount"));
		giveName.sendKeys(userName);
	}

	public void enterEmailId(String emailId)
	{
		WebElement giveMail = driver.findElement(By.id("delivery-email-createAccount"));
		giveMail.sendKeys(emailId);
	}

	public void enterContactNo(String contactNo)
	{
		WebElement giveNo = driver.findElement(By.id("delivery-mobile-createAccount"));
		giveNo.sendKeys(contactNo);
	}

	public void clickSubmitButton()
	{
		WebElement clickSubmit = driver.findElement(By.id("submitReturnsForm"));
		clickSubmit.click();
	}

}
