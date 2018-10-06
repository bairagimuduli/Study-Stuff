package com.novell.iprint.android.testcases;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.android.common.util.AndroidAutomationUtility;
import com.novell.iprint.android.common.IPrintAndroidInit;
import com.novell.iprint.android.util.IprintUtil;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class IprintAndroid_AddMultpleiServer extends IPrintAndroidInit 
{
	 
	 public static long timeOutInSeconds = 60;
	 public static String sServerIP1,sServerIP2,sServerHostName1,sServerHostName2,sErrorText;
	 public static String loginUserID, loginPassword;
	 public static String loginUserID2, loginPassword2;
	 public static String[] multiServerIPs;
	
	 @BeforeClass
	 public static void setUp() throws Exception
	 {
		 
		 String sClearCache = "cmd /c adb shell pm clear com.novell.iprint.android";
		 Runtime.getRuntime().exec(sClearCache);
		
		 iprintUtil.gotoAppSettings();
		 
		sServerIP1 = AndroidAutomationUtility.getTestData("multiServerIP1");
		sServerIP2 = AndroidAutomationUtility.getTestData("multiServerIP2");
		sServerHostName1 = AndroidAutomationUtility.getTestData("hostName1");
	 	sServerHostName2 = AndroidAutomationUtility.getTestData("hostName2");
	 	loginUserID = AndroidAutomationUtility.getTestData("loginUID");
		loginPassword = AndroidAutomationUtility.getTestData("loginPWD");
		loginUserID2 = AndroidAutomationUtility.getTestData("loginUID2");
		loginPassword2 = AndroidAutomationUtility.getTestData("loginPWD2");
		
	 }
	 @Test
	 public void test001_1377169_ConnectMultipleServers() throws Exception
	 {
		 
		 IprintUtil.addServer(driver, sServerIP1);
		 TimeUnit.SECONDS.sleep(2);
			 
		 IprintUtil.addServer(driver, sServerIP2);
		 TimeUnit.SECONDS.sleep(2);
		 	
	 }
	 
	 
}
