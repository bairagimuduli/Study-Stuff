package com.novell.iprint.android.testcases;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.android.common.util.AndroidAutomationUtility;
import com.novell.iprint.android.common.IPrintAndroidInit;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class IprintAndroid_Gallery_PrintJob extends IPrintAndroidInit {
	
	 public static String sServerIP1,sServerIP2,sServerHostName1,sServerHostName2,sErrorText;
	 public static String loginUserID, loginPassword;
	 public static String loginUserID2, loginPassword2;
	 public static String[] multiServerIPs;
	 public static String sServerIP3;
	 public static String VerificationText = "Completed";
	 
	 
	 @BeforeClass
	 public static void setUp() throws Exception
	 {
		 
		sServerIP3 = AndroidAutomationUtility.getTestData("singleserverIP");
//		iprintUtil.openIprint();
	 }
	 
	 @Test
	 public void test001_1573399_printFromGalleryWhenServerIsNotAdded() throws Exception {
		 boolean JobStatusCheck = false;
		 
		 iprintUtil.selectFileFormGallery(driver);
		 iprintUtil.selctPrinterGivePrint(driver, sServerIP3);
		 
		 JobStatusCheck = iprintUtil.verifyPrintJobs(driver, VerificationText);
			
			//Verify Test result
			assertTrue("Job submitted successfully",JobStatusCheck);
	}

	 @Test
	 public void test002_1573399_printFromGalleryWhenServerIsAdded() throws Exception {
		 boolean JobStatusCheck = false;
		 
		 iprintUtil.selectFileFormGallery(driver);
		 iprintUtil.selctPrinterGivePrint(driver);
		 
		 JobStatusCheck = iprintUtil.verifyPrintJobs(driver, VerificationText);
			
			//Verify Test result
			assertTrue("Job submitted successfully",JobStatusCheck);
	}

	 

}
