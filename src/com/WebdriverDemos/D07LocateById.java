package com.WebdriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D07LocateById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement emailId= driver.findElement(By.id("email"));
		emailId.sendKeys("riyasayyad12@gmail.com");
		WebElement passWord= driver.findElement(By.id("pass"));
		passWord.sendKeys("12345678");
		WebElement login= driver.findElement(By.name("login"));
		login.click();
		
	//	driver.close();
		
		
	}

}
