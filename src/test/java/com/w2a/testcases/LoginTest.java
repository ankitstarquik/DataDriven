package com.w2a.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.*;

import com.w2a.base.TestBase;

public class LoginTest extends TestBase{

	
	@Test
	public void loginAsBankManager() throws InterruptedException {
		log.debug("Inside login test");
		driver.findElement(By.cssSelector(OR.getProperty("bmlBtn_CSS"))).click();
		Thread.sleep(3000);
		
		log.debug("Login successfully executed!!!");
		System.out.println(System.getProperty("user.dir"));
		
	}
}
