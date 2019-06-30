package com.w2a.testcases;

import org.testng.annotations.*;

import com.w2a.base.TestBase;

public class AddCustomerTest extends TestBase{
	
	@Test(dataProvider ="getData")
	public void addCustomer() {
		
	}

	
	@DataProvider
	public Object[][] getData(){
		return null;
		
	}
}
