package com.redBus.Login.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	@FindBy(id = "i-icon-profile")
	WebElement LoginIcon;

	@FindBy(id = "signInLink")
	WebElement LoginLink;

	@FindBy(id = "mobileNoInp")
	WebElement MobileNo;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void LogintoApp(String Mobile) throws InterruptedException {

		LoginIcon.click();
		LoginLink.click();

		System.out.println(Mobile);
		driver.switchTo().frame(0);
		
		MobileNo.sendKeys(Mobile);

	}

}
