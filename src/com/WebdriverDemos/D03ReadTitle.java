package com.WebdriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D03ReadTitle {
	public static void main(String[] args) {
		String expectedTitle = "Online Shopping Site for Fashion, Electronics, Home & More | Meesho", actualTitle;
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.meesho.com/");
		driver.manage().window().maximize();
		actualTitle = driver.getTitle();
		System.out.println("Title is :" + actualTitle);

		if (expectedTitle.equals(actualTitle)) {

			System.out.println("Title matching!!! Test case pass");

		} else if (actualTitle.contains("mee")) {

			System.out.println("Title matching!!!! Test case pass");

		}

		else {

			System.out.println("Title not matching!!! Test case fail");

		}

		driver.close();

	}

}
