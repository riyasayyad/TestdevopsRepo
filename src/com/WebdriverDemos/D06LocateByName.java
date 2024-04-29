package com.WebdriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D06LocateByName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			WebDriver driver = new ChromeDriver();

			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			// read/find the control whose name is "email" and store it in email id object.
			WebElement emailId = driver.findElement(By.name("email"));
			emailId.sendKeys("riyasayyad12@gmail.com");
			// password
			WebElement password = driver.findElement(By.name("pass"));
			password.sendKeys("12345678");
			WebElement login = driver.findElement(By.name("login"));


	}

}
