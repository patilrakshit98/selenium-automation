package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import pages.SearchPage;

public class SearchTest extends BaseTest{

	@Test
	public void searchProduct() {
		HomePage homePage = new HomePage(driver);
		SearchPage searchPage = new SearchPage(driver);
		
		homePage.enterSearchText("Nike Shoes");
		Assert.assertTrue(searchPage.areProductsDisplayed(),"Search results are not displayed");
	}
	

}
