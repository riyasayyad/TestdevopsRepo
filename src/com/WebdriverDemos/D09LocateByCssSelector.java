package com.WebdriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D09LocateByCssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     
     driver.get("https://www.facebook.com/");
     WebElement emailid= driver.findElement(By.cssSelector("input[type=\"text\"]"));
     emailid.sendKeys("rohit@gmail.com");
     WebElement password= driver.findElement(By.cssSelector("input[type=\"password\"]"));
     password.sendKeys("Raisa@123");
	WebElement login=driver.findElement(By.cssSelector("button[type=\"submit\"]"));
          login.click();
	
	}

}
