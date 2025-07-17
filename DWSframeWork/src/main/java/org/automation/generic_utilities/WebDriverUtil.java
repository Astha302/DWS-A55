package org.automation.generic_utilities;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Set;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

/**
 * WebDriverUtil class provides some static and non static methods
 * which are helping An Automation Engineer to perform some task easily
 * 
 * @author Harsha G R
 * 
 */
public class WebDriverUtil {
	
	/**
	 * This is a method which is used to capture Screenshot of a WebPage
	 * It accepts driver reference in WebDriver Type
	 * 
	 * @param driver [WebDriver]
	 * 
	 * @return void
	 */
	public static void captureScreenshot(WebDriver driver)
	{
		LocalDateTime ldt = LocalDateTime.now();
		String timeStamp = ldt.toString().replace(":", "-");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src= ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./errorShots/screenshot"+timeStamp+".png");
		try {
			FileHandler.copy(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * This a method which is used to switch to a tab or a window based on Title
	 * This method accepts driver reference in WebDriver Type, title in String type
	 * 
	 * @param driver [WebDriver]
	 * @param title [String]
	 * 
	 * @return void
	 */
	public void switchToATabOrWindowUsingTitle(WebDriver driver, String title)
	{
		Set<String> allWindowIds = driver.getWindowHandles();
		for(String windowId : allWindowIds)
		{
			driver.switchTo().window(windowId);
			if(driver.getTitle().equals(title))
			{
				break;
			}
		}
	}
	
	/**
	 * This a method which is used to switch to a tab or a window based on URL
	 * This method accepts driver reference in WebDriver Type, url in String type
	 * 
	 * @param driver [WebDriver]
	 * @param url [String]
	 * 
	 * @return void
	 */
	public void switchToATabOrWindowUsingURL(WebDriver driver, String url)
	{
		Set<String> allWindowIds = driver.getWindowHandles();
		for(String windowId : allWindowIds)
		{
			driver.switchTo().window(windowId);
			if(driver.getCurrentUrl().equals(url))
			{
				break;
			}
		}
	}
	
	/**
	 * This method is used to switch to an Alert and accept it 
	 * This method accepts driver reference in WebDriver Type
	 * 
	 * @param driver [WebDriver]
	 * 
	 * @return void
	 */
	
	public void acceptAlert(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	/**
	 * This method is used to switch to an Alert and dismiss it 
	 * This method accepts driver reference in WebDriver Type
	 * 
	 * @param driver [WebDriver]
	 * 
	 * @return void
	 */
	
	public void dismissAlert(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	
	/**
	 * This method is used to switch to an Alert and pass data to the textbox present
	 *  in Prompt Alert
	 * method accepts driver reference in WebDriver Type, dataToBePassed in String Type
	 * 
	 * @param driver [WebDriver]
	 * @param dataToBePassed [String]
	 * 
	 * @return void
	 */
	
	public void passDatatoAnAlert(WebDriver driver, String dataToBePassed)
	{
		driver.switchTo().alert().sendKeys(dataToBePassed);;
	}
	
	/**
	 * This method is used to switch to an Alert and Return the text present in Alert
	 * method accepts driver reference in WebDriver Type
	 * 
	 * @param driver[WebDriver]
	 * 
	 * @return text[String]
	 */
	public String getDataFromAlert(WebDriver driver)
	{
		String data = driver.switchTo().alert().getText();;
		return data;
	}
	
	/**
	 * This method is used to switch to Frame Using index
	 * method accepts driver reference in WebDriver Type, index in int type
	 * @param driver[WebDriver]
	 * @param index[int]
	 * @return void
	 */
	public void switchToFrameUsingIndex(WebDriver driver, int index)
	{
		driver.switchTo().frame(index);
	}
	
	/**
	 * This method is used to switch to Frame Using name or id attribute value
	 * method accepts driver reference in WebDriver Type, nameOrId in String type
	 * @param driver[WebDriver]
	 * @param nameOrId[String]
	 * @return void
	 */
	public void switchToFrameUsingNameOrId(WebDriver driver, String nameOrId)
	{
		driver.switchTo().frame(nameOrId);
	}
	
	/**
	 * This method is used to switch to Frame Using WebElement
	 * method accepts driver reference in WebDriver Type, element in WebElement type
	 * @param driver[WebDriver]
	 * @param element[WebElement]
	 * @return void
	 */
	public void switchToFrameUsingWebElement(WebDriver driver, WebElement element)
	{
		driver.switchTo().frame(element);
	}
}