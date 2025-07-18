package org.Crickters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Katrina {
	public void actor()
	{
  WebDriver driver = new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://en.wikipedia.org/wiki/Katrina_Kaif");
		}
	}
