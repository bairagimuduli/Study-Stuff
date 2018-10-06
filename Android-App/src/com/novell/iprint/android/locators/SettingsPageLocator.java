package com.novell.iprint.android.locators;

public class SettingsPageLocator {

	public static String  menuIcon = "//android.widget.ImageButton[@content-desc='Open navigation drawer']";
	public static String settingIcon = "//android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[4]/android.widget.CheckedTextView";
	public static String printerIcon = "//android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[3]/android.widget.CheckedTextView";
									
	public static String buttonAddServer = "//*[@id='add_server_button']";
	public static String menuIconAddServer = "//*[@id='fab_add_server']";
	

	//gallery 
	
	public static String settingAddServer = "//*[@text='ADD SERVER']";
	public static String proxyActive = "//*[@id='proxy_switchWidget']";
	public static String logEvent = "//*[@id='switchWidget' and ./preceding-sibling::*[./*[@text='Log Events']]]";

	
	/*public static String serverLocator = "//android.widget.Button[@resource-id='android:id/title']/../prceeding-sibling::android.widget.RelativeLayout";
	public static String serverName = serverLocator + "[num]//android.widget.TextView[1]";*/
	
	public static String serverLocator = "//android.support.v7.widget.RecyclerView/android.widget.RelativeLayout";
	public static String serverName = serverLocator + "[num]//android.widget.TextView[2]";
	
	public static String ServerInfoTextLayout = "//android.support.v7.widget.RecyclerView/android.widget.RelativeLayout";
	
	
	public static String RemoveServerTextSelect = ServerInfoTextLayout + "[num]//android.widget.TextView[1]";	
	public static String textViewRemoveServer = "//android.widget.TextView[@resource-id='android:id/title']";
												
	public static String ClearPasswordTextSelect = ServerInfoTextLayout + "[num]//android.widget.TextView[2]";
	
	
	public static String ServerStatusSwitchLayout = ServerInfoTextLayout + "[num]//android.widget.Switch[@resource-id='com.novell.iprint.android:id/switchWidget']";
	
	
												
	public static String PopUpAlertActionButton1 = "//android.widget.Button[@resource-id='android:id/button1']";
	public static String PopUpAlertActionButton2 = "//android.widget.Button[@resource-id='android:id/button2']";
	
	
	public static String unTrustedCertAlertTitle = "//android.widget.TextView[@resource-id='com.novell.iprint.android:id/alertTitle']";
	public static String unTrustedCertAlertBody = "//android.widget.TextView[@resource-id='android:id/message']";
	
	
	

	
	
	public static String ServerAddressesxPath = "//android.support.v7.widget.RecyclerView";
	public static String ServerAddressText1 =  ServerAddressesxPath +"//android.widget.Button[@resource-id='android:id/title']/preceding::android.widget.TextView[4]";
	public static String ServerAddressText2 =  "//android.widget.Button[@resource-id='android:id/title']/preceding::android.widget.TextView[2]";
	
	//public static String ServerAddressText1 =  "//android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/following::android.widget.TextView[1]";
	//public static String ServerAddressText2 =  "//android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[2]/preceding::android.widget.TextView[2]";
	
	public static String IPAddress3 = "//android.widget.Button[@resource-id='android:id/title']/preceding::android.widget.RelativeLayout[1]";
	public static String IPAddress4 = "//android.widget.Button[@resource-id='android:id/title']/preceding::android.widget.RelativeLayout[2]";

	//android.widget.RelativeLayout[1]";
	//android.widget.RelativeLayout[2]";
    public static String photoIcon = "//android.widget.ImageButton[@resource-id='com.novell.iprint.android:id/fab_menu_gallery']";
    public static String docIcon = "//android.widget.ImageButton[@resource-id='com.novell.iprint.android:id/fab_menu_docs']";
    public static String backButtonArrowKey1= "//android.widget.ImageButton[@content-desc='Navigate up']";
    public static String backButtonArrowKey2="//android.widget.ImageButton[@content-desc='Close navigation drawer']";
    
    
    
}
