package com.novell.iprint.android.testcases;

import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.android.common.util.AndroidAutomationUtility;
import com.novell.iprint.android.common.IPrintAndroidInit;
import com.novell.iprint.android.locators.PrintJobsLocator;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class IprintAndroid_Document_File_PrintJobs extends IPrintAndroidInit{
		
		//public static long timeOutInSeconds = 30;
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
//			iprintUtil.openIprint();
			
			 /*this will map the local drive folder
			uncomment it if you are running for the first time*/
			iprintUtil.fileManagerSetup(driver);
		 }
		 
		 
		 @Test
//		this will select file then add server an dgive print
		 public void test001_1573400_verifyDOC() throws Exception {
			 boolean JobStatusCheck = false;
			 
			 iprintUtil.selectFile(driver, PrintJobsLocator.docFile);
			 iprintUtil.selctPrinterGivePrint(driver, sServerIP3);
			 
			 JobStatusCheck = iprintUtil.verifyPrintJobs(driver, VerificationText);
				
				//Verify Test result
				assertTrue("Job submitted successfully",JobStatusCheck);
			 
		}






		@Test
		 public void test002_1573400_verifyDOCX() throws Exception {
			 
			 boolean JobStatusCheck = false;
			 iprintUtil.PrintJobs(driver, PrintJobsLocator.docxFile);
			 JobStatusCheck = iprintUtil.verifyPrintJobs(driver, VerificationText);
				
				//Verify Test result
				assertTrue("Job submitted successfully",JobStatusCheck);
		 }






		@Test
		 public void test003_1573400_verifyDOCM() throws Exception {
			 
			 boolean JobStatusCheck = false;
			 iprintUtil.PrintJobs(driver, PrintJobsLocator.docmFile);
			 JobStatusCheck = iprintUtil.verifyPrintJobs(driver, VerificationText);
				
				//Verify Test result
				assertTrue("Job submitted successfully",JobStatusCheck);
			 
		 }






		@Test
		 public void test004_1573400_verifyDOTM() throws Exception {
			 
			 boolean JobStatusCheck = false;
			 iprintUtil.PrintJobs(driver, PrintJobsLocator.dotmFile);
			 JobStatusCheck = iprintUtil.verifyPrintJobs(driver, VerificationText);
				
				//Verify Test result
				assertTrue("Job submitted successfully",JobStatusCheck);
			 
				
				
				
		 }

		@Test
		 public void test005_1573400_verifyTXT() throws Exception {
			boolean JobStatusCheck = false;
			 iprintUtil.PrintJobs(driver, PrintJobsLocator.txtFile);
			 JobStatusCheck = iprintUtil.verifyPrintJobs(driver, VerificationText);
				
				//Verify Test result
				assertTrue("Job submitted successfully",JobStatusCheck);
			 
		 }




//		@Test
//		 public void test021_1426508_verifyTXT() throws Exception {
//			 
//			boolean JobStatusCheck = false;
//			 
//			iprintUtil.PrintJobs(driver, PrintJobsLocator.txtFile);		
//			androidAutomationUtility.waitForElementNotVisible(driver, GenericAndroidLocators.PrintingJobStatus, 30);
//			JobStatusCheck =  androidAutomationUtility.getAttributeValue(driver, GenericAndroidLocators.jobStatus, "text").equalsIgnoreCase("Completed");
//			
//			//Verify Test result
//			assertTrue("Job submitted successfully",JobStatusCheck);
//			
//			
//				 /* new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='android.widget.LinearLayout' and ./*[@class='android.widget.RelativeLayout']]")));
//				  driver.findElement(By.xpath("//*[@class='android.widget.LinearLayout' and ./*[@class='android.widget.RelativeLayout']]")).click();
//				  
//				  new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='infoLayout' and ./*[./*[@text='100kb.txt'] and ./*[@text='1:17 AM']]]")));
//				  driver.findElement(By.xpath("//*[@id='infoLayout' and ./*[./*[@text='100kb.txt'] and ./*[@text='1:17 AM']]]")).click();
//				  
//				  new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='infoLayout' and ./*[./*[@text='100kb.txt'] and ./*[@text='1:17 AM']]]")));
//				  driver.findElement(By.xpath("//*[@id='infoLayout' and ./*[./*[@text='100kb.txt'] and ./*[@text='1:17 AM']]]")).click();*/
//			//boolean JobPresent =  androidAutomationUtility.waitForMobileElementVisible(driver, PrintJobsLocator.textFileJob, timeOutInSeconds);
//			
//					//androidAutomationUtility.wait_and_clickMobileELement(driver, PrintJobsLocator.textFileJob, timeOutInSeconds);
//			 
//			 
//			/* driver.findElement(By.xpath("//*[@class='android.widget.ImageButton' and ./parent::*[@id='fab_menu']]")).click();
//			 driver.findElement(By.xpath("//*[@id='fab_menu_docs']")).click();
//			 //driver.findElement(By.xpath("//*[@id='line2' and ./preceding-sibling::*[./*[@text='100kb.txt']]]")).click();
//			 androidAutomationUtility.scrollAndClick(driver, PrintJobsLocator.txtFile);		 
//			 driver.findElement(By.xpath("//*[@id='printerNameView']")).click();	 
//			 driver.findElement(By.xpath("(//*[@id='printerListRecylerView']/*[./*[./*[@id='printerLocationView']]])[1]")).click();
//			 driver.findElement(By.xpath("//*[@id='fab_print']")).click();
//			 */
//		 }






		@Test
		 public void test006_1573400_verifyODT() throws Exception {
			 
			 boolean JobStatusCheck = false;
			 iprintUtil.PrintJobs(driver, PrintJobsLocator.odtFile);
			 JobStatusCheck = iprintUtil.verifyPrintJobs(driver, VerificationText);
				
				//Verify Test result
				assertTrue("Job submitted successfully",JobStatusCheck);
			 
		
		 }






		@Test
 public void test007_1573400_verifyXLS() throws Exception {
	 
	 boolean JobStatusCheck = false;
	 iprintUtil.PrintJobs(driver, PrintJobsLocator.xlsFile);
	 JobStatusCheck = iprintUtil.verifyPrintJobs(driver, VerificationText);
		
		//Verify Test result
		assertTrue("Job submitted successfully",JobStatusCheck);
	 
 }






 @Test
 public void test008_1573400_verifyXLSX() throws Exception {
	 
	 boolean JobStatusCheck = false;
	 iprintUtil.PrintJobs(driver, PrintJobsLocator.xlsxFile);
	 JobStatusCheck = iprintUtil.verifyPrintJobs(driver, VerificationText);
		
		//Verify Test result
		assertTrue("Job submitted successfully",JobStatusCheck);
	 
 }

 @Test
 public void test009_1573400_verifyXLSM() throws Exception {
	 
	 boolean JobStatusCheck = false;
	 iprintUtil.PrintJobs(driver, PrintJobsLocator.xlsmFile);
	 JobStatusCheck = iprintUtil.verifyPrintJobs(driver, VerificationText);
		
		//Verify Test result
		assertTrue("Job submitted successfully",JobStatusCheck);
	 
 }




		//		@Ignore
//		@Test
//		 public void test024_1426515_verifyPPSM() throws Exception {
//			 
//			 boolean JobStatusCheck = false;
//			 iprintUtil.PrintJobs(driver, PrintJobsLocator.ppsmFile);
//			 JobStatusCheck = iprintUtil.verifyPrintJobs(driver, VerificationText);
//				
//				//Verify Test result
//				assertTrue("Job submitted successfully",JobStatusCheck);
//			 
//		 }
		 
//		 @Test
//		 public void test027_1426517_verifyXBM() throws Exception {
//			 
//			 boolean JobStatusCheck = false;
//			 iprintUtil.PrintJobs(driver, PrintJobsLocator.xbmFile);
//			 JobStatusCheck = iprintUtil.verifyPrintJobs(driver, VerificationText);
//				
//				//Verify Test result
//				assertTrue("Job submitted successfully",JobStatusCheck);
//			 
//			 		
//		 }
		 
		 @Test
		 public void test010_1573400_verifyXLSB() throws Exception {
			 
			 boolean JobStatusCheck = false;
			 iprintUtil.PrintJobs(driver, PrintJobsLocator.xlsbFile);
			 JobStatusCheck = iprintUtil.verifyPrintJobs(driver, VerificationText);
				
				//Verify Test result
				assertTrue("Job submitted successfully",JobStatusCheck);
			 
		 }






		 @Ignore //format not supported
		 @Test
		 public void test011_1573400_verifyXLTM() throws Exception {
			 
			 boolean JobStatusCheck = false;
			 iprintUtil.PrintJobs(driver, PrintJobsLocator.xltmFile);
			 JobStatusCheck = iprintUtil.verifyPrintJobs(driver, VerificationText);
				
				//Verify Test result
				assertTrue("Job submitted successfully",JobStatusCheck);
			 
		 }






		@Test
		 public void test012_1573400_verifyPPT() throws Exception {
			 
			 boolean JobStatusCheck = false;
			 iprintUtil.PrintJobs(driver, PrintJobsLocator.pptFile);
			 JobStatusCheck = iprintUtil.verifyPrintJobs(driver, VerificationText);
				
				//Verify Test result
				assertTrue("Job submitted successfully",JobStatusCheck);
			 
		 }






		@Test
		 public void test013_1573400_verifyPPTX() throws Exception {
			
			 boolean JobStatusCheck = false;
			 iprintUtil.PrintJobs(driver, PrintJobsLocator.pptxFile);
			 JobStatusCheck = iprintUtil.verifyPrintJobs(driver, VerificationText);
				
				//Verify Test result
				assertTrue("Job submitted successfully",JobStatusCheck);
			 
		
		 }






		//		 @Ignore
		//		 @Test
		//		 public void test013_1426514_verifyPPM() throws Exception {
		//			 
		//			 boolean JobStatusCheck = false;
		//			 iprintUtil.PrintJobs(driver, PrintJobsLocator.ppmFile);
		//			 JobStatusCheck = iprintUtil.verifyPrintJobs(driver, VerificationText);
		//				
		//				//Verify Test result
		//				assertTrue("Job submitted successfully",JobStatusCheck);
		//			 
		//		 }
		
		
		
		
		
		
				/************************************END OF MS ***********************************************/	
					
		
				@Test
				 public void test014_1573400_verifyPPTM() throws Exception {
					
					 boolean JobStatusCheck = false;
					 iprintUtil.PrintJobs(driver, PrintJobsLocator.pptmFile);
					 JobStatusCheck = iprintUtil.verifyPrintJobs(driver, VerificationText);
						
						//Verify Test result
						assertTrue("Job submitted successfully",JobStatusCheck);
					 
				 }






		@Test
		 public void test015_1573400_verifyODP() throws Exception {
			 
			 boolean JobStatusCheck = false;
			 iprintUtil.PrintJobs(driver, PrintJobsLocator.odpFile);
			 JobStatusCheck = iprintUtil.verifyPrintJobs(driver, VerificationText);
				
				//Verify Test result
				assertTrue("Job submitted successfully",JobStatusCheck);
			 
		 }






		@Test
		 public void test016_1573400_verifyODS() throws Exception {
			 
			 boolean JobStatusCheck = false;
			 iprintUtil.PrintJobs(driver, PrintJobsLocator.odsFile);
			 JobStatusCheck = iprintUtil.verifyPrintJobs(driver, VerificationText);
				
				//Verify Test result
				assertTrue("Job submitted successfully",JobStatusCheck);
			 
		 }






		@Test
		 public void test017_1573400_verifyODI() throws Exception {
			 
			 boolean JobStatusCheck = false;
			 iprintUtil.PrintJobs(driver, PrintJobsLocator.odiFile);
			 JobStatusCheck = iprintUtil.verifyPrintJobs(driver, VerificationText);
				
				//Verify Test result
				assertTrue("Job submitted successfully",JobStatusCheck);
			 
			 
		 }






		/************************************START OF OO ************************************************/
		
		
		 @Test
		 public void test023_1573400_verifyODG() throws Exception {
			 
			 boolean JobStatusCheck = false;
			 iprintUtil.PrintJobs(driver, PrintJobsLocator.odgFile);
			 JobStatusCheck = iprintUtil.verifyPrintJobs(driver, VerificationText);
				
				//Verify Test result
				assertTrue("Job submitted successfully",JobStatusCheck);
			 
			 		 
		 }






		@Test
		 public void test024_1573400_verifyCSV() throws Exception {
			 
			 boolean JobStatusCheck = false;
			 iprintUtil.PrintJobs(driver, PrintJobsLocator.csvFile);
			 JobStatusCheck = iprintUtil.verifyPrintJobs(driver, VerificationText);
				
				//Verify Test result
				assertTrue("Job submitted successfully",JobStatusCheck);
			 
			 		
		 }






		/************************************END OF OO ***********************************************/	
			
		
		/************************************START OF OTHERS ************************************************/
		
		 @Test
		 public void test025_1573400_verifyHTML() throws Exception {
			 
			 boolean JobStatusCheck = false;
			 iprintUtil.PrintJobs(driver, PrintJobsLocator.htmlFile);
			 JobStatusCheck = iprintUtil.verifyPrintJobs(driver, VerificationText);
				
				//Verify Test result
				assertTrue("Job submitted successfully",JobStatusCheck);
			 
		}





		@Ignore //format not supported
		@Test
		 public void test026_1573400_verifyXML() throws Exception {
			 
			 boolean JobStatusCheck = false;
			 iprintUtil.PrintJobs(driver, PrintJobsLocator.xmlFile);
			 JobStatusCheck = iprintUtil.verifyPrintJobs(driver, VerificationText);
				
				//Verify Test result
				assertTrue("Job submitted successfully",JobStatusCheck);
			 
		 }

		@Ignore //format not supported
		@Test
		 public void test027_1573400_verifyDXF() throws Exception {
			 
			 boolean JobStatusCheck = false;
			 iprintUtil.PrintJobs(driver, PrintJobsLocator.dxfFile);
			 JobStatusCheck = iprintUtil.verifyPrintJobs(driver, VerificationText);
				
				//Verify Test result
				assertTrue("Job submitted successfully",JobStatusCheck);
			 
		 }




		/************************************END OF IMAGE***********************************************/	
		
		
		/************************************START OF MS************************************************/
		
		
		 @Test
		 public void test028_1573400_verifyRTF() throws Exception {
			 
			 boolean JobStatusCheck = false;
			 iprintUtil.PrintJobs(driver, PrintJobsLocator.rtfFile);
			 JobStatusCheck = iprintUtil.verifyPrintJobs(driver, VerificationText);
				
				//Verify Test result
				assertTrue("Job submitted successfully",JobStatusCheck);
			}






		@Test
		 public void test029_1573400_verifyJPG() throws Exception {
			
			 boolean JobStatusCheck = false;
			 iprintUtil.PrintJobs(driver, PrintJobsLocator.jpgFile);
			 JobStatusCheck = iprintUtil.verifyPrintJobs(driver, VerificationText);
				
				//Verify Test result
				assertTrue("Job submitted successfully",JobStatusCheck);
		 }






		@Test
		 public void test030_1573400_verifyJPEG() throws Exception {
			 
			boolean JobStatusCheck = false;
			iprintUtil.PrintJobs(driver, PrintJobsLocator.jpegFile);
			 
			JobStatusCheck = iprintUtil.verifyPrintJobs(driver, VerificationText);
				
			//Verify Test result
			assertTrue("Job submitted successfully",JobStatusCheck);
		 }






		@Test
		 public void test031_1573400_verifyPNG() throws Exception {
			 
			 boolean JobStatusCheck = false;
			 iprintUtil.PrintJobs(driver, PrintJobsLocator.pngFile);
			 JobStatusCheck = iprintUtil.verifyPrintJobs(driver, VerificationText);
				
				//Verify Test result
				assertTrue("Job submitted successfully",JobStatusCheck);
			 }






		//		 @Ignore
		//		 @Test
		//		 public void test031_1426521_verifyXPM() throws Exception {
		//			 
		//			 boolean JobStatusCheck = false;
		//			 iprintUtil.PrintJobs(driver, PrintJobsLocator.xpmFile);
		//			 JobStatusCheck = iprintUtil.verifyPrintJobs(driver, VerificationText);
		//				
		//				//Verify Test result
		//				assertTrue("Job submitted successfully",JobStatusCheck);
		//			 
		//		 }
		
				 @Test
				 public void test032_1573400_verifyBMP() throws Exception {
					
					boolean JobStatusCheck = false;
					
					iprintUtil.PrintJobs(driver, PrintJobsLocator.bmpFile);
					
					JobStatusCheck = iprintUtil.verifyPrintJobs(driver, VerificationText);
					
					//Verify Test result
					assertTrue("Job submitted successfully",JobStatusCheck);
				 }






		/************************************START OF IMAGE ************************************************/
		
		 @Test
		 public void test033_1573400_verifyGIF() throws Exception {
			 
			boolean JobStatusCheck = false;
			iprintUtil.PrintJobs(driver, PrintJobsLocator.gifFile);
			 
			JobStatusCheck = iprintUtil.verifyPrintJobs(driver, VerificationText);
				
			//Verify Test result
			assertTrue("Job submitted successfully",JobStatusCheck);
		 }

		 /************************************END OF OO ***********************************************/	
			
		
		@Test
		 public void test034_1573400_verifyPDF() throws Exception {
			 
			 boolean JobStatusCheck = false;
			 iprintUtil.PrintJobs(driver, PrintJobsLocator.pdfFile);
			 JobStatusCheck = iprintUtil.verifyPrintJobs(driver, VerificationText);
				
				//Verify Test result
				assertTrue("Job submitted successfully",JobStatusCheck);
			 
		 }

		@Test
		 public void test035_1573400_verifyDWG() throws Exception {
			 
			 boolean JobStatusCheck = false;
			 iprintUtil.PrintJobs(driver, PrintJobsLocator.dwgFile);
			 JobStatusCheck = iprintUtil.verifyPrintJobs(driver, VerificationText);
				
				//Verify Test result
				assertTrue("Job submitted successfully",JobStatusCheck);
			 
		 }
		@Ignore //format not supported
		@Test
		 public void test036_1573400_verifyJS() throws Exception {
			 
			 boolean JobStatusCheck = false;
			 iprintUtil.PrintJobs(driver, PrintJobsLocator.jsFile);
			 JobStatusCheck = iprintUtil.verifyPrintJobs(driver, VerificationText);
				
				//Verify Test result
				assertTrue("Job submitted successfully",JobStatusCheck);
			 
		 }





		//		@Ignore
		//		@Test
		//		 public void test017_1426512_verifyPBM() throws Exception {
		//			 
		//			 boolean JobStatusCheck = false;
		//			 iprintUtil.PrintJobs(driver, PrintJobsLocator.pbmFile);
		//			 JobStatusCheck = iprintUtil.verifyPrintJobs(driver, VerificationText);
		//				
		//				//Verify Test result
		//				assertTrue("Job submitted successfully",JobStatusCheck);
		//			 
		//		 }
		
		
		
		
		
		
	 @Ignore //format not supported
	 @Test
	 public void test037_1573400_verifyCSS() throws Exception {
							 
		boolean JobStatusCheck = false;
		iprintUtil.PrintJobs(driver, PrintJobsLocator.cssFile);
		JobStatusCheck = iprintUtil.verifyPrintJobs(driver, VerificationText);
								
		//Verify Test result
		assertTrue("Job submitted successfully",JobStatusCheck);
							 
	}
 
	 @Test
	 public void test038_1573400_verifyART() throws Exception {
							 
		boolean JobStatusCheck = false;
		iprintUtil.PrintJobs(driver, PrintJobsLocator.artFile);
		JobStatusCheck = iprintUtil.verifyPrintJobs(driver, VerificationText);
								
		//Verify Test result
		assertTrue("Job submitted successfully",JobStatusCheck);
							 
	}





		@Test
		 public void test39_1573400_verifyTIF() throws Exception {
			 
			 boolean JobStatusCheck = false;
			 iprintUtil.PrintJobs(driver, PrintJobsLocator.tifFile);
			 JobStatusCheck = iprintUtil.verifyPrintJobs(driver, VerificationText);
				
				//Verify Test result
				assertTrue("Job submitted successfully",JobStatusCheck);
		 }
		
		
		 
		@AfterClass
		 public static void tearDown() throws Exception 
		 {
		 		//String sClearCache = "cmd /c adb shell pm clear com.novell.iprint.android";
		 		//Runtime.getRuntime().exec(sClearCache);
			
			        

		 }

	}
