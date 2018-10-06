package com.novell.iprint.android.locators;

public class GenericAndroidLocators {
	
	public static String menu1 = "//android.widget.ImageButton[@content-desc='Show roots']";
    public static String drive_from_menu1 = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[4]/android.widget.LinearLayout";
	public static String myDrive = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.TextView";


	public static String printMenu = "//*[@class='android.widget.ImageButton' and ./parent::*[@id='fab_menu']]";
//	public static String printMenu = "//*[@class='android.widget.ImageView']";

	
	public static String print_docs = "//*[@id='fab_menu_docs']";
	public static String print_gallery = "//*[@id='fab_menu_gallery']";
	
	public static String gallery1stFolder = "(//*[@class='android.support.v7.widget.RecyclerView']/*[@class='android.widget.RelativeLayout'])[1]";
	public static String gallery2ndFolder = "(//*[@class='android.support.v7.widget.RecyclerView']/*[@class='android.widget.RelativeLayout'])[2]";
	
	public static String galleryCameraFolder = "//*[@class='android.widget.RelativeLayout' and ./*[@text='Camera']]";
	public static String galleryDownloadFolder = "//*[@class='android.widget.RelativeLayout' and ./*[@text='Download']]";
	
//	public static String imageByDescription = "//*[@contentDescription='Photo taken on Sep 26, 2018 6:12:05 PM.']";
	public static String imageByDescription = "//*[@bounds='[0,280][349,629]']";
	
	//*[@bounds='[0,280][349,629]']
	
	public static String printer_select = "//*[@text='Select a Printer']";
	public static String printers_list = "//*[@id='printerNameView']";
	
	//public static String printer_selected = "(//*[@id='printerListRecylerView']/*/*[@class='android.widget.RelativeLayout' and ./*[@text] and ./*[@id='printerLocationView']])[1]";
	
	public static String printer_selected = "//*[@class='android.widget.RelativeLayout' and ./*[@class='android.widget.RelativeLayout']]";
	
	public static String print_button = "//*[@id='fab_print']";
	
	public static String permissionMessage = "//*[@id='permission_message']";
	
	public static String permissionAllow = "//*[@id='permission_allow_button']";
	
	public static String permissionDeny = "//*[@id='permission_deny_button']";
	
	public static String textFileJob = "(//*[@id='jobHistoryRecylerView']/*/*[@class='android.widget.RelativeLayout' and ./*[@id='fileIconLayout']])[1]";
	
	public static String jobStatus = "(//*[@id='jobHistoryRecylerView']/*/*/*/*/*[@id='jobStatus'])[1]";

	public static String PrintingJobStatus = "//*[@text='CANCEL']";

	public static String jobStatusPending = "//*[@text='Pending']";
	
	public static String rootImageButton = "//*[@contentDescription='Show roots']";
	public static String googleDriveButton = "//*[@text='printhatke@gmail.com']";
	public static String myDriveFolder = "//*[@text='My Drive']";
	public static String allIn1FileFormatFolder = "//*[@text='All in 1 - file formats']";
	public static String newFileFormatFolder = "//*[@text='New file formats']";
	public static String gridButton = "//*[@id='menu_grid']";
	public static String listButton = "//*[@id='menu_list']";
	
	public static String backButton = "//*[@id='back']";
	public static String homeButton = "//*[@id='home']";
	public static String recentAppsButton = "//*[@id='recent_apps']";
	
	
//	this is locators to set the file folder to local storage "All file format " folder.
	
	public static String moreOptions = "//*[@contentDescription='More options']";
	public static String showInternalStorage = "//*[@text='Show internal storage']";
	public static String showRoot = "//*[@contentDescription='Show roots']";
	public static String deviceFolder = "(//*[@id='roots_list']/*[./*[./*[@id='summary']]])[1]";
	public static String allFileFormatFolder = "//*[@text='All file format']";
	
	
	//*[@text='All file format']
	
}
