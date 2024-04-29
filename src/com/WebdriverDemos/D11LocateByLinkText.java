package com.WebdriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D11LocateByLinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		WebElement link=driver.findElement(By.linkText("Gmail"));
		System.out.println("link is :"+ link );
	
		link.click();
		driver.close();
	}

}
