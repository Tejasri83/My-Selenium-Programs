package com.selenium.java;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchingIEbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "C:\\Selenium\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		InternetExplorerDriver driver=new InternetExplorerDriver();
		driver.get("Http://amazon.com.com");
		driver.manage().window().maximize();
	}

}
