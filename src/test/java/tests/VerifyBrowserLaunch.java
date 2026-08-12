package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class VerifyBrowserLaunch extends BaseTest{
	@Test
	public void verifyBrowserLaunchTest() {
		String title = driver.getTitle();
		System.out.println("Page title: "+title);
		Assert.assertTrue(title.contains("Myntra"));
	}

}
