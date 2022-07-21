package com.qa.demo.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest {

	@Test
	public void HomeTest() {
		String homePageTitle = "Welcome to Login Page";
		Assert.assertEquals(homePageTitle, "Welcome to Home Page");
	}
}
