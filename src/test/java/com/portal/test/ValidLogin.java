
package com.portal.test;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import org.openqa.selenium.By;

public class ValidLogin extends Base {
	
	@Test
	@Parameters({"validuser","validpass"})	
	public void portal_login_valid(String user,String pass) throws InterruptedException {
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(user);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pass);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
				
	String title=driver.findElement(By.xpath("//div[@class='app_logo']")).getText();
	Assert.assertTrue(title.contains("Swag Labs"));
	System.out.println(driver.getTitle());
	
	
	
	}
	

}
