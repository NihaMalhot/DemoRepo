package com.qa.demo.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest {
	
	@Test
	public void HomeTest() {
		String homePageTitle = "Welcome to Home Page";
		Assert.assertEquals(homePageTitle, "Welcome to Home Page");
	}

}
