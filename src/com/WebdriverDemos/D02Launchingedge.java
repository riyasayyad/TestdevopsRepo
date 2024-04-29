package com.WebdriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import graphql.schema.diffing.Edge;

public class D02Launchingedge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= (WebDriver) new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.close();
	}

}
