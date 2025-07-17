package org.Crickters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.automation.generic_utilities.IAutoConstants.*;


@Test
public class LaunchAndSearch 
{
	public void testacase()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_TIMEOUT));
		String URL = System.getProperty("url");
		
		String  TESTDATA = System.getProperty("data");
		driver.findElement(By.name("q")).sendKeys(TESTDATA,Keys.ENTER);
	}
}
