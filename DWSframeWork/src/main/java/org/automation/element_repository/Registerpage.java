package org.automation.element_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registerpage extends Basepage
{
	public Registerpage(WebDriver driver)
	{
		super(driver);
	}

	 
		@FindBy(id="gender-male")
		private WebElement genderMaleRadioButton;
		
		@FindBy(id="gender-female")
		private WebElement genderFemaleRadioButton;
		
		@FindBy(id="FirstName")
		private WebElement firstNameTestBox;
		

		@FindBy(id="lastName")
		private WebElement lastNameTestBox;
		

		@FindBy(id="Email")
		private WebElement emailTestBox;
		

		@FindBy(id="Password")
		private WebElement passwordTestBox;
		
		@FindBy(id= "ConfirmPassword")
		private WebElement confirmPasswordTextBox;
		
		@FindBy(id= "register-button")
		private WebElement registerButton;

		public WebElement getMaleRadioButton() {
			return genderMaleRadioButton;
		}

		public WebElement getFemaleRadioButton() {
			return genderFemaleRadioButton;
		}

		public WebElement getFirstNameTestBox() {
			return firstNameTestBox;
		}

		public WebElement getLastNameTestBox() {
			return lastNameTestBox;
		}

		public WebElement getEmailTestBox() {
			return emailTestBox;
		}

		public WebElement getPasswordTestBox() {
			return passwordTestBox;
		}

		public WebElement getConfirmPasswordTextBox() {
			return confirmPasswordTextBox;
		}

		public WebElement getRegisterRadioButton() {
			return registerButton;
		}
		
		
		
		
		//========================Business logic================
		
		public void register(String gender , String firstName , String lastName ,
				String email, String password)
		{
			
			getRegisterLink().click();
			if(gender.equalsIgnoreCase("male"))
			{
				genderMaleRadioButton.click();
			}
			else
			{
				genderFemaleRadioButton.click();
			}
			
			 getMaleRadioButton().click();
			 getFemaleRadioButton().click();
			 getFirstNameTestBox().sendKeys(firstName);
			 getLastNameTestBox().sendKeys(lastName);
			 getEmailTestBox().sendKeys(email);
			 getPasswordTestBox().sendKeys(password);
			 getConfirmPasswordTextBox().sendKeys(password);
			 getRegisterRadioButton().click();
			 
	}			 
}
	
	
		
		
		
		
		
	
	
	
