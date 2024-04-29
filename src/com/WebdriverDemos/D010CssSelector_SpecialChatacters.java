package com.WebdriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D010CssSelector_SpecialChatacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		// check  any word contains or not.
		WebElement emailid = driver.findElement(By.cssSelector("input[aria-label*=\"or phone\"]"));
		emailid.sendKeys("test@123");
		//endswith $
		WebElement password = driver.findElement(By.cssSelector("input[aria-label$=\"word\"]"));
		password.sendKeys("12345678");
		//startswith ^
		WebElement loginbtn= driver.findElement(By.cssSelector("button[id^=\"u_0_5\"]"));
       loginbtn.sendKeys(Keys.ENTER);
	}

}
