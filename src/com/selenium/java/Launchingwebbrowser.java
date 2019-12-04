package com.selenium.java;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launchingwebbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("Http://gmail.com");
		driver.manage().window().maximize();
		

	}

}
