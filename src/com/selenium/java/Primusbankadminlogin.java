package com.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Primusbankadminlogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("Http://primusbank.qedgetech.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
	//driver.findElement(By.tagName("a")).click();
	//driver.findElement(By.linkText("Branches")).click();
	//driver.findElement(By.tagName("a")).click();


	}

}
