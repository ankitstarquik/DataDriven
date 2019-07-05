package com.w2a.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;

import com.w2a.base.TestBase;

public class LoginTest extends TestBase{

	
	@Test
	public void login() throws InterruptedException {
		log.debug("Inside login test");
		driver.findElement(By.cssSelector(OR.getProperty("bmlBtn_CSS"))).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(OR.getProperty("email"))).sendKeys("ankitjain.vt@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(OR.getProperty("pwd"))).sendKeys("123456");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(OR.getProperty("submit"))).click();
		Thread.sleep(3000);
		
		Assert.assertTrue(isElementPresent(By.cssSelector(OR.getProperty("welcome"))),"Login not Successful");
		
		
		log.debug("Login successfully executed!!!");
		
	}
}
