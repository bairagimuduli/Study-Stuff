package com.novell.iprint.android.locators;

public class GoogleDriverLocators {
	
	public static String driveIcon = "//android.widget.TextView[@content-desc=\"Drive\"]";
	public static String appIcon = "//android.widget.TextView[@content-desc=\"Apps\"]";
	public static String imagesFolder = "//android.widget.FrameLayout[contains(@content-desc,'images')]/android.widget.RelativeLayout/android.widget.TextView";
	public static String AutoFolder = "//android.widget.FrameLayout[contains(@content-desc,'0Auto')]/android.widget.RelativeLayout/android.widget.TextView";
	public static String resourceLocator = "//android.widget.FrameLayout[contains(@content-desc,'sample.bmp')]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.TextView";
	public static String resourceLocatorMoreOption = resourceLocator + "/following::android.widget.ImageView[@content-desc=\"More actions\"]";

	
	public static String firstImageLoctr = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.widget.ImageView[1]";
	public static String buttonAllow = "//android.widget.Button[@id='com.android.packageinstaller:id/permission_allow_button']";
	
}
