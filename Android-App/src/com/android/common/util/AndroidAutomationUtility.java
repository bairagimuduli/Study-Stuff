package com.android.common.util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.android.common.AndroidAutomationInit;
import com.novell.iprint.android.locators.DropBoxLocators;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;


public class AndroidAutomationUtility extends AndroidAutomationInit {

	/* ============================================ Basic WebObject Utilities ============================================ */

	public static String getProperty(String sFileName, String sPreopertyName) throws FileNotFoundException, IOException
	{

		String sVal = "";
		Properties props = new Properties();
		props.load(new FileInputStream("./props/" + sFileName));
		sVal = props.getProperty(sPreopertyName);

		return sVal;

	}
	
	public static String getTestData(String sPropertyName) throws FileNotFoundException, IOException
	{

		String sVal = "";
		Properties props = new Properties();
		
		props.load(new FileInputStream("./props/android_test_input.props"));
		sVal = props.getProperty(sPropertyName);

		return sVal;

	}
	
	public static String executeCommand(String sCommand,String osName) throws IOException
	{
		Process p = null;
		
		System.out.println("Executing  " + sCommand + "...in...." + osName);

		switch(osName)
		{
		case "windows"	:
			p = Runtime.getRuntime().exec(new String[]{"cmd /c", sCommand });
			break;

		case "unix" :

			p = Runtime.getRuntime().exec(new String[]{"/bin/sh", "-c", sCommand });
			
			break;
		}
		 
		    BufferedReader reader = new BufferedReader(
		            new InputStreamReader(p.getInputStream()));
		    String line;
		    String finalOutput = "";
		    while ((line = reader.readLine()) != null) {
		        finalOutput = finalOutput + line + "\r\n";
		    }
		 
		    reader.close();
		 
		return finalOutput;

	}

	
	/* ============================================ Basic Selenium Methods in POM  ============================================ */
	
	/*public MobileElement getMobileElement(AndroidDriver<AndroidElement>  driver,String sXpath)
	{
		
		MobileElement element = driver.findElement(By.xpath(sXpath));		
		return element;

	}*/

	public AndroidElement getMobileElement(AndroidDriver<AndroidElement>  driver,String sXpath)
	{
		
		AndroidElement element = driver.findElement(By.xpath(sXpath));		
		return element;

	}

	
	public String getText(AndroidDriver<AndroidElement>  driver, String sXpath)	
	{
		//MobileElement element = getMobileElement(driver, sXpath);
		AndroidElement element = getMobileElement(driver, sXpath);
		String sText = element.getText();
		return sText;
		//return getMobileElement(driver, sXpath).getText();
	}

	public String getAttributeValue(AndroidDriver<AndroidElement>  driver, String sXpath,String attributeName)	
	{
		//MobileElement element = getMobileElement(driver, sXpath);
		AndroidElement element = getMobileElement(driver, sXpath);
		String sText = element.getAttribute(attributeName);	
		return sText;

	}	
	
	
	public void click(AndroidDriver<AndroidElement>  driver, String sXpath)	
	{
		//MobileElement element = getMobileElement(driver, sXpath);
		AndroidElement element = getMobileElement(driver, sXpath);
		element.click();
	}
	
	public void sendText(AndroidDriver<AndroidElement>  driver, String sXpath,String sText)	
	{
		//MobileElement element = getMobileElement(driver, sXpath);
		AndroidElement element = getMobileElement(driver, sXpath);
		
		element.clear();
		element.sendKeys(sText);
		
	}

	public void sendKeys(AndroidDriver<AndroidElement>  driver, String sXpath,CharSequence key)	
	{

		//MobileElement element = getMobileElement(driver, sXpath);
		AndroidElement element = getMobileElement(driver, sXpath);
		element.sendKeys(key);

	}
	
//	public static void getHomeScreen(AndroidDriver<AndroidElement>  driver)
//	{
//		((PressesKeyCode) driver).pressKeyCode(AndroidKeyCode.HOME);
//	}
	
	public static void getHomeScreen(AndroidDriver<AndroidElement>  driver)
	{
		((AndroidDriver<AndroidElement>) driver).pressKeyCode(AndroidKeyCode.HOME);
	}
	
	/* ============================================ Boolean Conditions to validate data  ============================================ */
	
	public boolean  waitForElementVisible(AndroidDriver<AndroidElement>  driver, String sXpath, long timeOutInSeconds)	
	{

		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);

		//WebElement element;
		//MobileElement element;
		AndroidElement element;
		try {
			element = (AndroidElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(sXpath)));
						
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

		return element.isDisplayed();

	}

	public boolean  waitForElementNotVisible(AndroidDriver<AndroidElement>  driver, String sXpath, long timeOutInSeconds)	
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

	public boolean isDisplayed(AndroidDriver<AndroidElement> driver,String xPath){

		try{
			getMobileElement(driver, xPath).isDisplayed();
		}
		catch(NoSuchElementException e)
		{
			return false;
		}
		return true;
	}
		


/*	public void click2(AndroidDriver<AndroidElement>  driver, String sXpath)	
	{
		WebElement element = getWebElement(driver, sXpath);


	}*/


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


/*	public void testSlider(AndroidDriver<AndroidElement>  driver,String sXpath) {
		//go to controls

		//get the slider
		MobileElement slider = getMobileElement(driver, sXpath);

		Point sliderLocation = getCenter(slider);
		//	      ((AppiumDriver)driver).swipe(sliderLocation.getX(), sliderLocation.getY(), sliderLocation.getX()-sliderLocation.getX(), sliderLocation.getY(), 1);
		((AppiumDriver<AndroidElement>)driver).swipe(sliderLocation.getX(), sliderLocation.getY(), sliderLocation.getX(), 0, 5);
	}
*/

	/*private Point getCenter(MobileElement element) {

		Point upperLeft = element.getLocation();
		Dimension dimensions = element.getSize();
		return new Point(upperLeft.getX() + dimensions.getWidth()/2, upperLeft.getY() + dimensions.getHeight()/2);
	}*/

//	public void scrollAndClick(AndroidDriver<AndroidElement> driver, String sXpath) throws Exception	
//	{
//		
//		while(!(isDisplayed(driver, sXpath))) {
//			
//			Dimension size;
//			size = driver.manage().window().getSize();
//			int starty = (int) (size.height * 0.80);
//			int endy = (int) (size.height * 0.20);
//			int startx = size.width / 2;
//			
//			 TouchAction touchAction = new TouchAction(driver);
//		        System.out.println(startx+" "+starty);
//		        System.out.println("Entering swipe");
//
//		            System.out.println("Swipe from "+startx +" " +starty +"to" +startx +" " +endy );
//		            touchAction.press(startx, starty).moveTo(startx,endy).release().perform();
//
//		      
//		           
//		}
		
	
	//modified by bairagi 
		public void scrollAndClick(AndroidDriver<AndroidElement> driver, String sXpath) throws Exception	
		{
			
			while(!(isDisplayed(driver, sXpath))) {
				
				Dimension size;
				size = driver.manage().window().getSize();
				int startx = size.getWidth () / 2;
				int starty = size.getHeight () / 2;
				int endx = 0;
				int endy = (int) (starty * -1 * 0.75);
				
			    System.out.println(startx+" "+starty);
			    System.out.println("Entering swipe");

			    System.out.println("Swipe from "+startx +" " +starty +"to" +startx +" " +endy );
			    driver.swipe(startx, starty, endx, endy, 10);
			    
			    
			           
			}
			
		/*try {
			
			while(!(isDisplayed(driver, sXpath))) {
					
				//Get the size of screen.
				Dimension size;
				size = driver.manage().window().getSize();
				  
				  //Find swipe start and end point from screen's width and height.
				  //Find starty point which is at bottom side of screen.
				  int starty = (int) (size.height * 0.80);
				 
				  
				  //Find endy point which is at top side of screen.
				  int endy = (int) (size.height * 0.20);
				  
				  //Find horizontal point where you wants to swipe. It is in middle of screen width.
				  int startx = size.width / 2;
				  //System.out.println("starty = " + starty + " ,endy = " + endy + " , startx = " + startx);


				  //Swipe from Top to Bottom.
				  driver.swipe(startx, starty, startx, endy, 3000);
			
				}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		wait_and_clickMobileELement(driver, sXpath, 30);
		
		//MobileElement element = getMobileElement(driver, sXpath);
		//element.click();			
	}
			
		

	public void clickMobileELement(AndroidDriver<AndroidElement>  driver,String sXPath)
	{
		//MobileElement mobElement = getMobileElement(driver, sXPath);
		AndroidElement mobElement = getMobileElement(driver, sXPath);
		mobElement.click();
		
	}
	
	
	
	
	/*public String getTextFromMobileElement(AndroidDriver<AndroidElement>  driver, String sXpath)	
	{
	
		MobileElement element = getMobileElement(driver, sXpath);
		String sText = element.getText();
		return sText;
		

	}
	*/
	
	
	// This method is to verify the element present in "by" is existed or not in current web page
	// Then it will return "true" if it finds else it return "false"
		public boolean isElementPresent(AndroidDriver<AndroidElement>  driver,String xPath) {
			driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
			try {
				driver.findElement(By.xpath(xPath));
				return true;
			} catch (NoSuchElementException e) {
				return false;
			} 
			catch (ElementNotVisibleException e)
			{
				return false;
			}
			finally {
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			}
		}	

		
		
	public void goBack(AndroidDriver<AndroidElement>  driver,String sXPath)
	{
		
//		driver.navigate().back();
		
		while(!waitForMobileElementVisible(driver, sXPath, 10))
		{
			driver.navigate().back();
		}
	}
	
	public void clickBack(AndroidDriver<AndroidElement>  driver)
	{
		driver.pressKeyCode(AndroidKeyCode.BACK);
	}
	
	public void clickHome(AndroidDriver<AndroidElement>  driver)
	{
		
		driver.pressKeyCode(AndroidKeyCode.HOME);
	}
	
	

	//*************** Wait and Operate *******************//
	
	public boolean  waitForMobileElementVisible(AndroidDriver<AndroidElement>  driver, String sXpath, long timeOutInSeconds)	
	{

		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);


		//WebElement element;
		AndroidElement element;
		try {
			element =  (AndroidElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(sXpath)));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

		return element.isDisplayed();

	}
	
	public boolean  waitForMobileElementClickable(AndroidDriver<AndroidElement>  driver, String sXpath, long timeOutInSeconds)	
	{

		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);


		//MobileElement element;
		AndroidElement element;
		try {
			element =  (AndroidElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath(sXpath)));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

		return element.isDisplayed();

	}
	

	public void wait_and_clickMobileELement(AndroidDriver<AndroidElement>  driver,String sXPath,long timeOutInSeconds ) throws Exception
	{
		//MobileElement mobElement =  waitTillMobileElementClickable(driver,sXPath,timeOutInSeconds);
		AndroidElement mobElement = waitTillMobileElementClickable(driver, sXPath, timeOutInSeconds);
		
		mobElement.click();
	}

	//public  MobileElement  waitTillMobileElementClickable(AndroidDriver<AndroidElement>  driver, String sXpath, long timeOutInSeconds)	
	public  AndroidElement  waitTillMobileElementClickable(AndroidDriver<AndroidElement>  driver, String sXpath, long timeOutInSeconds)
	{

		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);

		//WebElement element = null;
		AndroidElement element = null;
		try {
			element = (AndroidElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(sXpath)));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		return element;

	}


	
	
	public String getExtension(String sTestName)
	{

		String sb = new StringBuffer(sTestName).substring((sTestName.lastIndexOf("verify")+6), sTestName.length());
		return sb.toString();
	}


	public void selectMicroFocusPrint(AndroidDriver<AndroidElement> driver) throws Exception
	{
		Thread.sleep(5000);
		
		int cnt = 1;
		while(true)
		{
			String sLoctr = DropBoxLocators.loctr.replaceAll("num", String.valueOf(cnt));
			String s = waitTillMobileElementClickable(driver,  sLoctr,30).getText();
			cnt++;
			System.out.println(s);
			System.out.println(sLoctr);
			if(s.contains("iPrint"))
			{
				wait_and_clickMobileELement(driver, sLoctr, 30);
				break;
			}
		}
	}
	
	
	
	public void selectExport(AndroidDriver<AndroidElement> driver) throws Exception
	{
		Thread.sleep(5000);
		
		int cnt = 5;
		while(true)
		{
			String sLoctr = DropBoxLocators.sDropBoxShare.replaceAll("num", String.valueOf(cnt));
			
			System.out.println(sLoctr);
			
			String s = waitTillMobileElementClickable(driver,  sLoctr,30).getText();
			cnt++;
			System.out.println(s);
			
			if(s.contains("Export"))
			{
				wait_and_clickMobileELement(driver, sLoctr, 30);
				break;
			}
		}
	}

}
