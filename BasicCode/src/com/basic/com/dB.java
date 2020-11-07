package com.basic.com;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dB {

	public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver","/home/srikanthaki182g/Downloads/chromedriver");
	 WebDriver driver = new ChromeDriver();
	 driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	 driver.get("https://state.1keydata.com/");
	 String state1=driver.findElement(By.cssSelector("div#col1>a:first-of-type")).getText();
	 System.out.println(state1);
	 

	}

}
