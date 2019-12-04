package com.selenium.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KsrtclinkssizeAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("Http://ksrtc.in");
		driver.manage().window().maximize();
		List <WebElement> links=driver.findElements(By.tagName("a"));
		
		for (int i = 0; i < links.size(); i++) {
			
			//System.out.println(links.get(i).getText());
			if (links.get(i).getText().equals("New User Register"))
			{
				links.get(i).click();
			}
			}
	/*driver.findElement(By.id("email")).sendKeys("saikamal.b@gmail.com");
	driver.findElement(By.id("fullName")).sendKeys("SaiKamal");
	driver.findElement(By.id("mobileNo")).sendKeys("3098686069");
	driver.findElement(By.name("SaveBtn")).click();
	*/
	
	}
	
		

	}

	

