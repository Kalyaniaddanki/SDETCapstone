
package com.portal.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class InvalidLogin extends Base {
	@Test
	@Parameters({"invaliduser","invalidpass"})	
	public void portal_login_invalid(String invaliduser,String invalidpass) throws InterruptedException {
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(invaliduser);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(invalidpass);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(1000);		
	
	Assert.assertTrue(driver.findElement(By.xpath("//button[@class='error-button']")).isDisplayed());
	
}}
