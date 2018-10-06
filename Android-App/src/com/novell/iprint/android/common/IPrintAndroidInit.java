package com.novell.iprint.android.common;

import org.junit.BeforeClass;

import com.android.common.AndroidAutomationInit;
import com.novell.iprint.android.util.IprintUtil;


public class IPrintAndroidInit extends AndroidAutomationInit{
	
public static IprintUtil iprintUtil ;
	
	@BeforeClass
	public static void setUpIprintInit()
	{
		iprintUtil = new IprintUtil();
	}

}
