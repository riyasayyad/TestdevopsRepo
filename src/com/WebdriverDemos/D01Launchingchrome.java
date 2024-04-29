package com.WebdriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D01Launchingchrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //open blank browser.
		WebDriver driver = new ChromeDriver();
		//open the url.
		driver.get("https://www.google.com");
		//maximize the browser.
		driver.manage().window().maximize();
		//close the browser windows which is opened by webDriver object.
		driver.close();
		
	}

}
