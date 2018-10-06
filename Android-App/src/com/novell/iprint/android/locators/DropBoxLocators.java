package com.novell.iprint.android.locators;

public class DropBoxLocators {

	public static String dropBoxIcon = "//android.widget.TextView[@content-desc=\"Dropbox\"]";
	//	public static String dropBoxIcon = "//android.widget.TextView[@content-desc=\"Dropbox\"]";
	public static String autoFolder = "//android.support.v7.widget.RecyclerView[@content-desc=\"Dropbox\"]/android.view.ViewGroup[1]/android.widget.TextView";
	//   public static String othersFolder =  ;
	public static String imagesFolder = "//android.support.v7.widget.RecyclerView[@content-desc=\"0Auto\"]/android.view.ViewGroup[num]/android.widget.TextView" ;
	public static String resourceLocatorMoreOption = "(//android.widget.ImageView[@content-desc=\"list_item_right_side_image\"])[num]";

	public static String export = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[9]/android.widget.TextView";
//	public static String loctrMicrofocusPrint = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout/android.widget.TextView[contains(text(),'Micro Focus iPrint')]";
	public static String loctrMicrofocusPrint = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[4]/android.widget.TextView";
	
	public static String loctr = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[num]/android.widget.TextView";
	public static String selectPrinter = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView[2]";
	public static String firstPrinterInTheList = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.TextView";
	public static String microfocusPrintButton = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageButton";
	
	
	
	public static String sDropBoxShare = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[num]/android.widget.TextView";
}
