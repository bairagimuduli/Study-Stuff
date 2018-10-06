package com.novell.iprint.android.testcases;

import org.junit.BeforeClass;
import org.junit.Test;

import com.android.common.util.AndroidAutomationUtility;
import com.novell.iprint.android.common.IPrintAndroidInit;
import com.novell.iprint.android.util.IprintUtil;


public class IprintAndroid_CheckPrinterList extends IPrintAndroidInit {

	public static long timeOutInSeconds = 60;
	 public static String sServerIP;
	 public static String loginUserID, loginPassword;
	
	 @BeforeClass
	 public static void setUp() throws Exception
	 {
		 
		 String sClearCache = "cmd /c adb shell pm clear com.novell.iprint.android";
		 Runtime.getRuntime().exec(sClearCache);
		
		 IprintUtil.gotoPrinters();
		 
		sServerIP = AndroidAutomationUtility.getTestData("multiServerIP1");
	 	loginUserID = AndroidAutomationUtility.getTestData("loginUID");
		loginPassword = AndroidAutomationUtility.getTestData("loginPWD");
		
	 }
	 
	 @Test
	 public void test001_1377169_AddServerSeePrinter() throws Exception
	 {
		 
		 IprintUtil.addServer(driver, sServerIP);
			 
	
		 	
	 }
}
