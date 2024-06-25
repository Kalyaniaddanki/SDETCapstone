
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
		   // Enter valid username and valid password

		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(user);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pass);
		Thread.sleep(1000);
		// click on submit button
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		 WebElemennt cart = driver.findElement(By.xpath("//*[@data-icon='shopping-cart']"));
		 WebElemennt addToCartButton = driver.findElement(By.xpath("(//button[contains(text(),'ADD TO CART')])[1]"));
		
		// stores the title of the home page		
	String title=driver.findElement(By.xpath("//div[@class='app_logo']")).getText();
		// valiadte the title of the home page page after user navigate to home page
	Assert.assertTrue(title.contains("Swag Labs"));
		// check whether cart is displayed or not
	Assert.assertTrue(cart.isDisplayed());
		// check whether add to cart button is dispayed
	Assert.assertTrue(addToCartButton.isDisplayed());
	
	
	
	}
	

}
