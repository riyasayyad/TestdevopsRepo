package com.WebdriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D04ReadURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver driver= new ChromeDriver();
      driver.get("https://www.amazon.in/");
      
      String url = driver.getCurrentUrl();
      System.out.println("URL:" +url);
      
      driver.close();
		
	}

}
