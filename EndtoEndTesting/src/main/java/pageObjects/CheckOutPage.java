package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOutPage {
public WebDriver driver;
	
    By country=By.cssSelector("option[value='EE']");
    By email=By.cssSelector("input[id='emailAddress'][type='email']");
    By addemail=By.cssSelector("button[class='btn primary submit'][type='submit']");
    By firstname=By.cssSelector("input[id='firstName'][type='text']");
    By lastname=By.cssSelector("input[id='lastName'][type='text']");
    By mobile=By.cssSelector("input[id='contactNumber'][type='tel']");
    By address=By.cssSelector("input[id='address1'][type='text']");
    By city=By.cssSelector("input[id='locality'][type='text']");
    By county=By.cssSelector("input[id='countyStateProvinceOrArea'][type='text']");
    By postcode=By.cssSelector("input[id='postalCode'][type='text']");
    By adddetails=By.cssSelector("button[class='btn primary save-address'][type='submit']");
    By deliveryoption=By.xpath("//span[contains(text(),'Standard Delivery')]");
    
	public CheckOutPage(WebDriver driver) {
		this.driver=driver;
	}


	public WebElement selectCountry()
	{
		return driver.findElement(country);
	}
	
	public WebElement enterEmail()
	{
		return driver.findElement(email);
	}
	
	public WebElement addEmail()
	{
		return driver.findElement(addemail);
	}
	
	public WebElement enterFirstName()
	{
		return driver.findElement(firstname);
	}
	
	public WebElement enterLastName()
	{
		return driver.findElement(lastname);
	}
	
	public WebElement enterMobile()
	{
		return driver.findElement(mobile);
	}
	
	public WebElement enterAddress()
	{
		return driver.findElement(address);
	}
	
	public WebElement enterCity()
	{
		return driver.findElement(city);
	}
	
	public WebElement enterCounty()
	{
		return driver.findElement(county);
	}
	
	public WebElement enterPostCode()
	{
		return driver.findElement(postcode);
	}
	
	public WebElement addDetails()
	{
		return driver.findElement(adddetails);
	}
	
	public WebElement selectDeliveryOption()
	{
		return driver.findElement(deliveryoption);
	}
		
    }
