package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
public class HomePageTest extends BaseTest{
	@Test
	public void verifyMyntraLogo() {
		HomePage homePage = new HomePage(driver);
		Assert.assertTrue(homePage.isLogoDisplayed(),"Myntra logo is displayed");
		}
	
	@Test
	public void navigateToMen() {
		HomePage homePage = new HomePage(driver);
		homePage.clickMen();
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.myntra.com/shop/men","Men Page was not opened");
	}
	}

