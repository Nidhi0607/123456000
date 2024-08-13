package com.qsp.genericutility;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebDriverUtility 
{
	Actions act;
	public WebDriverUtility(WebDriver driver)
	{
		act=new Actions(driver);
	}
	public void doubleclick(WebElement element)
	{
		act.doubleClick(element).perform();
	}
	public void moueHouver(WebElement element)
	{
		act.moveToElement(element).perform();
	}
	public void scrollToElement(WebElement element)
	{
		act.scrollToElement(element).perform();
	}
	//.................................................//
	public void switchToWindow(WebDriver driver, String expectedurl)
	{
		Set<String> allWindowIds = driver.getWindowHandles();
		System.out.println(allWindowIds);
		
		// to retrieve using foreach loop
		for(String id : allWindowIds )
		{
			String acturl = driver.switchTo().window(id).getCurrentUrl();
			System.out.println(acturl);
	
			if(acturl.equals("expectedurl"))
			{
				break;
			}

		}	
	}
	public void switchToFrame(WebDriver driver, int index)
	{
		driver.switchTo().frame(index);
	}
}

	
