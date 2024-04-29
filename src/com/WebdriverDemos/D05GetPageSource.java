package com.WebdriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D05GetPageSource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
driver.get("https://www.amazon.in/");
		String sourceurl =driver.getPageSource();
		System.out.println(sourceurl);
		driver.close();
	}

}
