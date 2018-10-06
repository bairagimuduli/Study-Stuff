package com.novell.iprint.android.locators;


public class PrintersPageLocators {


	public static String labelPrinter = "//android.view.ViewGroup[@resource-id='com.novell.iprint.android:id/toolbar']/android.widget.TextView";
	public static String searchIcon = "//android.widget.TextView[@content-desc='Search Printer']";

	public static String buttonPLus = "//android.widget.ImageButton[@resource-id='com.novell.iprint.android:id/fab_add_server']";
    public static String textBoxSrch = "//android.widget.EditText[@resource-id='com.novell.iprint.android:id/searchEditText']";

    public static String printersLabel = "//android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[num]";
    										
    public static String printersList = "//android.support.v7.widget.RecyclerView";
      
    public static String printersLabelName = printersLabel + "//android.widget.TextView[1]";
    public static String printersLabelLocation = printersLabel + "//android.widget.TextView[2]";
    public static String printersLabelDescription = printersLabel + "//android.widget.TextView[3]";
    
    //Sometimes untrusted certificate popup comes, XPATH to handle that.
    
    public static String buttonContinue = "//android.widget.Button[@resource-id='android:id/button1']";
	public static String buttonCancel = "//android.widget.Button[@resource-id='android:id/button2']";
	
	
	//*[@class='android.widget.RelativeLayout' and ./*[@class='android.widget.RelativeLayout' and ./*[@id='printerTypeImg'] ]]		//this is a test
			
	
	public static String selectServerToShowPrinters = "//android.widget.ListView/android.widget.CheckedTextView[num]";
	
    //Printer Details - Click on Printers
    
    
   // "//android.widget.RelativeLayout"
    
    
    public static String iPrintServerName = "//android.widget.LinearLayout[@resource-id='com.novell.iprint.android:id/printServerLayout']/android.widget.TextView[2]";
    
    
    
    
    public static String printerName = "" ;
    public static String location = "";
    public static String description = "";
 
    
/*    public static String printerListFirstElement = //android.support.v7.widget.RecyclerView
    		
    public static String printerServersTopMenuList_Spinner = */
    



}
