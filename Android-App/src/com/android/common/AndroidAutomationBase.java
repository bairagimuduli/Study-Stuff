package com.android.common;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.OutputType;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.apache.commons.io.FileUtils;
import java.net.URL;
import com.android.common.util.AndroidAutomationUtility;
import com.android.common.util.LoggerUtils;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/**
 * Author Vikram
 */

public class AndroidAutomationBase {

	private static String reportDirectory = "reports";
	private static String reportFormat = "xml";
	//private static String testName = "install_configure_21Nov";
	
	public static  AndroidDriver<AndroidElement> driver = null;
	public  static Logger logger = null;
	
	public static  String UDID_Value, IPRINT_APK_FILE, APP_PACKAGE_NAME, APP_ACTIVITY_NAME, ANDROID_DRIVER_URL;
	
	@Rule
	public TestName testName = new TestName();

	@Rule
	public TestWatcher watcher = new TestWatcher()
	{
		@Override
		protected void failed(Throwable e, Description description) 

		{				
			WebDriver driver1 = new Augmenter().augment(driver);
			File file  = ((TakesScreenshot)driver1).getScreenshotAs(OutputType.FILE);
			String sScreenShotDirPath = System.getProperty("user.dir") + "/screenshots/";
			String sScreenShotLoc = sScreenShotDirPath + getRunningClassName() + "_" +  testName.getMethodName() + ".png";
			try {

				FileUtils.copyFile(file, new File(sScreenShotLoc));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}


		}

	};

	
	public static void setUp() throws Exception {
	
	UDID_Value =  AndroidAutomationUtility.getProperty("androidDetails.props", "UDID_Value");
	IPRINT_APK_FILE= AndroidAutomationUtility.getProperty("androidDetails.props", "IPRINT_APK_FILE");
	APP_PACKAGE_NAME = AndroidAutomationUtility.getProperty("androidDetails.props", "APP_PACKAGE_NAME");
	APP_ACTIVITY_NAME = AndroidAutomationUtility.getProperty("androidDetails.props", "APP_ACTIVITY_NAME");
	ANDROID_DRIVER_URL = AndroidAutomationUtility.getProperty("androidDetails.props", "ANDROID_DRIVER_URL");
	
	
	DesiredCapabilities dc = new DesiredCapabilities();
	
	dc.setCapability("reportDirectory", reportDirectory);
	dc.setCapability("reportFormat", reportFormat);
	dc.setCapability(MobileCapabilityType.UDID, UDID_Value);
	System.out.println("connected to the device.");
//	dc.setCapability(MobileCapabilityType.APP, IPRINT_APK_FILE);
	dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, APP_PACKAGE_NAME  );
	dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, APP_ACTIVITY_NAME );
//	dc.setCapability(MobileCapabilityType.NO_RESET, true);
//	dc.setCapability("instrumentApp", true);

	if(driver == null)
	{
	System.out.println(">>>>>>>>>>>>>>>>>>Creating the driver object with capabilities<<<<<<<<<<<<<");
	//driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), dc);
	//driver = new AndroidDriver<AndroidElement>(new URL("http://164.99.112.28:4723/wd/hub"), dc);
	driver = new AndroidDriver<AndroidElement>(new URL(ANDROID_DRIVER_URL), dc);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	System.out.println(">>>>>>>>>>>>Driver oject is created and registered>>>>>>>>>>");
	}
	
		//dc.setCapability("testName", testName);
		//dc.setCapability(MobileCapabilityType.UDID, "4d00f015a02230d7");
		//dc.setCapability(MobileCapabilityType.UDID, "192.168.87.101:5555");
		//dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.novell.iprint.android");
		//dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".IPrintHomeActivity");
		
}

	@BeforeClass
	public static void init() throws Exception
	{
		
		setUp();
	}

	/**
	 * Instantiates the logger instance
	 * @throws Exception
	 */
	@Before
	public void setUpLogger() throws Exception {
		String basePathForLogs = null;
		String currDir = System.getProperty("user.dir");
		basePathForLogs = currDir + File.separator + "logs" + File.separator;
		String _methodName = testName.getMethodName();
		System.out.println(">>> Method name : " + _methodName);
		logger = LoggerUtils.getLogger(getRunningClassName(), _methodName);
		logger.info("Starting : " + getRunningClassName() + "_" + _methodName);
	}

	/** Tears down the Logger instance
	 * @throws Exception
	 */
	@After
	public void tearDownLogger() throws Exception {
		String _methodName = testName.getMethodName();
		logger.info("Ending : " + getRunningClassName() + "_" + _methodName);
		LoggerUtils.releaselogger(logger);

	}

	public String getRunningClassName()
	{
		String fullName = this.getClass().getName();
		int i = (fullName.lastIndexOf(".")+1);
		fullName = fullName.substring(i);
		return fullName;
	}


}
