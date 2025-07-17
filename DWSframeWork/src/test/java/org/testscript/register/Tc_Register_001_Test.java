package org.testscript.register;

import java.time.Duration;

import org.automation.element_repository.Registerpage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc_Register_001_Test 
{
	@Test
	public void verify_user_is_able_to_register_or_not()
	{
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.get("https://demowebshop.tricentis.com/");
		 Registerpage registerPage = new Registerpage(driver);
		 registerPage.register("female", "astha", "soni", "soni16ashtha@gmail.com", "astha@123");
		 
	}
}
