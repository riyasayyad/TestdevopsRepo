package com.TestNGDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PracticeTestLoginPOM {
	WebDriver driver;

	public PracticeTestLoginPOM(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public void addUserName(String un)
	{
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(un);
	}
	public void addPassword(String ps)
	{
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(ps);
	}
	public void clickLogin()
	{
		driver.findElement(By.xpath("//button[@id='submit']")).click();
	}
	public void showMessage()
	{
		System.out.println(driver.findElement
				(By.xpath("//h1[@class='post-title']")).getText());
	}
	public void logout()
	{
		driver.findElement(By.partialLinkText("Log")).click();
	}

}
