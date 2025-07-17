package org.Crickters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MSDhoni
{
	@Test
	public void Tc()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/MS_Dhoni");
		driver.quit();
	}


}
