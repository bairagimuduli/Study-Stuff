//package com.novell.iprint.android.util;
//
//import java.util.concurrent.TimeUnit;
//
////import io.appium.java_client.MobileElement;
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.AndroidElement;
//import io.appium.java_client.android.AndroidKeyCode;
////import io.appium.java_client.ios.IOSDriver;
//
//import com.novell.iprint.android.common.IPrintAndroidInit;
//import com.novell.iprint.android.locators.Settings_AddServerPageLocators;
//import com.novell.iprint.android.locators.PrintJobsLocator;
//import com.novell.iprint.android.locators.HamburgerMenuItemsLocator;
//import com.novell.iprint.android.locators.HomePageLocators;
//import com.novell.iprint.android.locators.OnboardingLocators;
//import com.novell.iprint.android.locators.GenericAndroidLocators;
//import com.novell.iprint.android.locators.PrintPageLocators;
//import com.novell.iprint.android.locators.PrintersPageLocators;
//import com.novell.iprint.android.locators.SelectPrinter_PageLocators;
//import com.novell.iprint.android.locators.SettingsPageLocator;
//
//public class IprintUtil extends IPrintAndroidInit{
//
//	public static long timeOutInSeconds = 10;
//	
//	public static void openIprint() throws Exception
//	{
//		System.out.println("Navigating through the welcome page.");
//		androidAutomationUtility.click(driver, OnboardingLocators.next);
//		androidAutomationUtility.click(driver, OnboardingLocators.next);
//		androidAutomationUtility.click(driver, OnboardingLocators.finish);	
//		//Opening the iPrint
//		if(androidAutomationUtility.waitForMobileElementVisible(driver, OnboardingLocators.accept, 30))
//		{
//			androidAutomationUtility.click(driver, OnboardingLocators.accept);
//		}
//		Thread.sleep(timeOutInSeconds);
//	}
//	
//	
//	
//	
//	public void gotoPrintersOption() throws Exception {
//		
//		//Click on Menu -> Printers
//		androidAutomationUtility.wait_and_clickMobileELement(driver, HamburgerMenuItemsLocator.sMenuIcon_XPATH, timeOutInSeconds);
//		androidAutomationUtility.wait_and_clickMobileELement(driver, HamburgerMenuItemsLocator.sButton_Printers_XPATH, timeOutInSeconds);
//	}
//	
//	public void gotoAppSettings() throws Exception 
//	{
//		//Click on Menu -> Settings
//		androidAutomationUtility.wait_and_clickMobileELement(driver, HamburgerMenuItemsLocator.sMenuIcon_XPATH, timeOutInSeconds);
//		androidAutomationUtility.wait_and_clickMobileELement(driver, HamburgerMenuItemsLocator.sButton_Settings_XPATH, timeOutInSeconds);
//		
//	}
//
//	
//	public void gotoWalkUpJobs() throws Exception {
//		if(!androidAutomationUtility.isElementPresent(driver, HomePageLocators.walkupJobsPage)) 
//		{
//			androidAutomationUtility.click(driver, HamburgerMenuItemsLocator.sMenuIcon_XPATH);
//			androidAutomationUtility.wait_and_clickMobileELement(driver, HamburgerMenuItemsLocator.sButton_WalkupJobs_XPATH, 5);
//		}
//		
//	}
//	
//	
//	public void gotoJobHistory() throws Exception 
//	{
////		if(!androidAutomationUtility.isElementPresent(driver, HomePageLocators.jobHistoryPage)) {
////			if(androidAutomationUtility.isElementPresent(driver, HamburgerMenuItemsLocator.sButton_JobHistory_XPATH)) 
////			{
////				androidAutomationUtility.click(driver, HamburgerMenuItemsLocator.sButton_JobHistory_XPATH);
////			}
////			else {
////				androidAutomationUtility.click(driver, HamburgerMenuItemsLocator.sMenuIcon_XPATH);
////				androidAutomationUtility.click(driver, HamburgerMenuItemsLocator.sButton_JobHistory_XPATH);
////			}
////		}
//		if(androidAutomationUtility.isElementPresent(driver, HamburgerMenuItemsLocator.sButton_JobHistory_XPATH)) 
//			{
//				androidAutomationUtility.click(driver, HamburgerMenuItemsLocator.sButton_JobHistory_XPATH);
//			}
//	}
//	
//	//int serverCnt = driver.findElements(By.xpath(SettingsPageLocator.serverLocator)).size();
//	//int serverCnt = driver.findElements(By.xpath(sLocator)).size();
//	//String sLoctr = SettingsPageLocator.serverName.replaceAll("num", String.valueOf(i));
//	//String sLoctr = sServerData.replaceAll("num", String.valueOf(i));
//	
//	public void addServer(AndroidDriver<AndroidElement>  driver,String sIP) throws Exception
//	{
//		
//		//androidAutomationUtility.wait_and_clickMobileELement(driver, SettingsPageLocator.buttonAddServer, timeOutInSeconds);
//		
//		// It will check which button is there to add the server and choose accordingly. 
//		System.out.println("adding server "+sIP);
//		if(androidAutomationUtility.isDisplayed(driver, SettingsPageLocator.buttonAddServer))
//		{
//			androidAutomationUtility.click(driver, SettingsPageLocator.buttonAddServer);
//		}else if(androidAutomationUtility.isDisplayed(driver, SettingsPageLocator.menuIconAddServer))
//		{
//			androidAutomationUtility.click(driver, SettingsPageLocator.menuIconAddServer);
//		}
//		androidAutomationUtility.sendText(driver, Settings_AddServerPageLocators.editTexServer, sIP);
//		androidAutomationUtility.sendText(driver, Settings_AddServerPageLocators.editTextUID, "admin");
//		androidAutomationUtility.sendText(driver, Settings_AddServerPageLocators.editTextPwd, "novell");
//		
//		//Clicking add button.
//		//driver.pressKeyCode(AndroidKeyCode.BACK);
//		androidAutomationUtility.wait_and_clickMobileELement(driver, Settings_AddServerPageLocators.buttonAdd,timeOutInSeconds);
//		if(androidAutomationUtility.waitForElementVisible(driver, Settings_AddServerPageLocators.buttonContinue, timeOutInSeconds))
//
//		{
//
//			androidAutomationUtility.click(driver,Settings_AddServerPageLocators.buttonContinue);
//
//		}
//		
//	}
//	
//	public void addServerByMenuIcon(AndroidDriver<AndroidElement>  driver,String sIP) throws Exception
//	{
//
//		//androidAutomationUtility.wait_and_clickMobileELement(driver, SettingsPageLocator.buttonAddServer, timeOutInSeconds);
//		
//	
//
//		androidAutomationUtility.click(driver, SettingsPageLocator.menuIconAddServer);
//		androidAutomationUtility.sendText(driver, Settings_AddServerPageLocators.editTexServer, sIP);
//		androidAutomationUtility.sendText(driver, Settings_AddServerPageLocators.editTextUID, "admin");
//		androidAutomationUtility.sendText(driver, Settings_AddServerPageLocators.editTextPwd, "novell");
//		
//		//Clicking add button.
//		
//		androidAutomationUtility.wait_and_clickMobileELement(driver, Settings_AddServerPageLocators.buttonAdd,timeOutInSeconds);
//		if(androidAutomationUtility.waitForElementVisible(driver, Settings_AddServerPageLocators.buttonContinue, timeOutInSeconds))
//
//		{
//
//			androidAutomationUtility.click(driver,Settings_AddServerPageLocators.buttonContinue);
//
//		}
//		
//	}
//
//
//	public static void removeServer( AndroidDriver<AndroidElement> driver, String[] NumOfServers ) throws Exception 
//	{
//		
//		int serverCnt = NumOfServers.length;
//			
//		for (int i = 1; i <= serverCnt; i++) {
//			
//			TimeUnit.SECONDS.sleep(3);
//			String sLocator = SettingsPageLocator.serverName.replaceAll("num", "1");
//			androidAutomationUtility.clickMobileELement(driver, sLocator);
//			
//			TimeUnit.SECONDS.sleep(5);
//			String sRemoveServerXPATH = SettingsPageLocator.RemoveServerTextSelect.replaceAll("num", "4");	
//			androidAutomationUtility.clickMobileELement(driver, sRemoveServerXPATH);
//			TimeUnit.SECONDS.sleep(3);
//			if(androidAutomationUtility.waitForElementVisible(driver, SettingsPageLocator.PopUpAlertActionButton1, timeOutInSeconds))
//
//			{
//				androidAutomationUtility.click(driver,SettingsPageLocator.PopUpAlertActionButton1);
//				TimeUnit.SECONDS.sleep(3);
//				
//			}			
//		}
//		
//		
//	}
//	
//	public void addMultipleServersWithUserDetails(AndroidDriver<AndroidElement>  driver, String sIPorHostName, String userID, String pwd) throws Exception  
//	{
//		androidAutomationUtility.wait_and_clickMobileELement(driver, SettingsPageLocator.buttonAddServer, timeOutInSeconds);
//
//		//Enter IP/Hostname, UN and PWD for server
//		androidAutomationUtility.sendText(driver, Settings_AddServerPageLocators.editTexServer, sIPorHostName);
//		androidAutomationUtility.sendText(driver, Settings_AddServerPageLocators.editTextUID, userID);
//		androidAutomationUtility.sendText(driver, Settings_AddServerPageLocators.editTextPwd, pwd);
//
//		//Clicking add buttton.
//		driver.pressKeyCode(AndroidKeyCode.BACK);
//		TimeUnit.SECONDS.sleep(2);
//		androidAutomationUtility.wait_and_clickMobileELement(driver, Settings_AddServerPageLocators.buttonAdd,timeOutInSeconds);
//		if(androidAutomationUtility.waitForElementVisible(driver, Settings_AddServerPageLocators.buttonContinue, timeOutInSeconds))
//
//		{
//
//			androidAutomationUtility.click(driver,Settings_AddServerPageLocators.buttonContinue);
//
//		}
//	}
//	
//	
//	public String verifyDuplicateServerDetails(AndroidDriver<AndroidElement>  driver, String iPorHost, String loginUserID, String loginPassword) throws Exception 
//	{
//		androidAutomationUtility.wait_and_clickMobileELement(driver, SettingsPageLocator.buttonAddServer, timeOutInSeconds);
//		
//		//Enter IP/Hostname, UN and PWD for server
//		androidAutomationUtility.sendText(driver, Settings_AddServerPageLocators.editTexServer, iPorHost);
//		androidAutomationUtility.sendText(driver, Settings_AddServerPageLocators.editTextUID, loginUserID);
//		androidAutomationUtility.sendText(driver, Settings_AddServerPageLocators.editTextPwd, loginPassword);
//
//		//Clicking add buttton.
//		TimeUnit.SECONDS.sleep(2);
//		androidAutomationUtility.wait_and_clickMobileELement(driver, Settings_AddServerPageLocators.buttonAdd,timeOutInSeconds);
//		if(androidAutomationUtility.waitForMobileElementVisible(driver, Settings_AddServerPageLocators.errorText, timeOutInSeconds))
//		{
//			String vExistingServerWarning = androidAutomationUtility.getText(driver, Settings_AddServerPageLocators.errorText);
//			return vExistingServerWarning;
//		}
//		return loginPassword;
//		
//		
//	}
//		
//
//
//
///*
//	public void samplePrint(IOSDriver driver) throws Exception
//	{
//		androidAutomationUtility.wait_and_clickMobileELement(driver, HomePageLocators.printIcon, timeOutInSeconds);
//		androidAutomationUtility.wait_and_clickMobileELement(driver, GenericAndroidLocators.menu1, timeOutInSeconds);
//		androidAutomationUtility.wait_and_clickMobileELement(driver, GenericAndroidLocators.drive_from_menu1, timeOutInSeconds);
//
//		//Clicking on the 0Auto folder
//		androidAutomationUtility.waitForMobileElementVisible(driver, DropBoxLocators.autoFolder, 60);
//		androidAutomationUtility.clickMobileELement(driver, DropBoxLocators.autoFolder);
//
//		//Clicking on the images folder
//		//1 -images, 2 - ms , 3 - oo, 4 - others
//
//		String sFolderName = DropBoxLocators.imagesFolder.replaceAll("num", "1");
//		androidAutomationUtility.waitForMobileElementVisible(driver, sFolderName, 60);
//		androidAutomationUtility.clickMobileELement(driver, sFolderName);
//		
//		
//	}*/
//	
//	
//	public void selectPrinter(String sPrinterName) throws Exception
//	
//	{
//		androidAutomationUtility.wait_and_clickMobileELement(driver,SelectPrinter_PageLocators.selectPrinter,30);
//
//		//Clicking on the serach  icon .
//		androidAutomationUtility.click(driver,PrintersPageLocators.searchIcon);
//		
//		androidAutomationUtility.waitForMobileElementVisible(driver, PrintersPageLocators.textBoxSrch, timeOutInSeconds);
//		androidAutomationUtility.sendText(driver, PrintersPageLocators.textBoxSrch, sPrinterName);
//
//		String sPrinterNameXPath = PrintersPageLocators.printersLabelName.replaceAll("num", "1");
//		
//		
//		androidAutomationUtility.wait_and_clickMobileELement(driver, sPrinterNameXPath, timeOutInSeconds);
//		
//		
//		
//	}
//	
//	
//   public void selectPrinterAndPrint(String sPrinterName) throws Exception
//	
//	{
//		selectPrinter(sPrinterName);
//		 
//		androidAutomationUtility.wait_and_clickMobileELement(driver, PrintPageLocators.printIcon, timeOutInSeconds);
//		
//		
//	}
//
//   public void settingsPageData() throws Exception
//   {
//	   //serversList;
//   }
//
//public static boolean addMultipleServersWithDetails(AndroidDriver<AndroidElement>  driver, String[] multiServerIPs, String loginUserID,
//		String loginPassword) throws Exception {
//	// TODO Auto-generated method stub
//	
//	iprintUtil.gotoAppSettings();
//	
//	for (String IP : multiServerIPs)
//{
//	androidAutomationUtility.wait_and_clickMobileELement(driver, SettingsPageLocator.buttonAddServer, timeOutInSeconds);
//
//	//Enter IP/Hostname, UN and PWD for server
//	androidAutomationUtility.sendText(driver, Settings_AddServerPageLocators.editTexServer, IP);
//	androidAutomationUtility.sendText(driver, Settings_AddServerPageLocators.editTextUID, loginUserID);
//	androidAutomationUtility.sendText(driver, Settings_AddServerPageLocators.editTextPwd, loginPassword);
//
//	//Clicking add buttton.
//	TimeUnit.SECONDS.sleep(2);
//	androidAutomationUtility.wait_and_clickMobileELement(driver, Settings_AddServerPageLocators.buttonAdd,timeOutInSeconds);
//	if(androidAutomationUtility.waitForElementVisible(driver, Settings_AddServerPageLocators.buttonContinue, timeOutInSeconds))
//
//	{
//
//		androidAutomationUtility.click(driver,Settings_AddServerPageLocators.buttonContinue);
//
//	}
//}
//	
//	androidAutomationUtility.click(driver, SettingsPageLocator.backButtonArrowKey1);
//	androidAutomationUtility.click(driver, SettingsPageLocator.backButtonArrowKey2);
//		
//	return true;
//	
//	
//}
//		
//		/*
//		 * this will print job from File Manager.
//		 * 
//		 * steps:
//		 * 1. Click on the print menu
//		 * 2. Click on document.
//		 * 3. Change the view 
//		 * 4. select the file and give job
//		 */
//		public void PrintJobs(AndroidDriver<AndroidElement> driver, String FileType) throws Exception {
//			System.out.println("Printing "+FileType+" file from drive");
//		 
//			selectFile(driver, FileType);
//			selctPrinterGivePrint(driver);		
//		
//		}
//		
//		/*
//		 * this will print job from gallery.
//		 * 
//		 * steps:
//		 * 1. Click on the print menu
//		 * 2. Click on document.
//		 * 3. Change the 
//		 */
//		public void PrintJobsGallery(AndroidDriver<AndroidElement> driver) throws Exception {
//			
//			System.out.println("Printing photo from gallery");
//		 
//			selectFileFormGallery(driver);
//			selctPrinterGivePrint(driver);		
//		
//		}
//		
//		public boolean verifyPrintJobs(AndroidDriver<AndroidElement> driver, String verificationText) throws Exception {
//			System.out.println("Verifying the Print Job");
//			
//			Thread.sleep(timeOutInSeconds);
//			
//			if(androidAutomationUtility.isElementPresent(driver, GenericAndroidLocators.PrintingJobStatus)) {
//				androidAutomationUtility.waitForElementNotVisible(driver, GenericAndroidLocators.PrintingJobStatus, 20);
//			}
//			androidAutomationUtility.waitForElementNotVisible(driver, GenericAndroidLocators.jobStatusPending, 30);
//			boolean JobStatusCheck =  androidAutomationUtility.getAttributeValue(driver, GenericAndroidLocators.jobStatus, "text").equalsIgnoreCase(verificationText);
//			return JobStatusCheck;
//		
//		}
//		
//		/*
//		 * gives the required permission. clicks on allow
//		 */
//		public void allowPermission(AndroidDriver<AndroidElement> driver) throws Exception{
//			
//			Thread.sleep(timeOutInSeconds);
//			System.out.println("Allowing the permission asked for.");
//			 
//			 if (androidAutomationUtility.isDisplayed(driver, GenericAndroidLocators.permissionMessage)) {
//				 androidAutomationUtility.click(driver, GenericAndroidLocators.permissionAllow);
//				}
//			 Thread.sleep(timeOutInSeconds);
//		}
//
//		
//		
//		/*
//		 * 1. Click on print button
//		 * 2. Select document
//		 * 3. change the view of google drive to list
//		 * 4. Select the file
//		 * 5. if not present scroll and select the file
//		 */
//		public void selectFile(AndroidDriver<AndroidElement> driver, String FileType) throws Exception{
//			
//			System.out.println("Selecting the "+FileType+" file from Drive");
//			
//			androidAutomationUtility.click(driver, GenericAndroidLocators.printMenu);
//			 //androidAutomationUtility.wait_and_clickMobileELement(driver, GenericAndroidLocators.print_docs, timeOutInSeconds);
//			 androidAutomationUtility.click(driver, GenericAndroidLocators.print_docs); 
//			 
//			 if (androidAutomationUtility.isDisplayed(driver, GenericAndroidLocators.listButton)) {
//					androidAutomationUtility.click(driver, GenericAndroidLocators.listButton);
//				}
//			 
//			if(androidAutomationUtility.isElementPresent(driver, FileType)) {
//				 
//				 androidAutomationUtility.wait_and_clickMobileELement(driver, FileType, 10);			 
//			 }
//			 else {
//				 androidAutomationUtility.scrollAndClick(driver, FileType);
//			 }
//			
//		}
//		
//		
//		/*
//		 * Select the printer and give print in print page
//		 * 
//		 * 1. Click on print button
//		 * 2. Select gallery
//		 * 3. select camera folder
//		 * 4. Select the file
//		 */
//		public void selectFileFormGallery(AndroidDriver<AndroidElement> driver) throws Exception{
//			
//			System.out.println("Selecting the file from Gallary");
//			androidAutomationUtility.click(driver, GenericAndroidLocators.printMenu);
//			 //androidAutomationUtility.wait_and_clickMobileELement(driver, GenericAndroidLocators.print_docs, timeOutInSeconds);
//			 androidAutomationUtility.click(driver, GenericAndroidLocators.print_gallery);
//			 androidAutomationUtility.click(driver, GenericAndroidLocators.galleryDownloadFolder);
//			 androidAutomationUtility.click(driver, GenericAndroidLocators.imageByDescription);
//			 allowPermission(driver);
//			 
//			 
//			 //need to write select file from gallery
//		}
//		
//		
//		/*
//		 * Select the printer and give print in print page
//		 * 
//		 * 1. Click on select a printer
//		 * 2. Select the 1st printer available
//		 * 3. Click on print button
//		 */
//		public void selctPrinterGivePrint(AndroidDriver<AndroidElement> driver) throws Exception{
//			Thread.sleep(timeOutInSeconds);
//			System.out.println("Selecting the printer and giving print");
//			
//			if(androidAutomationUtility.isDisplayed(driver, GenericAndroidLocators.printer_select)) {
//				 
//				 androidAutomationUtility.wait_and_clickMobileELement(driver, GenericAndroidLocators.printers_list, timeOutInSeconds);
//				 androidAutomationUtility.wait_and_clickMobileELement(driver, GenericAndroidLocators.printer_selected, timeOutInSeconds);
//			 }
//			 
//			 //androidAutomationUtility.wait_and_clickMobileELement(driver, GenericAndroidLocators.print_button, timeOutInSeconds);
//			 androidAutomationUtility.click(driver, GenericAndroidLocators.print_button);
//			 Thread.sleep(timeOutInSeconds);
//			 
//		}
//		
//		/*
//		 * Add server
//		 * Select the printer and give print in print page
//		 * 
//		 * 1. Click on select a printer
//		 * 2. Select the 1st printer available
//		 * 3. Click on print button
//		 */
//		public void selctPrinterGivePrint(AndroidDriver<AndroidElement> driver, String sIP) throws Exception{
//			Thread.sleep(timeOutInSeconds);
//			System.out.println("Selecting the printer by adding a new server");
//			if(androidAutomationUtility.isDisplayed(driver, GenericAndroidLocators.printer_select)) {
//				
//				 androidAutomationUtility.click(driver, GenericAndroidLocators.printer_select);
//				 addServer(driver, sIP);
//				 androidAutomationUtility.wait_and_clickMobileELement(driver, GenericAndroidLocators.printers_list, timeOutInSeconds);
//				 androidAutomationUtility.wait_and_clickMobileELement(driver, GenericAndroidLocators.printer_selected, timeOutInSeconds);
//			 }
//			 
//			 //androidAutomationUtility.wait_and_clickMobileELement(driver, GenericAndroidLocators.print_button, timeOutInSeconds);
//			 androidAutomationUtility.click(driver, GenericAndroidLocators.print_button);
//			 Thread.sleep(timeOutInSeconds);
//			 
//		}
//		
//		/*
//		 * Written By Bairagi
//		 * 
//		 * This will drive to the google drive, select the user and goes inside the print folder inside google drive. 
//		 * then give a print job so that it will stay on the same page 
//		 */
//		public void googleDriveSetup(AndroidDriver<AndroidElement> driver) throws Exception {
//			 System.out.println("opening the google drive and setting the default path to print folder ");
//			 
//			 if(androidAutomationUtility.isDisplayed(driver, GenericAndroidLocators.printMenu))
//			 {
//				 androidAutomationUtility.click(driver, GenericAndroidLocators.printMenu);
//			 }
//			 androidAutomationUtility.click(driver, GenericAndroidLocators.print_docs);
//			 androidAutomationUtility.click(driver, GenericAndroidLocators.rootImageButton);
//			 androidAutomationUtility.click(driver, GenericAndroidLocators.googleDriveButton);
//			 androidAutomationUtility.click(driver, GenericAndroidLocators.myDriveFolder);
//			 androidAutomationUtility.click(driver, GenericAndroidLocators.allIn1FileFormatFolder);
//			 androidAutomationUtility.click(driver, GenericAndroidLocators.newFileFormatFolder);
//			 if (androidAutomationUtility.isDisplayed(driver, GenericAndroidLocators.listButton)) {
//				androidAutomationUtility.click(driver, GenericAndroidLocators.listButton);
//			}
//			 androidAutomationUtility.click(driver, PrintJobsLocator.docFile);
//
//			 allowPermission(driver);
//			 selctPrinterGivePrint(driver);
//			 androidAutomationUtility.click(driver, HamburgerMenuItemsLocator.sButton_JobHistory_XPATH);
//			 
//			 System.out.println("Google Drive setup done. ");
//			 
//		}
//		
//		/*
//		 * Written By Bairagi
//		 * 
//		 * This will drive to the file manager, select the user and goes inside the print folder inside google drive. 
//		 * then give a print job so that it will stay on the same page 
//		 */
//		public void fileManagerSetup(AndroidDriver<AndroidElement> driver) throws Exception {
//			 System.out.println("opening the local drive and setting the default path to print folder ");
//			 
//			 androidAutomationUtility.click(driver, GenericAndroidLocators.printMenu);
//			 androidAutomationUtility.click(driver, GenericAndroidLocators.print_docs);
//			 androidAutomationUtility.click(driver, GenericAndroidLocators.moreOptions);
//			 
//			 if(androidAutomationUtility.isDisplayed(driver, GenericAndroidLocators.showInternalStorage)) {
//				 androidAutomationUtility.click(driver, GenericAndroidLocators.showInternalStorage);
//			 }
//			 else androidAutomationUtility.clickBack(driver);
//			 
//			 androidAutomationUtility.click(driver, GenericAndroidLocators.showRoot);
//			 androidAutomationUtility.click(driver, GenericAndroidLocators.deviceFolder);
//			 androidAutomationUtility.click(driver, GenericAndroidLocators.allFileFormatFolder);
//			 if (androidAutomationUtility.isDisplayed(driver, GenericAndroidLocators.listButton)) {
//				androidAutomationUtility.click(driver, GenericAndroidLocators.listButton);
//			}
//			 androidAutomationUtility.click(driver, PrintJobsLocator.docFile);
//
//			 allowPermission(driver);
//			 Thread.sleep(timeOutInSeconds);
//			 androidAutomationUtility.clickBack(driver);
//			
//			 System.out.println("File Manager setup done. ");
//			 
//		}
//   
//   
//}
