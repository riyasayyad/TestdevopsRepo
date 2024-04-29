package com.WebdriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D12LocateByPartialLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com/");

WebElement Partiallink =driver.findElement(By.partialLinkText("Ad"));
System.out.println("partiallink is :"+Partiallink);
Partiallink.click();
driver.close();
	}

}
