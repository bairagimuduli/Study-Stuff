package com.ios.common;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;



import com.ios.common.util.IOSAutomationUtility;
import com.ios.common.util.LoggerUtils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * Author Somnath Singh.
 */

public class AndroidAutomationBase {

	public static AndroidDriver driver = null;
	public  static Logger logger = null;

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
	
	
	public static void  setUp() throws Exception
	{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		String deviceName = IOSAutomationUtility.getProperty("androidDetails.props", "deviceName");
		String platform_name = IOSAutomationUtility.getProperty("androidDetails.props", "platformName");
		String appium_version = IOSAutomationUtility.getProperty("androidDetails.props", "appium_version");
		String AUTOMATION_NAME = IOSAutomationUtility.getProperty("androidDetails.props", "AUTOMATION_NAME");
		String platFormVersion = IOSAutomationUtility.getProperty("androidDetails.props", "platFormVersion");
		String currDir = System.getProperty("user.dir");
		

		File appDir2 = new File(System.getProperty("user.dir"),
                "/android_apps");
        File app = new File(appDir2, "ContactManager.apk");



        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, platform_name);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,deviceName);
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,AUTOMATION_NAME);
        capabilities.setCapability(MobileCapabilityType.APPIUM_VERSION, appium_version);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, platFormVersion);
//		caps.setCapability(MobileCapabilityType.APP, "C:\\Users\\User\\Downloads\\ContactManager.apk");
        capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());




		if(driver == null)
		{

//tmp 			AppiumInit2.getInstance().startAppiumServer();	
			System.out.println(">>>>>>>>>>>>>>>>>>Creating the driver object with capabilities");
			driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println(">>>>>>>>>>>>Driver oject is created and registered>>>>>>>>>>");
		}

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
