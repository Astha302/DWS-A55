package org.automation.generic_utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * javaScript class contains some non static method which will help automation
 * eng to perform some opr like scroling , click passing
 * 
 */
public class JavascriptUtil {
	public JavascriptExecutor jse;

	/**
	 * javascriptUtil consturctor Accept driver ref in webdriver type and converts
	 * that reference into javascriptExecutoir type and assigns it
	 * 
	 * @param driver[webdriver]
	 */
	public JavascriptUtil(WebDriver driver) {
		this.jse = (JavascriptExecutor) driver;
	}
	
	
	
	
	
	
	

	/**
	 * this method is used to perform click opr on the given element through js
	 * 
	 * @param element[webElement] return void
	 */
	public void jsClick(WebElement element) {
		jse.executeScript("argument[0].click()", element);
	}

	
	
	

	
	/**This method is used to pass the data to the given element through js
	 * @param element[WebElement]
	 * @param data
	 */
	public void jsSendKeys(WebElement element , String data)
	{
		jse.executeScript("argument[0] .value = "+data+"" , element);
	}





	/**This method used to scroll the webPage based on offset values through js
	 * @param xOffset[int]
	 * @param yOffset[int]
	 * @return void
	 */
	public void jsScrollBy(int xOffset, int yOffset) {
		jse.executeScript("window.scrollBy(" + xOffset + "," + yOffset + ")");
	}

	
	
	
	/** 
	 * this method is used to scroll the webPage on coordinate through js
	 * @param xcoordinate[int]
	 * @param ycoordinate[int]
	 * @retun void
	 */
	public void jsScrollTo(int xcoordinate, int ycoordinate) {
		jse.executeScript("window.scrollTo(" + xcoordinate + "," + ycoordinate + ")");
	}
	
	
	
	
	
	/**
	 * This method is used to scroll the webpage based on element through js
	 *  and we can decide that element should be their in top and bottom of the webPage
	 *  
	 *  if element to be present in top pass true , otherwise pass false
	 *  
	 * @param topView[boolean]
	 * @param element[WebElement]
	 * @return void
	 */

	public void jsScrollintoView(boolean topView, WebElement element) {
		jse.executeScript("argument[0],scrollIntoView(" + topView + ")", element);
	}
}
