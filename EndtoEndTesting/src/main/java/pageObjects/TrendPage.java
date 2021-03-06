package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TrendPage {
	
   public WebDriver driver;
	
    By shopsunglasses=By.xpath("//p[contains(text(),'ASOS DESIGN metal angled sunglasses in silver with blue lenses')]");
    By shopsnapback=By.xpath("//p[contains(text(),'ASOS DESIGN faux leather snapback with badge detail')]");
    
	public TrendPage(WebDriver driver) {
		this.driver=driver;
	}


	public WebElement getSunGlassesPage()
	{
		return driver.findElement(shopsunglasses);
		
	}
	
	public WebElement getSnapBackPage()
	{
		return driver.findElement(shopsnapback);
	}
	
	}



