package com.test.util;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.test.base.TestBase;

public class Utilities extends TestBase{
	
	public static int PAGE_LOAD_TIMEOUT = 17;
	public static int THREADSLEEP = 10000;

	public Boolean isElementAvailable(String locator) {
		
		try {
		driver.findElement(By.xpath(or.getProperty(locator)));
		return true;
		}
		catch (Throwable throwable) {
			return false;
		}
	}
	
	public Boolean isElementDisplayed(String locator) {
		return driver.findElement(By.xpath(or.getProperty(locator))).isDisplayed();
	}
	
	public void click(String locator) {
		driver.findElement(By.xpath(locator)).click();
	}
	
	public void typing(String locator, String value) {
		driver.findElement(By.xpath(locator)).sendKeys(value);
	}
	
	public void typing(String locator, Keys keys) {
		driver.findElement(By.xpath(locator)).sendKeys(keys);
	}
	
	public void selectDropdown(String locator, int index) {
		WebElement dropdown = driver.findElement(By.xpath(locator));
		Select select = new Select(dropdown);
		select.selectByIndex(index);
	}
	
	public void selectDropdown(String locator, String value) {
		WebElement dropdown = driver.findElement(By.xpath(locator));
		Select select = new Select(dropdown);
		select.selectByValue(value);
	}
}
