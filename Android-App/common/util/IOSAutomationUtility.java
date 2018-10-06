package com.ios.common.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ios.common.IOSAutomationBase;
import com.ios.common.IOSAutomationInit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;


public class IOSAutomationUtility {


	public IOSAutomationUtility()
	{

	}


	public static String getProperty(String sFileName, String sPreopertyName) throws FileNotFoundException, IOException
	{

		String sVal = "";
		Properties props = new Properties();
		props.load(new FileInputStream("./props/" + sFileName));
		sVal = props.getProperty(sPreopertyName);

		return sVal;

	}


	public WebElement getWebElement(WebDriver driver,String sXpath)
	{

		WebElement element = driver.findElement(By.xpath(sXpath));		
		return element;

	}


	public void click(WebDriver driver, String sXpath)	
	{
		WebElement element = getWebElement(driver, sXpath);
		element.click();

	}

	public String getText(WebDriver driver, String sXpath)	
	{
		WebElement element = getWebElement(driver, sXpath);
		String sText = element.getText();
		return sText;

	}

	public boolean  waitForElementVisible(WebDriver driver, String sXpath, long timeOutInSeconds)	
	{

		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);


		WebElement element;
		try {
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(sXpath)));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

		return element.isDisplayed();

	}


	public boolean  waitForElementNotVisible(WebDriver driver, String sXpath, long timeOutInSeconds)	
	{

		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		Boolean isAbsent = true;
		try {
			isAbsent = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(sXpath)));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			isAbsent = false;

		}

		return isAbsent;

	}

	public void sendText(WebDriver driver, String sXpath,String sText)	
	{
		WebElement element = getWebElement(driver, sXpath);
		element.sendKeys(sText);

	}

	public void sendKeys(WebDriver driver, String sXpath,Keys key)	
	{

		WebElement element = getWebElement(driver, sXpath);
		element.sendKeys(key);

	}

	public String getAttributeValue(WebDriver driver, String sXpath,String attributeName)	
	{
		WebElement element = getWebElement(driver, sXpath);
		String sText = element.getAttribute(attributeName);	
		return sText;

	}


	public void click2(WebDriver driver, String sXpath)	
	{
		WebElement element = getWebElement(driver, sXpath);


	}


	public String getDate()
	{
		Date date = new Date();
		String sDate = "";
		SimpleDateFormat date1 = new SimpleDateFormat("MMM dd");
		SimpleDateFormat date2 = new SimpleDateFormat("yyyy");
		SimpleDateFormat date3 = new SimpleDateFormat("hh:mm a");
		sDate = date1.format(date) + ", " + date2.format(date) + ", " + date3.format(date);
		return sDate;
	}
	
	
	public void testSlider(WebDriver driver,String sXpath) {
	      //go to controls
	      
	      //get the slider
	      WebElement slider = getWebElement(driver, sXpath);
	      
	      Point sliderLocation = getCenter(slider);
//	      ((AppiumDriver)driver).swipe(sliderLocation.getX(), sliderLocation.getY(), sliderLocation.getX()-sliderLocation.getX(), sliderLocation.getY(), 1);
	      ((AppiumDriver)driver).swipe(sliderLocation.getX(), sliderLocation.getY(), sliderLocation.getX(), 0, 5);
	    }
	
	
	private Point getCenter(WebElement element) {

	      Point upperLeft = element.getLocation();
	      Dimension dimensions = element.getSize();
	      return new Point(upperLeft.getX() + dimensions.getWidth()/2, upperLeft.getY() + dimensions.getHeight()/2);
	    }
	
	public void scrollAndClick(IOSDriver driver, String sXpath)	
	{
		WebElement element = getWebElement(driver, sXpath);
		
		int x = element.getLocation().getX();
		int y = element.getLocation().getY();
		
		
	 	driver.swipe(50, 250, 50, y, 5000);
	 	
	 	click(driver,sXpath);
	}

}
