package org.automation.generic_utilities;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

/**
 * ActionsUtil class contains some non static methods, which will help 
 * Automation Engineers to perform some actions on the web page
 * @author Harsha G R
 */
public class ActionsUtil {
	public Actions actions;

	/**
	 * ActionsUtil constructor accepts driver reference in WebDriver Type
	 * and assigns the reference
	 * @param driver[WebDriver]
	 */
	public ActionsUtil(WebDriver driver) {
		this.actions = new Actions(driver);
	}

	/**
	 * This method is used to perform click action on the given element
	 * @param element[WebElement]
	 * @return void
	 */
	public void clickOnElement(WebElement element) {
		//actions.click(element).perform();
	}

	/**
	 * This method is used to pass the data to the given element
	 * @param element[WebElement]
	 * @param data[String]
	 * @return void
	 */
	public void passDataToElement(WebElement element, String data) {
		actions.sendKeys(element, data).perform();
	}

	/**
	 * This method is used to perform double click action on given element
	 * @param element[WebElement]
	 * @return void
	 */
	public void doubleClickOnElement(WebElement element) {
		actions.doubleClick(element).perform();
	}

	/**
	 * This method is used to perform right click action on given element
	 * @param element[WebElement]
	 * @return void
	 */
	public void rightClickOnElement(WebElement element) {
		actions.contextClick(element).perform();
	}

	/**
	 * This method is used to perform mouse hover action on given element
	 * @param element[WebElement]
	 * @return void
	 */
	public void mouseHoverOnElement(WebElement element) {
		actions.moveToElement(element).perform();
	}

	/**
	 * This method is used to perform action of dragging and dropping
	 *  the given element to the destination element
	 * @param element[WebElement]
	 * @param dest[WebElement]
	 * @return void
	 */
	public void dragAndDropAnElement(WebElement element, WebElement dest) {
		actions.dragAndDrop(element, dest).perform();
	}
	/**
	 * This method is used to perform action of dragging and dropping
	 *  the given element to the destination based on offset
	 * @param element[WebElement]
	 * @param xOffset[int]
	 * @param yOffset[int]
	 * @return void
	 */
	
	public void dragAndDropAnElementBasedOnOffset(WebElement element, int xOffset, int yOffset) {
		actions.dragAndDropBy(element, xOffset, yOffset).perform();
	}

	/**
	 * This method is used to scroll the web page based on offset values
	 * @param xOffset[int]
	 * @param yOffset[int]
	 * @return void
	 */
	public void scrollBasedOnAmount(int xOffset, int yOffset) {
		actions.scrollByAmount(xOffset, yOffset).perform();
	}

	/**
	 * This method is used to scroll the web page until the given element is
	 * visible on the viewport
	 * @param element[WebElement]
	 * @return void
	 */
	public void scrollUntilElementIsVisible(WebElement element) {
		actions.scrollToElement(element).perform();
	}

	/**
	 * This method is used to scroll the web page until the given element is
	 * visible on the viewport, and can perform extra scrolling as well
	 * @param element[WebElement]
	 * @param xOffset[int]
	 * @param yOffset[int]
	 * @return void
	 */
	public void scrollUntilElementIsVisible(WebElement element, int xOffset, int yOffset) {
		actions.scrollFromOrigin(ScrollOrigin.fromElement(element), xOffset, yOffset).perform();
	}
	
	/**
	 * This method is used to perform pause action on the web page
	 * @param seconds[int]
	 * @return void
	 */
	public void pauseAction(int seconds) {
		actions.pause(Duration.ofSeconds(seconds)).perform();
	}
}
 