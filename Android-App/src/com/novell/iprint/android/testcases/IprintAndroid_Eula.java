package com.novell.iprint.android.testcases;

import org.junit.Test;

import com.novell.iprint.android.common.IPrintAndroidInit;
import com.novell.iprint.android.util.IprintUtil;

public class IprintAndroid_Eula extends IPrintAndroidInit{

	@Test
	 public void introduction() throws Exception
	 {
		IprintUtil.openIprint();
		
	 }
}
