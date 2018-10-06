package com.android.common;

import org.junit.BeforeClass;

import com.android.common.util.AndroidAutomationUtility;


public class AndroidAutomationInit extends AndroidAutomationBase{

		
	
public static AndroidAutomationUtility androidAutomationUtility ;
	

	@BeforeClass
	public static void setUpIOSAutomation()
	{
		androidAutomationUtility = new AndroidAutomationUtility();
	}
	
}


