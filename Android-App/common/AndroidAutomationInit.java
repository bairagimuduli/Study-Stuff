package com.ios.common;

import org.junit.BeforeClass;

import com.android.common.util.AndroidAutomationUtility;
import com.ios.common.util.IOSAutomationUtility;

public class AndroidAutomationInit extends AndroidAutomationBase{
	
	
public static AndroidAutomationUtility androidAutomationUtility ;
	
	@BeforeClass
	public static void setUpIOSAutomation()
	{
		androidAutomationUtility = new AndroidAutomationUtility();
	}

}
